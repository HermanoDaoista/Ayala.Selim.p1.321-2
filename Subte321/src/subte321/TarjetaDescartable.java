
package subte321;

public class TarjetaDescartable extends Tarjeta{
        private int viajesTotales;

    public TarjetaDescartable(CentralSubte central, int viajesTotales) {
        super(central);
        this.viajesTotales = viajesTotales;
        
    }
    
    public int getViajes() {
        return viajesTotales;
    }    
    
        @Override
        public boolean puedoViajar() {
    return viajesTotales > 0;
}

        @Override
        public void descontarViaje() {
    viajesTotales-=1;
}
    
    @Override
    public String mensajeError() {
        return "No le quedan viajes disponibles";
    }
    
    
    
}
