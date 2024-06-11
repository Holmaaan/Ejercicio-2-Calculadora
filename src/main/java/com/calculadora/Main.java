package com.calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Expresiones Matemáticas");
        System.out.print("Ingrese una expresión: ");
        String expresion = scanner.nextLine();

        try {
            double resultado = calculadora.evaluar(expresion);
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error al evaluar la expresión: " + e.getMessage());
        }

        scanner.close();
    }
}
