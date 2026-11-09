package ejercicio;

public class Ejercicio3 {

   
    public static double calcularElImporte(double precio, double descuento, double pocentaje) {
       double precioDescuento = precio *(1- ( descuento/ 100);
       double 
        return precio * descuento / 100; 
    }

    public static void main(String[] args) {
        double precio = 30.5;
        double descuento = 20;
        
        // Llamamos al método y guardamos el resultado
        double resultado = calcularElImporte(precio, descuento);
        System.out.println("El importe aplicando el descuento es: " + resultado);
    }
}