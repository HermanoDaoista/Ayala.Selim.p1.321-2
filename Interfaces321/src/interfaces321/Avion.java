/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces321;


public class Avion implements Volador{
    private String marca;
    private String matricula;
    private int cantPasajeros;
    private double horasVuelo;

    public Avion(String marca, String matricula, int cantPasajeros, double horas) {
        this.marca = marca;
        this.matricula = matricula;
        this.cantPasajeros = cantPasajeros;
        this.horasVuelo = horas;
    }
    
    @Override
    public void volar() {
        System.out.println("soy un avion, vuelo");
        horasVuelo+=1000;
    }
    
    public int getPasajeros() {
        return cantPasajeros;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void realizarMantenimiento() {
        if(horasVuelo > 4000) {
            System.out.println("En mantenimiento");
        }
        else {
            System.out.println("No hace falta..");
        }
    }
}
