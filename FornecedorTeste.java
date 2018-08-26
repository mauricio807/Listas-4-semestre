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
public class FornecedorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Pessoa p = new Pessoa();
        Empregado e= new Empregado();
        Fornecedor f = new Fornecedor();
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo");
        String idade = JOptionPane.showInputDialog("Digite a sua idade");
        String altura = JOptionPane.showInputDialog("Digite a sua altura");
        String salario = JOptionPane.showInputDialog("Digite o seu salario");
        String creditoMaximo = JOptionPane.showInputDialog("Digite o crédito máximo");
        String valorEmDivida = JOptionPane.showInputDialog("Digite o valor em divida");
        
        p.setNome(nome);
        p.setSexo(sexo);
        p.setIdade(Integer.parseInt(idade));
        p.setAltura(Float.parseFloat(altura));
        e.setSalario(Float.parseFloat(salario));
        f.setCreditoMaximo(Double.parseDouble(creditoMaximo));
        f.setValorEmDivida(Double.parseDouble(valorEmDivida));
        
         JOptionPane.showMessageDialog(null,"Altura:"+p.getAltura());
        JOptionPane.showMessageDialog(null,"Idade:"+p.getIdade());
        JOptionPane.showMessageDialog(null,"Sexo:"+p.getSexo());
        JOptionPane.showMessageDialog(null,"Lucro:"+e.obterLucro());
}    
}        
    

