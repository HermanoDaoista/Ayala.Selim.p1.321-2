
package gymbro;

import java.time.LocalDate;


public class PersonalTrainer extends Entrenador {
    private double sueldo_min;
    private int nro_clientes;
    private double monto_cliente;

    public PersonalTrainer( int legajo, String nombre, String apellido, LocalDate anioIngreso, double sueldo_min, int nro_clientes, double monto_cliente) {
        super(legajo, nombre, apellido, anioIngreso);
        this.sueldo_min = sueldo_min;
        this.nro_clientes = nro_clientes;
        this.monto_cliente = monto_cliente;
    }
    
       
    
    @Override
    public double calcularSueldo() {
        double sueldo_Por_Clientes = monto_cliente * nro_clientes;
        return (sueldo_Por_Clientes > sueldo_min) ? sueldo_Por_Clientes : sueldo_min;
    }
    
    public int getCantClientes() {
        return nro_clientes;
    }
    
    
    
}
