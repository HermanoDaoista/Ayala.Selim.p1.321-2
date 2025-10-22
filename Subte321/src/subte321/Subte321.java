/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subte321;


public class Subte321 {

    public static void main(String[] args) {
        CentralSubte central = new CentralSubte(100);
           
        TarjetaRecargable tarjeta = new TarjetaRecargable(central);
        TarjetaDescartable tarjet = new TarjetaDescartable(central, 9);
        TarjetaRecargableDescuento tjd = new TarjetaRecargableDescuento(central, 0.30);
        
        System.out.println(tarjeta.getSaldo());
        tarjeta.recargar(600);
        tjd.recargar(30);
        System.out.println(tarjeta.getSaldo());
        tarjeta.viajar();
        tarjet.viajar();
        tjd.viajar();
        
        System.out.println(tarjeta.getSaldo());
        System.out.println(tjd.getSaldo());
        System.out.println(tarjet.getViajes());
        
        
        
        
      

               
                
    }
    
}
