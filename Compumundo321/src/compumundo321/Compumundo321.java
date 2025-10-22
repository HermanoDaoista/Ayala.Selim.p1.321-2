
package compumundo321;

import java.util.ArrayList;

public class Compumundo321 {

   
    public static void main(String[] args) {
        CadenaTecnologia compumundo = new CadenaTecnologia();
        hardcodearCadena(compumundo);
        mostrarDispositivos(compumundo.getDispositivos());
        System.out.println(Utils.sepHorizontal(20,'@'));
        System.out.println(DispositivoElectronico.toTable(compumundo.getDispositivos()));
        Utils.sepHorizontal(60, '*');
        //System.out.println(compumundo.borrarDispositivo("Sucursal x", "567"));
       //mostrarDispositivos(compumundo.getDispositivos());
      try{ double por[ ] = compumundo.porcDispositivoPorTipo("Sucursal x");
       for (TIpoDispositivo tipo : TIpoDispositivo.values()) {
           System.out.println("%s : %.2f%%".formatted(tipo.name(), por[tipo.ordinal()]));
       }
      }catch(SucursalInexistenteChequeada ex) {
          System.out.println("trycacheando");
      }
       
        
    }
    
    public static void mostrarDispositivos(ArrayList<DispositivoElectronico> lista) {
        for(DispositivoElectronico d : lista){
            System.out.println(d);
        }
    }
    
    public static void hardcodearCadena(CadenaTecnologia cadena) {
    Sucursal suc1 = new Sucursal("Sucursal A");
    Sucursal suc2 = new Sucursal("Sucursal B");
    
    suc1.agregarDispositivo(new DispositivoElectronico("123", 322, TIpoDispositivo.COMPUTADORA));
    suc1.agregarDispositivo(new DispositivoElectronico("143", 102, TIpoDispositivo.TABLET));
    suc1.agregarDispositivo(new DispositivoElectronico("343", 982, TIpoDispositivo.TELEFONOS));
    suc1.agregarDispositivo(new DispositivoElectronico("563", 439, TIpoDispositivo.COMPUTADORA));
    
    
    suc2.agregarDispositivo(new DispositivoElectronico("154", 1222, TIpoDispositivo.COMPUTADORA));
    suc2.agregarDispositivo(new DispositivoElectronico("122", 1023, TIpoDispositivo.TABLET));
    suc2.agregarDispositivo(new DispositivoElectronico("345", 9842, TIpoDispositivo.TELEFONOS));
    suc2.agregarDispositivo(new DispositivoElectronico("567", 4329, TIpoDispositivo.COMPUTADORA));
    
    cadena.agregarSucursal(suc1);
    cadena.agregarSucursal(suc2);
    
    }
    
}
