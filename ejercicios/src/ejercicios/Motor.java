/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author rogel
 */
public class Motor {
    private int nroSerie;
    private String tipoCombustible;
    private double cilindrada;

    public Motor(int nroSerie, String tipoCombustible, double cilindrada) {
        this.nroSerie = nroSerie;
        this.tipoCombustible = tipoCombustible;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motor{" + "nroSerie=" + nroSerie + ", tipoCombustible=" + tipoCombustible + ", cilindrada=" + cilindrada + '}';
    }
    
    
    
}
