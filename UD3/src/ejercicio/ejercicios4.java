package ejercicio;

import java.util.Scanner;

public class ejercicios4 {

    // Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double b = sc.nextDouble();

        System.out.println("\nMENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Resultado: " + sumar(a, b));
                break;

            case 2:
                System.out.println("Resultado: " + restar(a, b));
                break;

            case 3:
                System.out.println("Resultado: " + multiplicar(a, b));
                break;

            case 4:
                System.out.println("Resultado: " + dividir(a, b));
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}