package ud2;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("ingresa n numero= ");
        int suma = 0;
        int numero;
         numero =  teclado.nextInt();
        for (int num = 1; num <= 100; num++) {
            if (num % 2== 0) {
                suma = suma +num;
                System.out.println ("la suma inversa de los numeros= " + suma);
    

            }
        }
}
    }