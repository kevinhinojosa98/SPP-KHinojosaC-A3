/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.khinojosac.a3;
import java.util.Scanner;
/**
 *
 * @author Kevin Hinojosa
 */
public class SPPKHinojosaCA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
        System.out.println("Calculadora de funciones trigonométricas");
        double valor = 0; 
        double angulo; 
        
        angulo = teclado.nextDouble();
        
        double anguloRadianes = Math.toRadians(angulo);

       
        valor = Math.cos(anguloRadianes);
        System.out.println("Coseno de "  + angulo + "º = " + valor);
        
        valor = Math.tan(anguloRadianes);
        System.out.println("Tangente de " + angulo + "º =" + valor);
        
        valor = Math.sin(anguloRadianes);
        System.out.println("Seno de " + angulo + "º =" + valor);
        
        
        
      
        // TODO code application logic here
    }
    
}
