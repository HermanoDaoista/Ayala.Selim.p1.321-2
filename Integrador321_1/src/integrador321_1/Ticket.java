/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador321_1;


public class Ticket {
    private final String cliente;
    private final double total;
    private final int cuotas;

    public Ticket(String cliente, double total, int cuotas) {
        validarCuotas(cuotas);
        this.cliente = cliente;
        this.total = total;
        this.cuotas = cuotas;
    }
    
    private void validarCuotas(int cuotas) {
        if(cuotas <= 0) {
          throw new IllegalArgumentException("Cuota invalida");
        }
    }
    private double montoCuota() {
        return total / cuotas;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente:  ").append(cliente).append("\n");
        sb.append(String.format("Total:   $%.2f", total));
        sb.append("\n");
        sb.append("Monto Cuota:  $%.2f".formatted(montoCuota()));
        return sb.toString();
        
        
        
    }
    
}
