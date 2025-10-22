/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bebidas;

/**
 *
 * @author rogel
 */
public class Ejecutando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         Pedido p1 = new Pedido("Felipe", Bebida.GASEOSA);
         Pedido p2 = new Pedido("Juancho", Bebida.CAFE);

         System.out.println(p1.esBebidaFria());
         System.out.println(p2.esBebidaFria());

    }
    
}
