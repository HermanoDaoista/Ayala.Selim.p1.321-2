
package bibliotecaTest;

public class BibliotecaTest {

  
    public static void main(String[] args) {
        
        Biblioteca b = new Biblioteca("Patricias");
        
        Revistas r = new Revistas(1234, "Caras", 1978);
        Libro l = new Libro("pitfall", Genero.CIENCIA, "Mundo Fragmentado", 2027);
        Ilustracion i = new Ilustracion("quintela", 20, 30, "el bosque", 2018);
        
        try{
        
        b.agregarPublicaciones(i);
        b.agregarPublicaciones(r);
        
       ;
        b.agregarPublicaciones(l);
        
        
        }catch(ErrorRepetidas ex){
            System.out.println(ex.getMessage());
        }catch(IllegalArgumentException ex) {
            System.out.println("No se puede agregar una publiacion nula");
        }
        System.out.println(Utils.obtenerSepHorizontal(40));
        b.leerpublicaciones();
        
        System.out.println(Utils.obtenerSepHorizontal(40));
        b.mostrarPubliacaciones();
    }
 
    }
