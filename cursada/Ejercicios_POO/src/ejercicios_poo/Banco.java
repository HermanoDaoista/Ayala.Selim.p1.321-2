/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_poo;

/**
 *
 * @author rogel
 */
public class Banco {
    static int saldoTotal;
    static int monto;
    
    public static int depositar(int monto) {
        return saldoTotal += monto;
    }
    public static int extraer(int monto) {
        if (monto <= saldoTotal) {
        saldoTotal -= monto;
        } else {
                  System.out.println("Sos pobre");
        }
        return saldoTotal;
        
    }
    public static void mostrarSaldo() {
        System.out.println(saldoTotal);
    } 
    
}
