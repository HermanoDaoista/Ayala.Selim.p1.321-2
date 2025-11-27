
package model;


public class Empleado extends Persona {
    private static final long serialVersionUID = 1L;
    private double sueldo;
    private Sector sector;

    public Empleado( int dni, String nombre, double sueldo, Sector sector) {
        super(dni, nombre);
        this.sueldo = sueldo;
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + getDni() + "nombre=" + getNombre() + "sueldo=" + sueldo + ", sector=" + sector + '}';
    }
    
    @Override
    public String toCSV() {
        return super.toCSV() + "," + sueldo + "," + sector + "\n";
    }
    
    public static String toHeaderCSV() {
        return "dni,nombre,sueldo,sector\n";
    }
    
    public static Empleado fromCSV(String empleadoCSV) {
        empleadoCSV = empleadoCSV.substring(0,empleadoCSV.length());
        String[] datos = empleadoCSV.split(",");
        return new Empleado(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]), Sector.valueOf(datos[3]));
    }
}
