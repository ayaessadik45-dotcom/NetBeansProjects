package ExamenUD2;

import java.util.Scanner;

public class Examen2 {
    public static void main(String[] args) {
// El sistema va impezar en 100 y va sumando 1 de 1 "++" y cuando va a llegar a 150 se para porque no puede ser mayor "<= 150"
        for (int frecuencia = 100; frecuencia <= 150; frecuencia++) {

            //  Si la frecuencia es divisible entre 5 se consideran "Frecuencias saturadas" utilizamos el modulo "%" y "== 0" para ver si es divisible, si no da 0 significa que no es divisible.
            if (frecuencia % 5 == 0) {
               // utilizamos "continue" para saltar ese paso sin imprimirse nada
                continue;
            }

            // Ponemos si la frecuencia es 137 significa que ha encontrado "Frecuencia de socorro"
            if (frecuencia == 137) {
                System.out.println("¡Frecuencia de socorro 137 hallada! Deteniendo el escaneo.");
                break;
            }

            // Y para todos los demas se imprime "Sintonizando frecuencia"
            System.out.println("Sintonizando frecuencia: " + frecuencia);
        }
    }
}