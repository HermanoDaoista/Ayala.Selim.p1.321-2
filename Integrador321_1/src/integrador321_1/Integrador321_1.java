/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integrador321_1;


public class Integrador321_1 {
    
    public static void main(String[] args) {

        Cliente cliente = new Cliente("123456789", "Juan", "Perez", "1122234567", "juanperez@gmail.com");
        
        Posnet posnet = new Posnet();
        
        TarjetaDebito tarjeta = new TarjetaDebito(EntidadFinanciera.MASRERCARD, "Banco Campeon", cliente, "1234 3483 9374 8346", 30_000);
        
        Ticket t = posnet.efectuarPago(tarjeta, 20_000, 1);
        
        System.out.println(t);
    }
    
}
