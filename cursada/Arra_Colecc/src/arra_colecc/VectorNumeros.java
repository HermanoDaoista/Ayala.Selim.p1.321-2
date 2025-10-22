/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arra_colecc;

import java.util.Scanner;


public class VectorNumeros
{
    private int tamanio;
    private int numero;
    
    
    private int suma;
    private int promedio;
    private int[] vector = new int [10];
    Scanner scanner = new Scanner(System.in);
   
    public int[] Cargar()
    {
        for (int i = 0; i < vector.length; i++) 
        {
            System.out.println("Ingrese el numero " +( i+1) + ": ");
            numero =scanner.nextInt();
            vector[i] = numero;
            scanner.nextLine();
         
        }
        
        return vector;
        
    }
    
    public void Calcular()
    {
      int tamanio = 0;
      int suma = 0; 
      int maximo = vector[0];
      int minimo = vector[0];
      
        for (int numero : vector )
        {   
            suma += numero;
            if (numero > maximo)
            {
                maximo = numero;
            }
            if (numero < minimo)
            {
                minimo = numero;
            }
            
        }
        promedio = suma / vector.length;
        
         for (int numero : vector)
         {
             if (numero > promedio)
             {
                 tamanio += 1;
             }
             
         }
         int[] mayores = new int[tamanio];
         int j =0;
         for (int numero : vector)
         {
             if(numero > promedio)
             {
                mayores[j] = numero;
                j++;
             }
         } System.out.println("Mayor: " + maximo +"\n"+ "Menor: " + minimo +"\n"+ "Promedio: " + promedio +"\n"+ "Mayores: " );
         for (int numeros : mayores) 
         {
             System.out.print(numeros);
             
         }

         
         
         
         
    }
}
