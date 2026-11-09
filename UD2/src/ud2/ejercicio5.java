package ud2;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int anio = scanner.nextInt();

        // Un año es bisiesto si es divisible entre 4,
        // excepto si es divisible entre 100, a menos que también sea divisible entre 400.
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es bisiesto.");
        } else {
            System.out.println(anio + " no es bisiesto.");
        }
        scanner.close();
    }
} 