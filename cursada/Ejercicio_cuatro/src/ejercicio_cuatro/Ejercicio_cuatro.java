/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_cuatro;

import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class Ejercicio_cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        
        for (int i=1; i < 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado );
        }   
        
    }
    
}
