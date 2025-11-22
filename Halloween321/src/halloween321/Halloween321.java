/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package halloween321;

import java.util.ArrayList;
import java.util.List;

public class Halloween321 {

    
    public static void main(String[] args) {
        
        
        Criatura c1 = new Criatura("pepe", 23);
        Criatura c2 = new Criatura("jul", 13);
        Espectro e1 = new Espectro(20, "juan", 10);
        Espectro e2 = new Espectro(12, "harols", 30);
        Fantasma f1 = new Fantasma(23, 10, "alco", 20);
        Fantasma f2 = new Fantasma(32, 14, "ffggfo", 90);
       
        
        List<Criatura> criaturas = new ArrayList<>();
        List<Espectro> espectro = new ArrayList<>();
        List<Fantasma> fantasmas = new ArrayList<>();
        List<Aterrable> aterrable = new ArrayList<>();
        List<Object> objetos = new ArrayList<>();
        
        
        criaturas.add(c2);
        criaturas.add(c1);
        criaturas.add(e1);
        criaturas.add(f1);
        
        espectro.add(e1);
        espectro.add(e2);
        espectro.add(f1);
        
        fantasmas.add(f1);
        fantasmas.add(f2);
        
        aterrable.add(e1);
        aterrable.add(f1);
        
        //fantasmear(fantasmas);
        //iniciarHalloween(criaturas);
        GestionListas.mostrarLista(aterrable);
        agregarEspectro(aterrable, new Espectro(5,"Juancito",10));
        System.out.println("===============================");
        GestionListas.mostrarLista(aterrable);
        //asustar(criaturas,40);
        //mostrarCriaturas(criaturas);
        //GestionListas.mostrarListaGenerica(criaturas);
    }
     
    
    //upper bounded wildcard comodin de limite superior
    public static void mostrarCriaturas(List<? extends Criatura> lista) {
        for(Criatura elemento : lista) {
            //elemento.recargarEnergia(4);
            System.out.println(elemento);
        }
    }
    
    public static void asustar(List<? extends Criatura> lista, int energia) {
        for(Criatura c : lista) {
            c.recargarEnergia(energia);
        }
    }
    
    public static void iniciarHalloween(List<? extends Aterrable> aterrables) {
        for(Aterrable at : aterrables) {
            at.aterrar();
        }
    }
    
    public static void fantasmear(List<Fantasma> fantasma) {
        for(Fantasma f : fantasma) {
            f.fantasmear();
        }
    }
    //lower bounded wildcard o comidin de limite inferior
    public static void agregarEspectro(List<? super Espectro> lista, Espectro e) {
        lista.add(e);
    }
    
    public static <T> void agregarElemento(List<? super T> lista, T t) {
        lista.add(t);
    }

    
}
