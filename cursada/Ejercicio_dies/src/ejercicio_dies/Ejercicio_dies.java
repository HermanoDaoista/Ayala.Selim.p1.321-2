/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_dies;

import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class Ejercicio_dies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lados;
        
        System.out.println("Intordusca un numero entero mayor a uno: ");
        lados = scanner.nextInt();
        
        if (lados < 2) {
                 System.out.println("ERROR Intordusca un numero entero mayor a uno: ");

        }else {
                  for (int i = 0; i < lados; i++) {
                          if (i == 0 || i == lados -1) {
                              for (int j = 0; j < lados; j++){
                                  System.out.print("*");
                              } 
                          } 
                          else {
                                   System.out.print("*");
                                   for (int j = 0; j < lados - 2; j++) {
                                            System.out.print(" ");
 
                                   }
                                   System.out.print("*");

                          }
                          System.out.println();

                  }  
        } 
        
    }
    
}
