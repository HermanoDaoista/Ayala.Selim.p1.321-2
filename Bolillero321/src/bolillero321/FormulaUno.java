
package bolillero321;


public class FormulaUno {
    private String piloto;
    private Escuderia escuderia;

    public FormulaUno(String piloto, Escuderia escuderia) {
        this.piloto = piloto;
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        return "FormulaUno{" + "piloto=" + piloto + ", escuderia=" + escuderia + '}';
    }
    
    
    
}
