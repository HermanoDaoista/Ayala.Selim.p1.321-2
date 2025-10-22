/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_nueve;

import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class Ejercicio_nueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letra;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introdusca una letra: ");
        letra = scanner.nextLine();
        
        switch (letra) {
            case "a" -> System.out.println("Es vocal ");
            case "e" -> System.out.println("Es vocal ");
          
            case "i" -> System.out.println("Es vocal ");

            case "o" -> System.out.println("Es vocal ");

            case "u" -> System.out.println("Es vocal ");
            default -> System.out.println("NO es vocal ");
                                        
        
        
        }
    }
    
}
