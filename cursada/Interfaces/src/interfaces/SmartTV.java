/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author rogel
 */
public class SmartTV extends Dispositivo implements Conectable{

    public SmartTV(String marca, boolean encendido) {
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
    
    public String reproducirStreaming(String servicio){
        return "Reproduciendo Stream";
    }
}
