/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;


public class LamparaInteligente extends Dispositivo implements Conectable{

    public LamparaInteligente(String marca, boolean encendido) {
        super(marca, encendido);
    }

    @Override
    public void encender() {
        super.setEncendido(true);
    }

    @Override
    public void apagar() {
        super.setEncendido(false);
    }

    @Override
    public void conectarWifi(String string) {
        System.out.println("Conectando a la red...");
    }
    
    public String cambiaColor(){
        return "color...";
    }
    
}
