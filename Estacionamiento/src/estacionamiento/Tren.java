
package estacionamiento;

public class Tren extends VehiculoCarga {
    private Combustible combustible;
    public Tren(String patente, String marca, int modelo , double cargaMax,  Combustible combustible) {
        super(patente, marca, modelo, cargaMax);
        this.combustible = combustible;
    
    }   
           @Override
    public void acelerar() {
        System.out.println("Tren acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Tren  frenando");
    }
    
    public void tocarSilbato() {
        System.out.println("Chu...Chuuuuu");
    }
    
    @Override
    protected double calcularCarga(double carga) {
        validarCarga(carga);
        return carga;
    }
    
    @Override
    public String toString() {
         return  super.toString() + " Combustible = " + combustible + '}';
    }
 

}
