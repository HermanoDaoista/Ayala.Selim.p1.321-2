
package compumundo321;


public class Utils {
    public static String sepHorizontal(int largo) {
        return sepHorizontal(largo, '-');
            
        
    }


 public static String sepHorizontal(int largo, char caracter) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < largo; i++) {
            sb.append(caracter);
    }
        sb.append('\n');
        return sb.toString();
    }
 
            
        
 
 
}