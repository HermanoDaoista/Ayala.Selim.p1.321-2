
package parcialrogelioselim;

public class ErrorEspecieRepetidaException extends RuntimeException {
    private static final String MASSAGE = "Nombre de especie repetido ";
    
    public ErrorEspecieRepetidaException() {
        super(MASSAGE);
    }
}
