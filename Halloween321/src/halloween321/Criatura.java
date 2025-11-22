
package halloween321;

public class Criatura {
    private String nombre;
    private int energia;

    public Criatura(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }
    
    public void recargarEnergia(int energia) {
        this.energia += energia;
    }
    
    @Override
    public String toString() {
        return "Criatura: " + nombre + " Nivel de energia: " + energia;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEnergia() {
        return energia;
    }
}
