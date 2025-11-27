/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luchacontraelmal3;

import config.RutasArchivos;
import static java.lang.System.out;
import model.Animal;
import model.TipoAlimentacion;
import model.Zoologico;
import persistence.PersistenciaAnimales;
import service.ServiceAnimal;

/**
 *
 * @author rogel
 */
public class LuchaContraElMal3 {

   
    public static void main(String[] args) {
        try {
// Crear un zoológico de animales
Zoologico<Animal> zoologico = new Zoologico<>();
ServiceAnimal.hardcodearAnimales(zoologico.getItems());
// Mostrar todos los animales en el zoológico
System.out.println("Inventario de animales:");
ServiceAnimal.listarAnimales(zoologico.getItems());
// Filtrar animales por tipo de alimentación CARNIVORO
System.out.println("\nAnimales CARNIVOROS:");
zoologico.filtrar(a-> a.esTipo(TipoAlimentacion.CARNIVORO)).forEach(animal -> System.out.println(animal));
// Filtrar animales cuyo nombre contiene "León"
System.out.println("\nAnimales cuyo nombre contiene 'León':");
zoologico.filtrar((a->a.getNombre().equals("Leon"))).forEach(animal -> System.out.println(animal));
// Ordenar animales de manera natural (por id)
System.out.println("\nAnimales ordenados de manera natural (por id):");
zoologico.ordenar();
zoologico.paraCadaElemento(animal -> System.out.println(animal));
// Ordenar animales por nombre utilizando un Comparator
System.out.println("\nAnimales ordenados por nombre:");
zoologico.ordenar((a1,a2) -> a1.getNombre().compareTo(a2.getNombre()));
zoologico.paraCadaElemento(animal -> System.out.println(animal));
// Guardar el zoológico en un archivo binario
PersistenciaAnimales.serializarAnimal(zoologico.getItems(), RutasArchivos.getRutaBINString());
// Cargar el zoológico desde el archivo binario
//Zoologico<Animal> zoologicoCargado = new Zoologico<>();
PersistenciaAnimales.deserializarAnimal(RutasArchivos.getRutaBINString());
System.out.println("\nAnimales cargados desde archivo binario:");
zoologico.paraCadaElemento(animal -> System.out.println(animal));
// Guardar el zoológico en un archivo CSV
PersistenciaAnimales.guardarAnimalCSV(zoologico.getItems(), RutasArchivos.getRutaCSVString());
// Cargar el zoológico desde el archivo CSV
PersistenciaAnimales.cargarAnimalCSV(RutasArchivos.getRutaCSVString());
System.out.println("\nAnimales cargados desde archivo CSV:");
zoologico.paraCadaElemento(animal -> System.out.println(animal));
} catch (NullPointerException | IndexOutOfBoundsException e) {
System.err.println("Error: " + e.getMessage());
}
}
    
}
