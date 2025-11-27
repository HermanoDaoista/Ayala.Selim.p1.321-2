/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package config;

import java.nio.file.Path;
import java.nio.file.Paths;


public interface RutasArchivos {
    static final String BASE = "src/resource";
    static final String FILE_CSV = "animales.csv";
    static final String FILE_BIN = "animales.dat";
    
    static Path getRutaCSV() {
        return Paths.get(BASE, FILE_CSV);
    }
    
    static Path getRutaBIN() {
        
        return Paths.get(BASE, FILE_BIN);
    }
    
    static String getRutaCSVString() {
        return getRutaCSV().toString();
    }
    
    static String getRutaBINString() {
        return getRutaBIN().toString();
    }
       
}
