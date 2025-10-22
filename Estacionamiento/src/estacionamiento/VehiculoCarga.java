/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

public abstract class VehiculoCarga extends Vehiculo{
   
   private double carga;
   private final double cargaMax;

    public VehiculoCarga( String patente, String marca, int modelo, double cargaMax) {
        super(patente, marca, modelo);
        this.cargaMax = cargaMax;
    }
    
    private void validarCargaNegativa(double carga) {
        if(carga < 0) {
            throw new IllegalArgumentException("Carga Negativa");
        }
    
    }
    public void validarCarga(double carga) {
        if(carga > cargaMax) {
            throw new IllegalArgumentException("Carga excedida");
        }
    }
    public void cargar(double carga) {
        validarCargaNegativa(carga);
        this.carga = calcularCarga(carga);
        System.out.println(nombreClase() + " cargado");
    }
    
    protected abstract double calcularCarga(double carga);
    
      
    
    protected void setCarga(double carga) {
        this.carga = carga;
    }

        
    
    
   public double getCarga() {
        return carga;
    }
   
   public double getMaxcarga() {
       return cargaMax;
   }
        
   @Override
    public String toString() {
         return  super.toString() + " Carga " + getCarga() + '}';
    }     
   
   
}
