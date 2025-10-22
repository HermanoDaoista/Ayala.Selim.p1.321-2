     /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_siete;

import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class Ejercicio_siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        int ingreso;
         System.out.println("introdusca su edad: ");

        edad = scanner.nextInt();
         System.out.println("introdusca su ingreso: ");

        ingreso = scanner.nextInt();
        
        if (edad > 20 && ingreso > 150000) {
            System.out.println("aprueba para el credito");
        }else {
            System.out.println("NO aprueba para el credito");

        }
        
        
        
    }
    
}
