
package mercadoenvio321;

import java.util.ArrayList;
import java.util.List;


public class EmpresaLogistica {
    private String nombre;
    private List<TransportadorPaquete> listapaquetes = new ArrayList<>();

    public EmpresaLogistica(String nombre) {
        this.nombre = nombre;
    }
    
    public void prepararEntrega() {
        for(TransportadorPaquete t : listapaquetes) {
            t.repostar();
        }
    }
    





    public void iniciarEntrega(String destino) {
       for (TransportadorPaquete t : listapaquetes) {
           t.transportarPaquete(destino);
           
        }
    }

    public void agregarTransportador(TransportadorPaquete t) {
    if(t == null) {
        throw new IllegalArgumentException("error de null");
        }
    listapaquetes.add(t);
    }


}
