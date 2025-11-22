
package halloween321;


public class Espectro extends Criatura implements Aterrable {
    
    private int nivelespectral;

    public Espectro(int nivelespectral, String nombre, int energia) {
        super(nombre, energia);
        this.nivelespectral = nivelespectral;
    }
    
    @Override
    public void recargarEnergia(int energia) {
     super.recargarEnergia( energia * 2);
}

    @Override
    public String toString() {
        return "Espectro{" + "nivelespectral " + nivelespectral + " energia:  " + getEnergia() + " Nombre: " + getNombre() +'}';
    }

    public int getNivelespectral() {
        return nivelespectral;
    }
    
    public void materializar() {
        System.out.println("Materializandome con mi nivel " + nivelespectral);
    }
    
    @Override
    public void aterrar() {
        System.out.println("Me llamo " + getNombre() + " y te mato de miedo");
    }
    
    
     
    
}
