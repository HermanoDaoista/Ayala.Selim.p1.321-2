
package ejercicios;


public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double calcularArea(){
        return ancho * alto;
    }
    public double calcularPerimetro() {
        return ancho * 2 + alto *2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo{");
        sb.append("ancho=").append(ancho);
        sb.append(", alto=").append(alto);
        sb.append('}');
        return sb.toString();
    }
    
}
