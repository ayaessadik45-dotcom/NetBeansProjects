package ejercicio;

import java.util.Scanner;

public class explicacion {

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

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("MENÚ");
        System.out.println("1. Multiplicar dos enteros");
        System.out.println("2. Multiplicar tres enteros");
        System.out.println("3. Multiplicar dos decimales");
        System.out.print("Elige una opción: ");

        int opcion = teclado.nextInt();

        switch (opcion) {

            case 1:
                System.out.print("Introduce el primer entero: ");
                int a = teclado.nextInt();

                System.out.print("Introduce el segundo entero: ");
                int b = teclado.nextInt();

                System.out.println("Resultado: " + multiplicar(a, b));
                break;

            case 2:
                System.out.print("Introduce el primer entero: ");
                int x = teclado.nextInt();

                System.out.print("Introduce el segundo entero: ");
                int y = teclado.nextInt();

                System.out.print("Introduce el tercer entero: ");
                int z = teclado.nextInt();

                System.out.println("Resultado: " + multiplicar(x, y, z));
                break;

            case 3:
                System.out.print("Introduce el primer decimal: ");
                double n1 = teclado.nextDouble();

                System.out.print("Introduce el segundo decimal: ");
                double n2 = teclado.nextDouble();

                System.out.println("Resultado: " + multiplicar(n1, n2));
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}

      
 