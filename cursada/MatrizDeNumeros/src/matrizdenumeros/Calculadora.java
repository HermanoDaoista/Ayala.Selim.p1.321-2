/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizdenumeros;
import java.util.Random;


/**
 *
 * @author rogel
 */
public class Calculadora 
{
    Random random = new Random();
    int[][] matriz =new int[3][3];
public int[][] CargarMatriz()
{    
    for (int i = 0; i < matriz.length; i++)
    {
        for (int j = 0; j < matriz[i].length; j++ )
        {
            matriz[i][j]= random.nextInt(10);
        }
    }
    return matriz;
}    
public void ImprimirMatriz(int[][] matriz)
{   int suma = 0;
    for(int[] fila : matriz)
    {
        for (int valor : fila)
        {
            suma += valor;
            System.out.print( valor + " ");
        }
        System.out.println();
    }System.out.println("Esta matriz suma: " + suma);
    

}   
    
}
