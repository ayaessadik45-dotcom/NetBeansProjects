package ud2;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números");

        do {
            numero = sc.nextInt();

            if (numero != 0) {
                suma = suma + numero;
                contador++;
            }

        } while (numero != 0);

        double promedio = (double) suma / contador;

        System.out.println("Promedio = " + promedio);
    }
}