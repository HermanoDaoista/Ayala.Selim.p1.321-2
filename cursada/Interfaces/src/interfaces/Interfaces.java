/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author rogel
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Conectable> lista = new ArrayList<>();
        

        
        SmartTV tv = new SmartTV("Sansung", false);
        HeladeraInteligente he = new HeladeraInteligente("Sian", false);
        LamparaInteligente lam = new LamparaInteligente("Ferrete", false);
        
        lista.add(tv);
        lista.add(he);
        lista.add(lam);
        
        
        
        for(Conectable dis : lista){
            dis.encender();
        }
        
        for(Conectable dis : lista){
            dis.conectarWifi("XXX");
        }
        
       
        
    
        
        
        
    }
    
}
