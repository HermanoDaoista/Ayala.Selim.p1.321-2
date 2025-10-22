/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciohash;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author rogel
 */
public class EjercioHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {1,1,1,1,3,4,5,6,78};
        
        HashSet<Integer> sinrepetir = new HashSet<>();
        
        for (int i = 0; i < numeros.length; i++) {
            sinrepetir.add(numeros[i]);
        }
        ArrayList<Integer> lista = new ArrayList<>(sinrepetir);
        
        for(int valor : lista)
        {
            System.out.print(valor+ " ");
        }
    }
    
    
}
