/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_dos;

import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class Ejercicio_dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 1; i <= numero; i++){
        
            resto = i % 2;
            if(resto == 0){
                System.out.println(i);
            }
       }
    }
    
}
