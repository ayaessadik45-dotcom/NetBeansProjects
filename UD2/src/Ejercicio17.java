package ud2;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i: " + i);

        }
    }
}