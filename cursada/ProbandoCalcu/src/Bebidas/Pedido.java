/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bebidas;

/**
 *
 * @author rogel
 */
public class Pedido {
    private String cliente;
    Bebida bebidaElegida;

    public Pedido(String cliente, Bebida bebidaElegida) {
        this.cliente = cliente;
        this.bebidaElegida = bebidaElegida;
    }
    
    
    public boolean esBebidaFria()
    {
        return bebidaElegida.getTipo().equalsIgnoreCase("fria");
    }
    
}
