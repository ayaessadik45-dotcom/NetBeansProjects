package ejercicio;

public class Ejercicio4 {

    // 1. Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // 2. Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // 3. Método para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // 4. Método para dividir (tratando el divisor cero)
    public static double dividir(double a, double b) {
           if (b==0){
        System.out.println("¡Error! No se puede dividir entre cero." );
           return 0;
    }else{     
        return a / b;
        }
}
    // Método principal para probarlo todo
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0; 

        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
        System.out.println("Multiplicación: " + multiplicar(a, b));
        System.out.println("División: " + dividir(a, b));
    }
}
