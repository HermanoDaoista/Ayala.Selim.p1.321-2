
package wilcard321;

import java.util.ArrayList;
import java.util.List;


public class Wilcard321 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numeros= new ArrayList<>(List.of(23,4,5,6,7,2,32,43));
        List<String> nombres = new ArrayList<>(List.of("pedro", "Juan", "Pepe"));
        List<?> objetos = numeros;
        mostrarLista(nombres);
    }
    
    public static void mostrarLista(List<?> lista) {
        for(  Object elemento :    lista) {
            System.out.println(elemento);
        }
    }
    
}
