package UD3;

import java.util.Scanner;

public class Ejercicio6 {

    static Scanner sc = new Scanner(System.in);

    // Solicita una nota y la devuelve
    public static double leerNota() {
        System.out.print("Introduce una nota: ");
        return sc.nextDouble();
    }

    // Calcula la media de las tres notas
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Obtiene la nota más alta
    public static double obtenerNotaMaxima(double nota1, double nota2, double nota3) {
        double maxima = nota1;

        if (nota2 > maxima) {
            maxima = nota2;
        }

        if (nota3 > maxima) {
            maxima = nota3;
        }

        return maxima;
    }

    // Indica si está aprobado
    public static boolean estaAprobado(double media) {
        return media >= 5;
    }

    // Muestra el informe final
    public static void mostrarResultados(double media, double maxima, boolean aprobado) {
        System.out.println("--- INFORME ACADÉMICO ---");
        System.out.println("Media: " + media);
        System.out.println("Nota máxima: " + maxima);
        System.out.println("¿Aprobado?: " + aprobado);
    }

    // Método principal
    public static void main(String[] args) {

        double nota1 = leerNota();
        double nota2 = leerNota();
        double nota3 = leerNota();

        double media = calcularMedia(nota1, nota2, nota3);
        double maxima = obtenerNotaMaxima(nota1, nota2, nota3);
        boolean aprobado = estaAprobado(media);

        mostrarResultados(media, maxima, aprobado);

    }
}