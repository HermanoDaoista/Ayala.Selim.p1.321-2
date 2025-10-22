/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_cinco;

import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class Ejercicio_cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese apellido");
        String apellido = scanner.nextLine();
        int suma_notas = 0;

        for(int i=1; i<4; i++){
        System.out.println("Ingrese nota " + i);
        int nota = scanner.nextInt();
        suma_notas += nota;

    }
        int promedio = suma_notas / 3;
        if(promedio < 4){
            System.out.println("Alumno " + apellido + " " + nombre + " Desaprobado");
        }
        else{
            if(promedio > 3 && promedio < 6){
                System.out.println("Alumno " + apellido + " " + nombre + " Aprobado");

            }
            
            else{
                 System.out.println("Alumno " + apellido + " " + nombre + " Promocionado");
 
            }
        }
  }  
}
