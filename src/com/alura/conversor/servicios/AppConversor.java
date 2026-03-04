package com.alura.conversor.servicios;

import com.alura.conversor.modelos.Historial;
import com.alura.conversor.modelos.Tasas;
import java.util.*;

public class AppConversor {
    private final Scanner lectura = new Scanner(System.in);
    private final ExchangeRateAPIClient clienteAPI = new ExchangeRateAPIClient();
    private final List<Tasas> registro = new ArrayList<>();

    private static final String[][] PARES = {
            {},
            {"USD", "CLP"},
            {"CLP", "USD"},
            {"USD", "VES"},
            {"VES", "USD"},
            {"CLP", "VES"},
            {"VES", "CLP"}
    };

    public void iniciar() {
        int opcion = 0;
        while (opcion != 7) {
            mostrarMenu();
            opcion = leerOpcion();

            if (opcion >= 1 && opcion <= 6) {
                ejecutarConversion(PARES[opcion][0], PARES[opcion][1]);
            } else if (opcion != 7) {
                System.out.println("\nOpción no válida.");
            }
        }
        finalizar();
    }

    private void ejecutarConversion(String base, String target) {
        System.out.println("Ingrese monto en " + base + ":");
        try {
            double cantidad = lectura.nextDouble();
            Tasas resultado = clienteAPI.resultadoDeConversion(base, target, cantidad);
            System.out.printf("%.2f %s equivalen a %.2f %s%n\n",
                    cantidad, base, resultado.conversion_result(), target);
            registro.add(resultado);
        } catch (Exception e) {
            System.out.println("Error en la conversión.");
            lectura.next();
        }
    }

    private void mostrarMenu() {
        System.out.println("""
                ***************************************************************
                1. USD [US Dollar]              🠚     CLP [Peso Chileno]
                2. CLP [Peso Chileno]           🠚     USD [US Dollar]
                3. USD [US Dollar]              🠚     VES [Bolivar Venezolano]
                4. VES [Bolivar Venezolano]     🠚     USD [US Dollar]
                5. CLP [Peso Chileno]           🠚     VES [Bolivar Venezolano]
                6. VES [Bolivar Venezolano]     🠚     CLP [Peso Chileno]
                7. Finalizar
                ****************************************************************
                """);
    }

    private int leerOpcion() {
        try {
            return lectura.nextInt();
        }
        catch (Exception e) {
            lectura.next(); return -1;
        }
    }

    private void finalizar() {
        Historial historial = new Historial();
        historial.guardarHistorial(registro);
        System.out.println("Su historial de conversiones:");
        historial.mostrarHistorial(registro);
        System.out.println("\n¡Gracias por usar el conversor!");
    }
}
