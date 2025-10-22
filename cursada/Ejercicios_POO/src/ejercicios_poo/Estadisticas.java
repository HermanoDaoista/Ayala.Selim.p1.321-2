/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_poo;

/**
 *
 * @author rogel
 */
public class Estadisticas {
    static int contadorA;
    static int contadorB;
    static int contadorC;


    public static void metodoA() {
    System.out.println("metodo A");
    contadorA ++; 
    }
    public static void metodoB() {
    System.out.println("metodo B");
    contadorB ++; 
    }
    public static void metodoC() {
    System.out.println("metodo C");
    contadorC ++; 

    }
    public static  void mostrarResumen(){
         System.out.println("Se llamo el metodoA: " + contadorA + " veces");
         System.out.println("Se llamo el metodoB: " + contadorB + " veces");
         System.out.println("Se llamo el metodoC: " + contadorC + " veces");

    }
    
}
