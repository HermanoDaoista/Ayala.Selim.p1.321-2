
package parcialrogelioselim;

public class Coral extends Especie implements Alimentable{
     private final int profundidadCrecimiento;

    public Coral(int profundidadCrecimiento, String nombre, String tanque, TipoAgua tipoagua) {
        super(nombre, tanque, tipoagua);
        this.profundidadCrecimiento = profundidadCrecimiento;
    }
    
         @Override
        public void reproducirse() {
            System.out.println("Coral.......^&%^$%%^###$#....reproduciendose");
        }
    
     @Override
        public void respirar() {
            System.out.println("Coral respirando...");
        }
        
     @Override
      public void alimentar() {
        System.out.println("Soy un coral siendo alimentado");
    }
    
     
    @Override
    public String toString() {
        return super.toString() + " Profundidad de Crecimiento: " + profundidadCrecimiento;
    }
    
}
