package ud1;
public class CalculoDescuento {
    public static void main(String[] args) {

        final double DESCUENTO = 0.15;
        double precioArmadura = 120.0;

        double importeDescuento = precioArmadura * DESCUENTO;
        double precioFinal = precioArmadura - importeDescuento;

        System.out.println("Precio original: " + precioArmadura + " créditos");
        System.out.println("Descuento aplicado: " + (DESCUENTO * 100) + "%");
        System.out.println("Precio final: " + precioFinal + " créditos");
    }
}
