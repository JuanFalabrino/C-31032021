
package libreria;

public class programas {
   //private final int programa;
   private int kilos = 0,tipoderopa = 0,llenadocompleto = 1, lavadocompleto = 0, secadocompleto =  0;
        
   public programas(int prog, int peso){
   this.tipoderopa = prog;
   this.kilos = peso;
   }
    
   private void llenado(){
     llenadocompleto = 0;
       if(kilos<=12){
           llenadocompleto = 1;
           System.out.println("Llenado.....");
           System.out.println("Llenado Completo");
      }else {
            System.out.println("La carga supera el peso maximo del lavarropas");
            
       }
   }
   private void lavado(){
    llenado();
    if (llenadocompleto==1){
       switch(tipoderopa)
       {
               case 1:
                System.out.println("Lavado Suave la lana.");
                System.out.println("Lavando .....");
                lavadocompleto=1; 
                break;
               
               case 2:
                System.out.println("Lavado ropa muy sucia .");
                System.out.println("Lavando .....");
                System.out.println("Lavando .....");
                System.out.println("Lavando .....");
                lavadocompleto=1; 
               break;
               
               case 3:
               System.out.println("Lavado en economico .");
               System.out.println("Lavando .....");
               System.out.println("Lavando .....");
               lavadocompleto=1; 
               break;
               
               case 4:
               System.out.println("Lavado ropa de bebe.");
               System.out.println("Lavando muy suave .....");
               lavadocompleto=1; 
               break;
               
               default:
               System.out.println("No existe el programa seleccionado");
               break;
       }
    }else {
    System.out.println("NO ES POSIBLE INICIAR EL LAVADO");
    
    } 
    
    }
   

   private void secado(){
       lavado();
       if(lavadocompleto==1){
          System.out.println("SECANDO.....");
          secadocompleto = 1;
       }else {
    System.out.println("NO ES POSIBLE INICIAR EL SECADO");
    
    } 
      
   }
   
     
   public void display(){
       secado();
       if(secadocompleto == 1){
       System.out.println("TU ROPA ESTA LISTA ");
       }      
    
   
   }
   
   
   

    
}
