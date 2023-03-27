/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_guia2;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_3_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String texto;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        texto = leer.nextLine();
        
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());
    }
    
}
