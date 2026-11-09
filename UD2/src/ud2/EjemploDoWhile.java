package ud2;

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        do {
            System.out.println("Numero: " + numero);
            numero++;
        } while (numero <= 3);
        System.out.println("Fin del programa.");
    }
}
