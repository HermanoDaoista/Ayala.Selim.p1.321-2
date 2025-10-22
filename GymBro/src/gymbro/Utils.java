
package gymbro;


public class Utils {
    
    public static String getHeaderTable() {
        return "|%-20s|%15s|\n".formatted("ENTRENADOR" , "SUELDO");
    }
    
    public static String obtenerSepHorizontal(int length, String sep) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            sb.append(sep);
        }
        return sb.toString() + "\n";
    }
    
    public static String obtenerSepHorizontal(int lenght) {
        return Utils.obtenerSepHorizontal(lenght, "-");
    }
        
    
}
