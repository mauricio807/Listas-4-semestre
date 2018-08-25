/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author mauri
 */
public class Cocker extends Dog{
    
    private boolean tosa;

    public Cocker(String cor, String tipo) {
        super(cor, tipo);
    }
    
    public Cocker(){
        
    }
     
    public  boolean  getTosa () {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    
   
   
    public boolean precisaTosa() {
      return(getTosa());
}
}