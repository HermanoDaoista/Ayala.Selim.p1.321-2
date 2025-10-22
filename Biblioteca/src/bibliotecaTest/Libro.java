
package bibliotecaTest;


public class Libro extends Publicacion implements Leible {
    private String autor;
    private Genero genero;

    public Libro(String autor, Genero genero, String titulo, int anioPubliacion) {
        super(titulo, anioPubliacion);
        this.autor = autor;
        this.genero = genero;
    }
    
    @Override
    public void leer() {
        System.out.println("Leyendo el libro " + getTitulo());
    }
    
    @Override
    public String toString() {
        return "Autor: " + autor + " Genero: " + genero;
    }
}
