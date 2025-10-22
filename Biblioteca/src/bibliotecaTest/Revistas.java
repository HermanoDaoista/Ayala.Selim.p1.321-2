
package bibliotecaTest;

public class Revistas extends Publicacion implements Leible {
    private int nro_edicion;

    public Revistas(int nro_edicion, String titulo, int anioPubliacion) {
        super(titulo, anioPubliacion);
        this.nro_edicion = nro_edicion;
    }
    
    @Override
      public void leer() {
        System.out.println("Leyendo la revista " + getTitulo());
    }
      
    @Override
      public String toString() {
          return "Revista  numero de edicion: " + nro_edicion;
      }
    
    
            
}
