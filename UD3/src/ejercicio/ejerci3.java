package ejercicio;

public class Ejercicio3 {

    // Método para calcular cuánto dinero se resta por descuento
    public static double calcularDescuento(double precio, double porcentajeDescuento) {
        return precio * (porcentajeDescuento / 100);
    }

    // Método para calcular cuánto dinero se suma por IVA
    public static double calcularIVA(double precio, double porcentajeIVA) {
        return precio * (porcentajeIVA / 100);
    }

    public static void main(String[] args) {
        double precioBase = 100.0;
        double descuento = 20.0; // 20%
        double iva = 21.0;       // 21%

        // 1. Calculamos las cantidades en euros
        double dineroDescuento = calcularDescuento(precioBase, descuento);
        double dineroIVA = calcularIVA(precioBase, iva);

        // 2. Calculamos el precio final (Precio - Descuento + IVA)
        double precioFinal = precioBase - dineroDescuento + dineroIVA;

        // 3. Mostramos los resultados por pantalla
        System.out.println("Precio base: " + precioBase + "€");
        System.out.println("Descuento (" + descuento + "%): -" + dineroDescuento + "€");
        System.out.println("IVA (" + iva + "%): +" + dineroIVA + "€");
        System.out.println("----------------------------------------");
        System.out.println("El precio final a pagar es: " + precioFinal + "€");
    }
}