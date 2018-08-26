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
public class Vendedor extends Empregado {
     private double valorVendas, comissao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao(){
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double obterLucros(){
        return getSalario()+(getValorVendas()*(getComissao()/20));
    }
    
}
