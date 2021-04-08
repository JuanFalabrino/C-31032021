
package pkg31032021drean;

import java.util.Scanner;
import libreria.programas;

public class Main {

    public static void main(String[] args) {
        
        Scanner programa = new Scanner(System.in);
   
        System.out.println("------ Bienvenido a DREAN ----");
        System.out.println("------ Seleccione el tipo ----");
        System.out.println("--(1) LANA  Drean         ----");
        System.out.println("--(2) ROPA DE TRABAJO     ----");
        System.out.println("--(3) CUIDAR AL PLANETA   ----");
        System.out.println("--(4) SOY PAPA            ----");
        System.out.println("---------------------------------");
        System.out.print(":");
        int prog = programa.nextInt();
        System.out.print("Indique la cantidad de prendas(En enteros):");
        int peso = programa.nextInt();
        
       programas mensajero = new programas(prog,peso);
       
       if (prog == 4) {
       mensajero.settipoderopa(1);
       System.out.print("Indico el programa: " + prog +  " Soy PAPA");
       System.out.println("por configuración debo ejecutar el programa : " + mensajero.gettipodetopa() );
       }
       
       if (peso >=12 ){
        if (peso <=20){
         mensajero.setKilos(12);
         System.out.print("Indico el peso: " + peso );
         System.out.println("por configuración debo ejecutar por el peso  : " + mensajero.getKilos() );
         
        }    
      }
       
       
       mensajero.display();
    }
    
}
