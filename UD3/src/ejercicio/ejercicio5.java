package UD3;

import java.util.Scanner;

public class ejercicio5 {
     // 1. Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // 2. Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Multiplicar dos enteros
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Multiplicar tres enteros
    public static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    // Multiplicar dos decimales
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

        Scanner teclado = new Scanner(System.in);
        
         System.out.println("MENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar dos enteros");
        System.out.println("4. Multiplicar tres enteros");
        System.out.println("5. Multiplicar dos decimales");
        System.out.println("4. Dividir");
        System.out.print("Elige una opción: ");

        int opcion = teclado.nextInt();

        switch (opcion) {

             case 1:
                System.out.println("Resultado: " + sumar(a, b));
                break;

            case 2:
                System.out.println("Resultado: " + restar(a, b));
                break;
            case 3:
                System.out.print("Introduce el primer entero: ");
                int a = teclado.nextInt();

                System.out.print("Introduce el segundo entero: ");
                int b = teclado.nextInt();

                System.out.println("Resultado: " + multiplicar(a, b));
                break;

            case 4:
                System.out.print("Introduce el primer entero: ");
                int a = teclado.nextInt();

                System.out.print("Introduce el segundo entero: ");
                int b = teclado.nextInt();

                System.out.print("Introduce el tercer entero: ");
                int c = teclado.nextInt();

                System.out.println("Resultado: " + multiplicar(a, b, c));
                break;

            case 5:
                System.out.print("Introduce el primer decimal: ");
                double a = teclado.nextDouble();

                System.out.print("Introduce el segundo decimal: ");
                double b = teclado.nextDouble();

                System.out.println("Resultado: " + multiplicar(a, b));
                break;

            case 6:
                System.out.println("Resultado: " + dividir(a, b));
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}
