/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercadoenvio321;

public class MercadoEnvio321 {

 
    public static void main(String[] args) {
           
        
        EmpresaLogistica me = new EmpresaLogistica("MercadoEnvios");

        cargarEmpresa(me);
        me.iniciarEntrega("Posadas");
        me.prepararEntrega();
        //em[resalogistica /metodo cargarcombustible / cargarbaterias / feicitardeliverys
    }
    
    public static void cargarEmpresa(EmpresaLogistica e) {
        e.agregarTransportador(new CamionReparto("ABC123"));
        e.agregarTransportador( new DroneEntrega("Sagitario"));
        e.agregarTransportador(new CamionReparto("UDJ786"));
        e.agregarTransportador(new PersonasMensajeras("Pedrito"));
        e.agregarTransportador(new EmpresaTercerizada("Telecom", 86286362));
    }
    
    
}
