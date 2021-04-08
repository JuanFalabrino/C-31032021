
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
       if(getKilos()<=12){
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
          switch(tipoderopa)
            {
             case 1:
                System.out.println("SECANDO SUAVE.....");
                secadocompleto = 1;
                break;
             case 2:
                System.out.println("SECANDO FUERTE.....");
                secadocompleto = 1;
               break;
               
               case 3:
               System.out.println("SECADO ECONOMICO COLGAR AL SOL");
               secadocompleto = 1;
               break;
               
               case 4:
               System.out.println("SECANDO MUY SUAVE");
                secadocompleto = 1;
               break;
               
               default:
               System.out.println("No existe el programa seleccionado");
               break;   
          
            }
           
           
           
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
   
      public int gettipodetopa(){
       return tipoderopa;
   }
   public void settipoderopa(int tipoderopa2){
       this.tipoderopa = tipoderopa2;
   }

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }
   
   

    
}
