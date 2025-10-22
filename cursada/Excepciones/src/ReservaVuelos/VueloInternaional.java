/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservaVuelos;

/**
 *
 * @author rogel
 */
public class VueloInternaional extends Vuelo implements Reservable{

    public VueloInternaional(String nombre, String apellido, int capacidad) {
        super(nombre, apellido, capacidad);
    }

    @Override
    public void reservarAsientos(int numeroAsiento) throws AsientoNoDisponibleException {
        if(!asientoDisponible(numeroAsiento) && numeroAsiento > 0 && numeroAsiento <= capacidad){
            throw new AsientoNoDisponibleException("Asiento " + numeroAsiento + " no disponible en vuelo internacional ");
        }
        asientoReservados.add(numeroAsiento);
        System.out.println("Asiento " + numeroAsiento + " reservado en vuelo internacional ");

    }

    @Override
    public void cancelarReserva(int numeroAsiento) {
       asientoReservados.remove(numeroAsiento);
       System.out.println("Reserva cancelada en vuelo internacional, asiento " + numeroAsiento );

    }

    @Override
    public void confirmarReserva() throws AsientoNoDisponibleException{
          System.out.println("Reserva confirmada " + this.nombre + " " + this.apellido);

    }

    
}


