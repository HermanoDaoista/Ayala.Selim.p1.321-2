
package almacen321;

import java.util.Objects;


public class Producto implements Comparable<Producto>{
    private int id;
    private String nombre;
    private double precio;
    private Tipo tipo;

    public Producto(int id, String nombre, double precio, Tipo tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    public boolean esTipo(Tipo tipo) {
        boolean toReturn = true;
        if(this.tipo != tipo){
            toReturn = false;
        }
        return toReturn;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public int compareTo(Producto o) {
        return Integer.compare(id, o.id);
    }
    
    public void aumentarPrecio(double porciento) {
        precio = precio + precio * porciento /100;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Producto p)) {
            return false;
        }
        return this.id == p.id;
    }
        
       
}
    
    
    
