/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscarelemento;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rogel
 */
public class BuscarElemento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {   int tamanio = 10;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listanumeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < tamanio; i++) 
        {
            listanumeros.add(random.nextInt(10));
        }
        
        System.out.println("Ingrese numero a buscar: ");
        int numero = scanner.nextInt();
        
        int posicion = listanumeros.indexOf(numero);
        
        if(posicion != -1)
        {
            System.out.println("Se encontro el numero " + numero + " en la posicion " + posicion);
        }
        else
        {
            System.out.println(" No Se encontro el numero " + numero);

        }
        
        
        
    }
    
}
