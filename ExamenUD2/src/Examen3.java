package ExamenUD2;

import java.util.Scanner;

public class Examen3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // la bateria vale 10 o va empezar desde 10, y el ciclo vale 0
        int bateria = 10;
        int ciclos = 0;
        
// decimos mientra que la bateria es menor que 100, va pasar lo siguiente.
        while (bateria < 100) {

            System.out.println("Batería actual es: " + bateria + "%");
            System.out.print("¿cuántos puntos de energía desea inyectar (un entero entre 1 y 30)?: ");
            int energia = sc.nextInt();
// Decimos si el punto que has introducido es menor que 1 o mayor que 30 te dice que la entrada no es invalida y te pide otra vez el valor 
            if (energia < 1 || energia > 30) {
                System.out.println("Entrada inválida");
                continue;
            }
//Sumar la energía introducida a la batería
            bateria += energia;
             // Va aumentando de 1 a uno  el número de ciclos de recarga
            ciclos++;
        }

        System.out.println("Batería completada: " + bateria + "%");
        System.out.println("Número total de ciclos de recarga: " + ciclos);

    }
}