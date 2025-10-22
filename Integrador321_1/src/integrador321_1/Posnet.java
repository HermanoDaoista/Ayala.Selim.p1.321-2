/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador321_1;

/**
 *
 * @author rogel
 */
public class Posnet {
    private final static int MIN_CUOTA = 1;
    private final static int MAXCUOTA = 6;
    private final static double PORC_REC_CUOTA = 0.03;
    
    
    public Ticket efectuarPago(TarjetaDebito tarjeta, double monto, int cuotas) {
        validarArgumentos(tarjeta, monto, cuotas);
        Ticket ticket = null;
        double total = calcularTotal(monto, cuotas);
        if(tarjeta.checklimite(total))   {
            tarjeta.informarVenta(total);
            ticket = new Ticket(tarjeta.getNombreTitular(), total, cuotas);
        }
        return ticket;
        
    }
    
    private double calcularTotal(double monto, int cuotas) {
        return monto + calcularRecargo(monto, cuotas);
    }
    
    private  double calcularRecargo(double monto, int cuotas) {
        return monto *  PORC_REC_CUOTA * (cuotas -1);
    }
    
    private void validarArgumentos(TarjetaDebito tarjeta, double monto, int cuotas) {
        validarCuotas(cuotas);
        validarMonto(monto);
        validartarjeta(tarjeta);
    }
    
    private void validartarjeta(TarjetaDebito tarjeta) {
        if(tarjeta == null) {
            throw new IllegalArgumentException("Tarjeta Nula");
        }
    }
    private void validarMonto(double monto) {
        if(monto <= 0) {
            throw new IllegalArgumentException("Monto invalido");
        }    
        
    }
    private static void validarCuotas(int cuotas) {
        if(cuotas < MIN_CUOTA || cuotas > MAXCUOTA) {
            throw new IllegalArgumentException("Cuotas invalidas");
        }
    }
    
    
}
