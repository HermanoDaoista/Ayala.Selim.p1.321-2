/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author rogel
 */
public interface RutasArchivos {
    static final String BASE = "src/resources";
    static final String FILE_CSV = "peliculas.csv";
    static final String FILE_BIN = "peliculas.dat";
    
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
