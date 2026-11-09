package ud2;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer número (a): ");
        int a = sc.nextInt();
        System.out.print("Introduzca el segundo número (b): ");
        int b = sc.nextInt();

        // Implementación del diagrama de flujo para calcular el MCD
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("El resultado (MCD) es: " + a);
    }
}