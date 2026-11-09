package ud2;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int multiplicar= 1;
        do {
            System.out.print("ingresa un numero para multiplicar : ");
            numero = sc.nextInt();

            multiplicar = multiplicar * numero; // Acumula la multiplicacion

        } while (numero <= 10);

        System.out.println("La multiplicacion es : " + multiplicar);
    }
}