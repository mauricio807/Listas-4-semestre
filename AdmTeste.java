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
public class AdmTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pessoa p=new Pessoa
         Empregado e= new Empregado();
        Administrador a = new Administrador();
        String nome = JOptionPane.showInputDialog("informe o seu nome");
        String sexo = JOptionPane.showInputDialog("informe o seu sexo");
        String idade = JOptionPane.showInputDialog("informe sua idade");
        String altura = JOptionPane.showInputDialog("informe sua altura");
        String salario = JOptionPane.showInputDialog("Informe o seu salario");
        String ajd = JOptionPane.showInputDialog("Informe a ajuda de custo");
        
        p.setNome(nome);
        p.setSexo(sexo);
        p.setIdade(Integer.parseInt(idade));
        p.setAltura(Float.parseFloat(altura));
        e.setSalario(Float.parseFloat(salario));
        a.setAjudaDeCustos(Float.parseFloat(ajudasDeCusto));
        
        JOptionPane.showMessageDialog(null, (p.toString()));
        JOptionPane.showMessageDialog(null, "Lucro: " + a.obterLucros());
    }
    
}
