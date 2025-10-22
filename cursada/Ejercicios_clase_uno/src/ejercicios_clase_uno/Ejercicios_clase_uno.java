/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_clase_uno;

import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class Ejercicios_clase_uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        
        System.out.println("Usted se llama " + nombre + " y su edad es de " + numero + " anios");
    }
    
}
