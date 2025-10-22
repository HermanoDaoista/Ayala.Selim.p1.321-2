/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_ocho;

import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class Ejercicio_ocho {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int vueltas = 0;   
        int numero;
        int maximo = 0;
        int minimo = 0;
        int suma = 0;
        boolean bandera = false;
        int promedio;
        while (vueltas < 10) {
            vueltas++;
            System.out.println("Introdusca el numero " + vueltas + " :" );
            numero = scanner.nextInt();
                 suma += numero;
                 
            if (bandera == false){
                 maximo = numero;
                 minimo = numero;
                 bandera = true;
            }else {
                if(numero > maximo) {
                 maximo = numero;
            }   if (numero < minimo) {
                minimo = numero;
                }
            }
                    
        }
        promedio = suma / vueltas;
            
         System.out.println("promedio:  " + promedio + "  minimo:  " +minimo+  "  maximo:  " + maximo);;
            
      
    }
    
}
