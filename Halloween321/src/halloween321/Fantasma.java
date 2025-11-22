
package halloween321;

public class Fantasma extends Espectro {
    private final double transparencia;

    public Fantasma(double transparencia, int nivelespectral, String nombre, int energia) {
        super(nivelespectral, nombre, energia);
        this.transparencia = transparencia;
    }
    
    public void fantasmear() {
        System.out.println("Soy " + getNombre() + " y voy a fantasmear por la habitacion");
    }

    @Override
    public String toString() {
        return "Fantasma{" +   " Nombre " + getNombre() + " Energia " + getEnergia() + " Transparencia " + transparencia+'}';
    }
    
    @Override
    public void aterrar() {
        System.out.println("Boooooo me llamo " + getNombre());
    }
    
    
}
