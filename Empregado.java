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
public class Empregado extends Pessoa {
    
   protected float salario;

    public float getSalario() {
        return salario;
    }
    
   public Empregado(){
        
   }
    
    public void setSalario(float salario) {
        this.salario = salario;
          
    }
   public float obterLucro(){
        return getSalario();
    }

}
