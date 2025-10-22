/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoenvio321;


public class EmpresaTercerizada implements TransportadorPaquete {
    private String nombre;
    private long cuit;

    public EmpresaTercerizada(String nombre, long cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public void transportarPaquete(String destino) {
        System.out.println("Soy una tercerizada transportando un paquete a "  + destino );
    }
    @Override
    public void repostar() {
        System.out.println("Felicitaciones Empresa Tercerizada");
    }
    //
    
    
}
