/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_tres;

import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class Ejercicio_tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero_uno = scanner.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero_dos = scanner.nextInt();
        
        if(numero_uno % numero_dos == 0) {
            System.out.println(numero_uno + " es multiplo de " + numero_dos);
        }else { System.out.println(numero_uno + " no es multiplo de " + numero_dos);
        
        }
    }
    
}
