package ud2;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Introduce el lado c: ");
        double c = scanner.nextDouble();

        // Comprobar si forman un triángulo:
        // La suma de las longitudes de dos cualesquiera debe ser mayor que la del tercero.
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Sí pueden formar un triángulo.");

            if (a == b && b == c) {
                System.out.println("Es un triángulo Equilátero (todos los lados iguales).");
            } else if (a == b || a == c || b == c) {
                System.out.println("Es un triángulo Isósceles (dos lados iguales).");
            } else {
                System.out.println("Es un triángulo Escaleno (ningún lado igual).");
            }
        } else {
            System.out.println("Los valores introducidos NO pueden formar un triángulo.");
        }

    }
}