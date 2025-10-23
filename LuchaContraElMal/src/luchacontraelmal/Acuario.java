/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchacontraelmal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rogel
 */
public class Acuario {
    private String nombre;
    private List<Especie> listaEspecies;

    public Acuario(String nombre) {
        this.nombre = nombre;
        listaEspecies = new ArrayList<>();
    }
    
    public void verificarRepetida(Especie especie) {
        if(listaEspecies.contains(especie)) {
            throw new ErrorNombreRepetido();
        }
    }
    
    public void agregarEspecie(Especie especie) {
        if(especie == null) {
            throw new IllegalArgumentException();
        }
        verificarRepetida(especie);
        listaEspecies.add(especie);
    }
    
    public void mostrarEspecie() {
        for(Especie e : listaEspecies) {
            System.out.println(e.toString());
        }
    }
    
    
    
    public void alimentarEspecies() {
        for(Especie e : listaEspecies) {
            if(e instanceof Alimentable a) {
                a.alimentar();
            }else {
                System.out.println("No es una especie suceptible de ser alimentada");
            }
        }
    }
    
    public void filtrarPorTipoAgua(TipoAgua tipo) {
        for(Especie e : listaEspecies) {
            if(e.getTipo() == tipo) {
                 System.out.println(e.toString());
            }
        }
    }
    
    
}
