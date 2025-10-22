/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientastaller;

/**
 *
 * @author rogel
 */
public class Herramienta
{
    protected String marca;
    protected int peso;

    public Herramienta(String marca, int peso) {
        this.marca = marca;
        this.peso = peso;
    }

    
public String MostrarHerramienta()
{
    return "Marca: " + marca + " Peso " + peso;
}    

    
    
 }
