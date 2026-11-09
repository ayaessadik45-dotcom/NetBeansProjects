/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud1;

/**
 *
 * @author 05_1DAW
 */
public class Ejercicio266 {

    public static void main(String[] args) {

        // Expresión 1
        boolean resultado1 = (10 + 5 * 2 > 20) && (4 == 4);
        System.out.println("1. (10 + 5 * 2 > 20) && (4 == 4) = " + resultado1);
        
        // Expresión 2
        boolean resultado2 = !(7 + 3 > 10) || (3 * 2 <= 6);
        System.out.println("2. !(7 + 3 > 10) || (3 * 2 <= 6) = " + resultado2);

        // Expresión 3
        boolean resultado3 = (10 / 2 + 3 * 5 == 20) && true;
        System.out.println("3. (10 / 2 + 3 * 5 == 20) && true = " + resultado3);
        
        // Expresión 4
        int x = 5;
        x += 3 * 2;
        System.out.println("4. int x = 5; x += 3 * 2; -> x = " + x);

        // Expresión 5
        boolean b = false;
        b = !b || 7 % 2 == 1;
        System.out.println("5. boolean b = false; b = !b || 7 % 2 == 1; -> b = " + b);
    }
}
