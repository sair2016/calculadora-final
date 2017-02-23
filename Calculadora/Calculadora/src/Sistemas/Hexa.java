/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistemas;

/**
 *
 * @author sair
 */
public class Hexa extends logica.Calculadora{
 
   public int Decimal(String s){
       return Integer.parseInt(s,16);
   }
    
  public String Hexal (int num1){
      return Integer.toHexString(num1);
  }   
}
