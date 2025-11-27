/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintaxiscelestial;

import config.RutasArchivos;
import java.io.IOException;
import java.util.List;
import model.Genero;
import model.Pelicula;
import persistence.PersistenciaPeliculas;
import service.Catalogo;

public class SintaxisCelestial {

   
    public static void main(String[] args) {
       try {
// Crear un catálogo de películas
Catalogo<Pelicula> catalogoPeliculas = new Catalogo<>();
catalogoPeliculas.agregar(new Pelicula(1, "El Padrino", "Francis Ford Coppola", Genero.DRAMA));
catalogoPeliculas.agregar(new Pelicula(2, "La La Land", "Damien Chazelle",Genero.COMEDIA));
catalogoPeliculas.agregar(new Pelicula(3, "Guerra Mundial Z", "MarcForster", Genero.TERROR));
catalogoPeliculas.agregar(new Pelicula(4, "Toy Story", "John Lasseter",Genero.ANIMACION));
catalogoPeliculas.agregar(new Pelicula(5, "The Social Dilemma", "JeffOrlowski", Genero.DOCUMENTAL));
// Mostrar todas las películas en el catálogo
System.out.println("Catálogo de películas:");
catalogoPeliculas.paraCadaElemento(a -> System.out.println(a));
// Filtrar películas por género COMEDIA
System.out.println("\nPelículas de género COMEDIA:");
catalogoPeliculas.filtrar(a -> a.esTipo(Genero.COMEDIA)).forEach(a->System.out.println(a));
// Filtrar películas cuyo título contiene "Guerra"
System.out.println("\nPelículas cuyo título contiene 'Guerra':");
catalogoPeliculas.filtrar(a-> a.getTitulo().contains("Guerra")).forEach(a->System.out.println(a));
// Ordenar películas de manera natural (por id)
System.out.println("\nPelículas ordenadas de manera natural (por id):");
catalogoPeliculas.ordenar();
catalogoPeliculas.paraCadaElemento(a->System.out.println(a));
// Ordenar películas por título usando Comparator
System.out.println("\nPelículas ordenadas por título:");
catalogoPeliculas.ordenar((a1,a2)-> a1.getTitulo().compareTo(a2.getTitulo()));
// Guardar el catálogo en archivo binario

//catalogoPeliculas.guardarEnArchivo("src/data/peliculas.dat");
// Cargar el catálogo desde archivo binario
PersistenciaPeliculas.serializarPeli(catalogoPeliculas.getItems(), RutasArchivos.getRutaBINString());
//Catalogo<Pelicula> catalogoCargado = new Catalogo<>();
//catalogoCargado.cargarDesdeArchivo("src/data/peliculas.dat");
List<Pelicula>lista = PersistenciaPeliculas.deserializarPeli(RutasArchivos.getRutaBINString());
System.out.println("\nPelículas cargadas desde archivo binario:");
for(Pelicula p : lista) {
        System.out.println(p);
    
}/*Acá va una expresión Lambda*/
// Guardar el catálogo en archivo CSV
//catalogoPeliculas.guardarEnCSV("src/data/peliculas.csv");
// Cargar el catálogo desde archivo CSV
//catalogoCargado.cargarDesdeCSV("src/data/peliculas.csv",/*Acá va unaexpresión Lambda*/);
System.out.println("\nPelículas cargadas desde archivo CSV:");
//catalogoCargado.paraCadaElemento(/*Acá va una expresión Lambda*/);
} catch (NullPointerException | IndexOutOfBoundsException e) {
System.err.println("Error: " + e.getMessage());
    }
    
}
}
