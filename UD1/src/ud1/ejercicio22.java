
package ud1;

    import java.util.Scanner;

public class ejercicio22{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        boolean esMayorDeEdad = edad >= 18;

        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);

  
    }
}


