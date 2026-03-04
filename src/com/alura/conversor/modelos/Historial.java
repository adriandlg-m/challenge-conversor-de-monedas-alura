package com.alura.conversor.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.util.List;

public class Historial {
    public void guardarHistorial(List<Tasas> registro) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try (FileWriter escritor = new FileWriter("com.alura.conversor.modelos.Historial.json")) {
            escritor.write(gson.toJson(registro));
        } catch (Exception e) {
            System.out.println("Error al guardar el historial: " + e.getMessage());
        }
    }

    public void mostrarHistorial(List<Tasas> registro) {
        for (Tasas tasa : registro) {
            System.out.printf("\nDe %s a %s: Tasa de cambio = %.4f, Resultado = %.2f%n",
                    tasa.base_code(), tasa.target_code(),
                    tasa.conversion_rate(), tasa.conversion_result());
        }
    }
}
