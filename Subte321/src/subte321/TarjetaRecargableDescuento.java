
package subte321;

public class TarjetaRecargableDescuento extends TarjetaRecargable {
    private double descuento;
    
  public  TarjetaRecargableDescuento(CentralSubte central, double descuento) {
      super(central);
      this.descuento = descuento;
  }
  
      @Override
    public String mensajeError() {
        return super.mensajeError() + ", abuelo";
    }
  @Override
  protected double getPrecioViaje() {
    return super.getPrecioViaje() * (1-descuento);
}
  
  
}
