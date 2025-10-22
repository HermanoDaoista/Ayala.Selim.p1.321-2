
package subte321;


public class TarjetaRecargable extends Tarjeta {
    private double saldo;
    public TarjetaRecargable(CentralSubte central) {
        super(central);
        
    }
    
public void recargar(double  monto) {
    if(monto <= 0){
        throw new IllegalArgumentException("saldo negativo no se permite");
    }
    saldo = saldo + monto;
}

public double getSaldo() {
    return this.saldo;
}

protected double getPrecioViaje() {
    return getCentral().consultarPrecioViaje();
}

    @Override
    public  boolean puedoViajar() {
    return saldo >= getPrecioViaje();
    }

    @Override
    public void descontarViaje() {
    saldo-=getPrecioViaje();
}
    
    @Override
    public String mensajeError() {
        return "No tiene saldo disponible";
    }

   
}
