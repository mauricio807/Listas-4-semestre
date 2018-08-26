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
public class VendedorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa();
        Empregado e = new Empregado();
        Vendedor v = new Vendedor();
        String nome = JOptionPane.showInputDialog("Informe o seu nome");
        String sexo = JOptionPane.showInputDialog("Inorme o seu sexo");
        String idade = JOptionPane.showInputDialog("Informe a sua idade");
        String altura = JOptionPane.showInputDialog("Informe sua altura");
        String vendas = JOptionPane.showInputDialog("Informe o valor das vendas:");
        String comissao = JOptionPane.showInputDialog("Informee a comissão:");
        p.setNome(nome);
        p.setSexo(sexo); 
        p.setIdade(Integer.parseInt(idade));
        p.setAltura(Float.parseFloat(altura));
        v.setValorVendas(Double.parseDouble(vendas));
        v.setComissao(Double.parseDouble(comissao));
        JOptionPane.showMessageDialog(null, "lucro: " + v.obterLucros());
            
        
        
        
    }
    
}
