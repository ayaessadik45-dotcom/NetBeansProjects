/**
 * CalculadoraCombustible
 * 
 * Vamos a programar una programa que calcula la cantidad de combustible necesaria
 * para el lanzamiento del cohete Artemis-X, añadiendo una
 * reserva de seguridad y generando valores oficiales para
 * compras y presupuestos mediante casting explícito.
 */
public class EEXAMEN1 {

    public static void main(String[] args) {

        // Constantes del programa
        final double CONSUMO_POR_KM = 14.75;
        final int RESERVA_SEGURIDAD = 500;

        // Variables
        int distanciaKm = 4800;
        double precioLitro = 2.35;

        // Vamos a calcular el cálculo de los litros totales exactos
        double litrosTotalesExactos =(distanciaKm * CONSUMO_POR_KM) + RESERVA_SEGURIDAD;

        // Ahora vamos a calcular el cálculo del coste total exacto
        double costeTotalExacto = litrosTotalesExactos * precioLitro;

        // Casting explícito para truncar los decimales
        int litrosOficialesComprar = (int) litrosTotalesExactos;
        int costePresupuestado = (int) costeTotalExacto;

        // Informe por consola
        System.out.println(" INFORME DE COMBUSTIBLE - ARTEMIS-X");

        System.out.println("Distancia a la estación: " + distanciaKm + " km");
        System.out.println("Consumo por km: " + CONSUMO_POR_KM + " litros");
        System.out.println("Reserva de seguridad: " + RESERVA_SEGURIDAD + " litros");

        System.out.println("Litros totales exactos: " + litrosTotalesExactos);
        System.out.println("Coste total exacto: " + costeTotalExacto + " €");

        System.out.println("Litros oficiales a comprar: " + litrosOficialesComprar + " litros");
        System.out.println("Coste presupuestado: " + costePresupuestado + " €");

    }
}