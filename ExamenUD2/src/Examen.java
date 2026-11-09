package ExamenUD2;

import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el código de autorización
        System.out.print("Introduce el código de autorización: ");
        int codigo = sc.nextInt();

        // Procesar el código mediante switch
        switch (codigo) {

            case 1:
                System.out.println("Acceso concedido: Sector Central");
                break;

            case 2:
                System.out.println("Acceso concedido: Hangar de Carga");
                System.out.print("Introduce el tonelaje de carga: ");
                int toneladas = sc.nextInt();

                // Comprobar si necesita inspección aduanera
                if (toneladas > 500) {
                    System.out.println("Requiere inspección aduanera");
                } else {
                    System.out.println("Carga dentro de los límites permitidos");
                }
                break;

            case 3:
                System.out.println("Acceso restringido: Enviar escolta");
                break;

            case 4:
                System.out.println("¡ALERTA! Iniciar protocolos de defensa");
                break;

            default:
                System.out.println("Código no válido");
        }
    }
}