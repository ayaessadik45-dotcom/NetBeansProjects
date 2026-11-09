package ud2;

public class ejercicio2 {

    public static void main(String[] args) {
  
        String usuario= "Fran";
        final String USUARIO_CORRECTO = "Aya";
                //si el usuario introducido coincide con USUARIO_CORRECTO
                //Le damo la bienvenida, en otro caso, coninua el programa
        if (usuario == USUARIO_CORRECTO){
        System.out.println("¡Bienvenido " + usuario + "!");
        }else{
            System.out.println("Usuario Incorrecto");
            System.out.println("FIN");
            int numero1= 12;
            int numero2= 16;
            if (numero1 < numero2){
                System.out.print("correcto");
            }else{
                System.out.print("incorrecto");
                
            }
                }
    }
    
}
