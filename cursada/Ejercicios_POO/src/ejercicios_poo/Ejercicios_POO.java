/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_poo;

/**
 *
 * @author rogel
 */
public class Ejercicios_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println(Contador.incrementar());
        System.out.println(Contador.incrementar());
        System.out.println(Contador.incrementar());
        
        Conversor.metros = 1000;
        
        Conversor.convertir();
        
        Estadisticas.metodoA();
        Estadisticas.metodoA();
        Estadisticas.metodoB();
        Estadisticas.metodoC();
        Estadisticas.metodoC();
        Estadisticas.metodoA();
        
        Estadisticas.mostrarResumen();
        
        Banco.depositar(70);
        Banco.mostrarSaldo();
        Banco.depositar(70);
        Banco.mostrarSaldo();
        Banco.extraer(57);
        Banco.mostrarSaldo();
        Banco.extraer(85);
        Banco.mostrarSaldo();

        
        Sesion.login("felipe");
        Sesion.mostrarEstado();
        Sesion.logout();
        Sesion.mostrarEstado();
        Sesion.login("selim");
        Sesion.mostrarEstado();



        
         


        


        

        
    }
    
}
