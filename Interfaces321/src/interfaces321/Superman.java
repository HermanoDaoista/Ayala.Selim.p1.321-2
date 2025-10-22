
package interfaces321;


public class Superman implements Volador {
    private String nombre;
    private String alterEgo;
    private String planeta;

    public Superman(String nombre, String alterEgo, String planeta) {
        this.nombre = nombre;
        this.alterEgo = alterEgo;
        this.planeta = planeta;
    }
    
    @Override
    public void volar() {
            System.out.println("Soy name " + nombre + " y estoy volando");
    }
    
    public void pasarDesapercibido() {
        System.out.println("Con los anteojos soy " + alterEgo + " y nadie se da cuenta ");
    }
}
