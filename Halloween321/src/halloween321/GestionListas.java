/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package halloween321;

import java.util.List;

//? unbound wildcard - comodin sin lilmites
public interface GestionListas {
    public static void mostrarLista(List<?> objetos) {
        for(Object elemento : objetos) {
            System.out.println(elemento);
        }
    }
    
    public static <T>void mostrarListaGenerica(List<T> lista) {
        for(T elemento : lista) {
            System.out.println(elemento);
        }
    }
    
}
