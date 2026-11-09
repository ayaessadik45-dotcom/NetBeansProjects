package UD3;

import java.util.Scanner;

public class Ejercicio7 {

    // Sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    // Potencia
    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    // Raíz cuadrada
    public static double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada");
        System.out.print("Elige una opción: ");

        int opcion = teclado.nextInt();

        double a, b;

        switch (opcion) {

            case 1:
                System.out.print("Primer número: ");
                a = teclado.nextDouble();
                System.out.print("Segundo número: ");
                b = teclado.nextDouble();
                System.out.println("Resultado: " + sumar(a, b));
                break;

            case 2:
                System.out.print("Primer número: ");
                a = teclado.nextDouble();
                System.out.print("Segundo número: ");
                b = teclado.nextDouble();
                System.out.println("Resultado: " + restar(a, b));
                break;

            case 3:
                System.out.print("Primer número: ");
                a = teclado.nextDouble();
                System.out.print("Segundo número: ");
                b = teclado.nextDouble();
                System.out.println("Resultado: " + multiplicar(a, b));
                break;

            case 4:
                System.out.print("Primer número: ");
                a = teclado.nextDouble();
                System.out.print("Segundo número: ");
                b = teclado.nextDouble();
                System.out.println("Resultado: " + dividir(a, b));
                break;

            case 5:
                System.out.print("Base: ");
                a = teclado.nextDouble();
                System.out.print("Exponente: ");
                b = teclado.nextDouble();
                System.out.println("Resultado: " + potencia(a, b));
                break;

            case 6:
                System.out.print("Número: ");
                a = teclado.nextDouble();
                System.out.println("Resultado: " + raizCuadrada(a));
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}