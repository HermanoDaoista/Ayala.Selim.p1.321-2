/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador;

/**
 *
 * @author rogel
 */
public class Tarjetadecredito {
    private String nrodetarjeta;
    private double saldodispinible;
    private Entidadfinanciera entidadfinanciera;
    private String entidadbacaria;
    private Titular titular;

    public Tarjetadecredito(String nrodetarjeta, double saldodispinible, Entidadfinanciera entidadfinanciera, String entidadbacaria, Titular titular) {
        this.nrodetarjeta = nrodetarjeta;
        this.saldodispinible = saldodispinible;
        this.entidadfinanciera = entidadfinanciera;
        this.entidadbacaria = entidadbacaria;
        this.titular = titular;
    }
    
    
}
