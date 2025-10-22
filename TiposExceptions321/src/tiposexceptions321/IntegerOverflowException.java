
package tiposexceptions321;


public class IntegerOverflowException extends Exception {
    
    private static final String MESSAGE = "Desbordamiento de tipo integer";
    public IntegerOverflowException() {
        this(MESSAGE);
    }
    

 public IntegerOverflowException(String mensaje) {
        super(mensaje);
        
        
    }
}

