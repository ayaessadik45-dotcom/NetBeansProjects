package ud2;
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = sc.nextInt();

            suma = suma + numero; // Acumula la suma

        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
    }
}