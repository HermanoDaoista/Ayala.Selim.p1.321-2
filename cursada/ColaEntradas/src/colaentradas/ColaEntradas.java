/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colaentradas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author rogel
 */
public class ColaEntradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Persona>  cola = new LinkedList<>();
        
        Persona p1 = new Persona("pepe", "Oscar");
        Persona p2 = new Persona("julio", "Cesar");
        Persona p3 = new Persona("Ruiz", "Oran");
        Persona p4 = new Persona("nula", "Lascar");
        
        cola.add(p1);
        cola.add(p2);
        cola.add(p3);
        cola.add(p4);
        
        while (!cola.isEmpty())
        {
            System.out.println("Entrada conseguida con exito por " + cola.peek().toString());
            cola.poll();
        }
    }
    
}
