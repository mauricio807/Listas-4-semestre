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
public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = JOptionPane.showInputDialog("Informe o NOME  ");
        String idade = JOptionPane.showInputDialog("Informe a Idade  ");
        String altura = JOptionPane.showInputDialog("Informe a Altura");
        String sexo = JOptionPane.showInputDialog("Informe o Sexo  ");
        String salario = JOptionPane.showInputDialog("Informe o Salario");
        
        Pessoa p = new Pessoa();
        Empregado e = new Empregado();
       
        p.setNome(nome);
        p.setSexo(sexo);
        p.setIdade(Integer.parseInt(idade));
        p.setAltura(Float.parseFloat(altura));
        e.setSalario(Float.parseFloat(salario));

        
         JOptionPane.showMessageDialog(null, (p.toString()));
        JOptionPane.showMessageDialog(null, "Lucro: " + (e.obterLucro()));


        
    }
    
    
}
