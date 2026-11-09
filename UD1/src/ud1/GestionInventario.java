package ud1;
public class GestionInventario {
public static void main(String[] args) {

// Variables del inventario
int cantidadPociones = 5;
double precioUnitario = 10.5;
boolean mochilaLlena = false;

// Oro disponible
double oroTotal = 100.0;

// Compra de 3 pociones
int pocionesCompradas = 3;
double costeCompra = pocionesCompradas * precioUnitario;

// Actualizar inventario y oro
cantidadPociones += pocionesCompradas;
oroTotal -= costeCompra;

// Mostrar estado final
System.out.println("=== Estado final del jugador ===");
System.out.println("Cantidad de pociones: " + cantidadPociones);
System.out.println("Precio unitario: " + precioUnitario + " monedas de oro");
System.out.println("Oro restante: " + oroTotal);
System.out.println("Mochila llena: " + mochilaLlena);
}
}