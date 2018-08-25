/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class TesteCocker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         String tipo=  JOptionPane.showInputDialog(null, "Qual o tipo do Animal" );
         String cor=  JOptionPane.showInputDialog(null, "Qual a cor do Animal" );
         String nome=  JOptionPane.showInputDialog(null, "Qual o nome do Cachorro" );
         String raca=  JOptionPane.showInputDialog(null,  "Qual a Raça do Cachorro" );
         String tosa=  JOptionPane.showInputDialog(null, "O animal precisa de Tosa?" );
         
         Animal a = new Animal();
         Dog d = new Dog();
         Cocker c = new Cocker();
         
          a.setTipo(tipo);
          a.setCor(cor);
          d.setNome(nome);
          d.setRaca(raca);
        
         JOptionPane.showMessageDialog(null,""+a.toString()+"");
         JOptionPane.showMessageDialog(null,""+d.toString()+"");
         
         
         if("sim".equals(tosa)){
            c.setTosa(true); 
                       } else {
               c.setTosa(false);
               JOptionPane.showMessageDialog(null,""+c.precisaTosa()+"");
    }   
    }
}