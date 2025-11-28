
package ordenamiento321;


public class Date implements Comparable<Date>{
   private int dia;
   private int mes;
   private int anio;
   private static String format = "%02d/%02d/%d";

    public Date(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
   
   
   
   @Override
   public String toString() {
       return format.formatted(dia, mes, anio);
   }

    @Override
    public int compareTo(Date o) {
      int cmp = Integer.compare(anio, o.anio);
      if(cmp == 0) {
          cmp = Integer.compare(mes, o.mes);
          if(cmp == 0) {
              cmp = Integer.compare(dia, o.dia);
          }
      }
      return cmp;
      
    }
   
   
                    
}
