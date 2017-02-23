/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.logica;

/**
 *
 * @author adaza
 */
public class Calculadora {
    private int numero1;
    private int numero2;
    private int resultado;
    
  

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int getResultado() {
        return resultado;
      
    }
    
    
    
    public void sumar(){
        this.resultado = this.numero1 + this.numero2;
    }
    
    public void restar(){
        this.resultado = this.numero1 - this.numero2;
    }
    
    public void multiplicar(){
        this.resultado = this.numero1 * this.numero2;
    }
    
    public void dividir(){
        this.resultado = this.numero1 / this.numero2;
    }
    
}
