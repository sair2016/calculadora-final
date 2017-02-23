/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistemas;

/**
 *
 * @author Estudiantes
 */
public class Bina extends logica.Calculadora {

   public int Decimal(String s){
       return Integer.parseInt(s,2);
   }
    
  public String binario (int num1){
      return Integer.toBinaryString(num1);
  } 
}
