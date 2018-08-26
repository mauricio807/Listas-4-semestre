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
public class Fornecedor extends Pessoa {
     private double creditoMaximo;
    private double valorEmDivida; 

    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }
    public double obterSaldo(double valor){
        valor=creditoMaximo-valorEmDivida;
        return valor;
    }

   public Fornecedor(double valorEmDivida, double creditoMaximo){
        setCreditoMaximo(creditoMaximo);
        setValorEmDivida(valorEmDivida);
    }
    public double obterSaldo(){
        return (getCreditoMaximo() - getValorEmDivida());
    }
    public Fornecedor(){
    
    }
    
    
}
