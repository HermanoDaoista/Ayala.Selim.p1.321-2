/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador321_1;

/**
 *
 * @author rogel
 */
public class TarjetaDebito {
    private EntidadFinanciera entidadFinaciera;
    private final String entidadBancaria;
    private Cliente titular;
    private String numero;
    private double limite;

    public TarjetaDebito(EntidadFinanciera entidadFinaciera, String entidadBancaria, Cliente titular, String numero, double limite) {
        this.entidadFinaciera = entidadFinaciera;
        this.entidadBancaria = entidadBancaria;
        this.titular = titular;
        this.numero = numero;
        this.limite = limite;
    }
    
    public boolean checklimite(double monto) {
        return monto <= limite;
    }
    
    
    public void informarVenta(double monto) {
        if(!checklimite(monto)) {
            throw new IllegalStateException("No tiene limite");
        }
        limite -= monto;
    }
    
    public String getNombreTitular() {
        return titular.nombreCompleto();
    }
}
