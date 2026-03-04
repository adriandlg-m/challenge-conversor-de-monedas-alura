package com.alura.conversor.main;
import com.alura.conversor.servicios.AppConversor;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t\t--- CONVERSOR DE DIVISAS ---\n");
        AppConversor app = new AppConversor();
        app.iniciar();
    }
}