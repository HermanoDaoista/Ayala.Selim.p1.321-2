
package Inscontancia;

import java.util.ArrayList;

public class juegoDeporte extends Juego 
{

    public juegoDeporte(String titulo, double pesoGB) {
        super(titulo, pesoGB, new ArrayList<TipoConsola>());
        this.getConsolasCompatibles().add(TipoConsola.XBOX);
        this.getConsolasCompatibles().add(TipoConsola.PLAYSTATION);
        
    }

    //al instanciar esta clase en un main que parametro tendria que ir en el luegar del Arraylist? 
    // que le llegaria, para mi no tendria que estar ese atributo en los parametros?
    
}
