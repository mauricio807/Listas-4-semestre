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
public class Administrador extends Empregado {
    protected float ajudasDeCusto;
    
      public void setAjudaDeCustos(float c){
        this.ajudasDeCusto = c;
    }
    public double getAjudaDeCusto(){
        return this.ajudasDeCusto;
    }
    
    public double obterlucro(){
       return (getSalario() + getAjudaDeCusto()); 
    }
    public Administrador(){
        
    }
    
}
