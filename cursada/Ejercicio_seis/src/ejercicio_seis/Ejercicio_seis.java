/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_seis;

import java.util.Scanner;


public class Ejercicio_seis {

    
    public static void main(String[] args) {
        
        int numero;
        String mensaje = "mete los numeros:  ";
        String mensajeError = "pero bien mete los numeros  ";
        int maximo = 24;   
        int minimo = -1;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println(mensaje);
            numero = scanner.nextInt();
            if (numero < minimo || numero > maximo) {
                  System.out.println(mensajeError);
            }
        }  while(numero < minimo || numero > maximo);
        
        if (numero < 13 && numero > 5) {
            System.out.println("buen dia");
        } else if (numero < 21 && numero > 12) {
            System.out.println("buenas tardes");
        }else {  System.out.println("buenas noches");
}
    }
    
}
