package ud2;

import java.util.Scanner;

public class Ejercicio19_coregido {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int contador= 1;
         final int PIN =2580;
         while (contador <=3 || PIN != 2580) {
        System.out.print("introduzca PIN de acceso : ");
   
        int numero =sc.nextInt();
        if (numero==PIN){
             System.out.println("PIN es correcto");
        }else{
            System.out.println("PIN es incorrecto");
            }
                    contador++;
                       
        }        
    }
 }