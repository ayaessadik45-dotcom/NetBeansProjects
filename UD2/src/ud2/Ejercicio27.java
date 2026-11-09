package ud2;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        boolean esPrimo = true;
       
       

        if (numero <= 1) {
            esPrimo = false;
        } else {
            int i = 2;
                while (i< numero && esPrimo){
                    
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
                 i++ ;
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}
   