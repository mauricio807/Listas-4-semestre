/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv;

import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class AtvSALADate22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name= JOptionPane.showInputDialog("Informe o seu nome");
       String idade= JOptionPane.showInputDialog(null,"Informe a sua idade",JOptionPane.QUESTION_MESSAGE);
       int idades = Integer.parseInt(idade);
       if (idades >=18){
           String message= String.format(name);
            String messagem= String.format("Você já pode tirar a CNH");
            JOptionPane.showMessageDialog(null,message);
            JOptionPane.showMessageDialog(null,messagem);
    }
       else{
           String Ncnh= String.format("Você AINDA não pode tirar a CNH " +name+ " Você tem apenas " +idade+ " anos");
           JOptionPane.showMessageDialog(null,Ncnh);
       }
    
}
}