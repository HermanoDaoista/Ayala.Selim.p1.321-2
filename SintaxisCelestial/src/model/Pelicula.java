/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import service.CSVSerializable;


public class Pelicula implements Comparable<Pelicula>, CSVSerializable, Serializable {
    private int id;
    private String titulo;
    private String director;
    private Genero gen;

    public Pelicula(int id, String titulo, String director, Genero gen) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.gen = gen;
    }

    public String getTitulo() {
        return titulo;
    }
    
    
    
    public boolean esTipo(Genero gen) {
        return this.gen == gen;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", director=" + director + ", gen=" + gen + '}';
    }
    
    @Override
    public int compareTo(Pelicula a) {
        return Integer.compare(id, a.id);
    }
    
    @Override
    public String toCSV() {
        return id + "," + titulo + "," + director + "," + gen + "\n";
    }
    
     public static String toHeaderCSV() {
        return "id,titulo,director,genero\n";
    }
    
    public static Pelicula fromCSV(String PeliCSV) {
        if(PeliCSV.endsWith("\n")) {
            PeliCSV = PeliCSV.substring(0, PeliCSV.length() -1);
        }
        
        String[] valores = PeliCSV.split(",");
        
        if(valores.length == 4) {
            return new Pelicula(Integer.parseInt(valores[0]), valores[1], valores[2], Genero.valueOf(valores[3]));
        }
        return null;
    }
    
    
}
