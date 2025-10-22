
package bibliotecaTest;



public class Ilustracion extends Publicacion{
    private String nombre;
    private int ancho;
    private int alto;

    public Ilustracion(String nombre, int ancho, int alto, String titulo, int anioPubliacion) {
        super(titulo, anioPubliacion);
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
    }

        
        

   
    
    
     @Override
      public String toString() {
          return "Ilustrador: " + nombre + " ancho: " + ancho + " alto: " + alto;
      }
    
    
}
