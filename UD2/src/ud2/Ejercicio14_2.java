package ud2;
import java.util.Scanner;

public class Ejercicio14_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        int contador = 1;

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= num);

        
    }
}