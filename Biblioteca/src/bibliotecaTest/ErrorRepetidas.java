
package bibliotecaTest;


public class ErrorRepetidas extends RuntimeException{
    private final static String MASSAGE = "La publicacion ya exite";
    
    public ErrorRepetidas() {
        super(MASSAGE);
    
    }
}
