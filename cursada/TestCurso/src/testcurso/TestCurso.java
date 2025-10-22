/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcurso;
import Inscontancia.*;
public class TestCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consola c1 = new Consola("AtariUltra", TipoConsola.PLAYSTATION, 300);
        Consola c2 = new Consola("MilEnuno", TipoConsola.XBOX, 190);
        
        juegoDeporte deporte0 = new juegoDeporte("Vendeta", 10);
        juegoDeporte deporte1 = new juegoDeporte("Contra", 10);
        juegoDeporte deporte2 = new juegoDeporte("Cadillacs", 100);
        juegoDeporte deporte3 = new juegoDeporte("Turrican", 100);
        juegoAccion accion0 = new juegoAccion("Soccer", 50);
        juegoAccion accion1 = new juegoAccion("Araths", 50);
        juegoAccion accion2 = new juegoAccion("Ser", 50);
        juegoAccion accion3 = new juegoAccion("Hilos", 50);
        
        c1.agregarJuegos(accion0);
        c1.agregarJuegos(accion2);
        c1.agregarJuegos(accion3);
        c1.agregarJuegos(deporte2);
        c1.agregarJuegos(deporte3);
        c1.mostrarJuegos();
        c2.agregarJuegos(deporte1);
        c2.mostrarJuegos();
        
    }
    
}
