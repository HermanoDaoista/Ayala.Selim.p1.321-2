
package archivos321;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivos321 {


    public static void main(String[] args) {
       
        String path = "src/resources/mensaje.txt";
        
        File pergamino = new File(path);
        
        System.out.println(pergamino.exists());
        try{
        pergamino.createNewFile();}
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println(pergamino.exists());
        System.out.println(pergamino.getAbsolutePath());
        System.out.println(pergamino.getName());
        System.out.println(pergamino.getParent());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        try{
        FileReader lector = new FileReader(pergamino);
        lector.
        
        }catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
