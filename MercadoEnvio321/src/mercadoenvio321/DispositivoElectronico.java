/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoenvio321;


public abstract class DispositivoElectronico {
    private String marca;
    private boolean encendido;

    public DispositivoElectronico(String marca) {
        this.marca = marca;
    }
    
    protected String mensajeEncendido() {
        return "Dispositivo encendido";
    }
    
    public void encender() {
        this.encendido = true;
        System.out.println(mensajeEncendido());
    }
    
    public void cargarBaterias() {
    System.out.println("cargando baterias de dispositivo");
    }
    
    public void repostar() {
        cargarBaterias();
    }
    
    
}
