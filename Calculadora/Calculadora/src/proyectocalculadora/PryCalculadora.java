/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

import java.util.Scanner;
import logica.Calculadora;

/**
 *
 * @author adaza
 */
public class PryCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opt = leerOpcion();
        String operador = "";
        System.out.println("ingrese un entero");
        c.setNumero1(sc.nextInt());
        System.out.println("ingrese otro entero");
        c.setNumero2(sc.nextInt());
        switch (opt){
            case 1:
                c.sumar();
                operador = " + ";
                break;
            case 2:
                c.restar();
                operador = " - ";
                break;
            case 3:
                c.multiplicar();
                operador = " x ";
                break;
            case 4:
                c.dividir();
                operador = " / ";
                break;
        }        
        System.out.println(c.getNumero1() + operador + c.getNumero2() + 
                " = " + c.getResultado());
    }
    
    public static int leerOpcion(){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        while (opcion < 1 || opcion > 4){
           System.out.println("1. sumar");
           System.out.println("2. restar");
           System.out.println("3. multiplicar");
           System.out.println("4. dividir");
           opcion = sc.nextInt();
        }
        
        return opcion;
    }
    
}
