/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luchacontraelmal2;


import java.util.Comparator;
import model.Animal;
import model.TipoAilmentacion;
import service.Zoologico;

public class LuchaContraElMal2 {

   
    public static void main(String[] args) {
            try {
            // Crear un zoológico de animales
            Zoologico<Animal> zoologico = new Zoologico<>();
            zoologico.agregar(new Animal(1, "Leon", "Panthera leo",
                    TipoAilmentacion.CARNIVORO));
            zoologico.agregar(new Animal(2, "Elefante", "Loxodonta",
                    TipoAilmentacion.HERVIBORO));
            zoologico.agregar(new Animal(3, "Oso", "Ursus arctos",
                    TipoAilmentacion.OMNIVORO));
            zoologico.agregar(new Animal(4, "Zorro", "Vulpes vulpes",
                    TipoAilmentacion.CARNIVORO));
            zoologico.agregar(new Animal(5, "Gorila", "Gorilla gorilla",
                    TipoAilmentacion.OMNIVORO));
            // Mostrar todos los animales en el zoológico
            System.out.println("Inventario de animales:");
            zoologico.paraCadaElemento(animal -> System.out.println(animal));
            // Filtrar animales por tipo de alimentación CARNIVORO
            System.out.println("\nAnimales CARNIVOROS:");
            zoologico.filtrar(a -> a.esTipo(TipoAilmentacion.CARNIVORO))
                    .forEach(animal -> System.out.println(animal));
            // Filtrar animales cuyo nombre contiene "León"
            System.out.println("\nAnimales cuyo nombre contiene 'León':");
            zoologico.filtrar((a -> a.getNombre().equals("Leon"))).forEach(animal -> System.out.println(animal));
            //zoologico.filtrar((a -> a.getNombre().equals("Leon"))).forEach(animal -> System.out.println(animal));
            // Ordenar animales de manera natural (por id)
            System.out.println("\nAnimales ordenados de manera natural (por id):");
            zoologico.ordenarAnimales();
            zoologico.paraCadaElemento(animal -> System.out.println(animal));
            // Ordenar animales por nombre utilizando un Comparator
            System.out.println("\nAnimales ordenados por nombre:");
            Comparator<Animal> compPorNombre = (a1, a2) -> a1.getNombre().compareTo(a2.getNombre());
                                                                            
            
            for (Animal a : zoologico.ordenarAnimales(compPorNombre)) {
                        System.out.println(a);
                }
            // Guardar el zoológico en un archivo binario
            zoologico.guardarEnArchivo("src/data/animales.dat");
            // Cargar el zoológico desde el archivo binario
            Zoologico<Animal> zoologicoCargado = new Zoologico<>();
            zoologicoCargado.cargarDesdeArchivo("src/data/animales.dat");
            System.out.println("\nAnimales cargados desde archivo binario:");
            zoologicoCargado.paraCadaElemento(animal -> System.out.println(animal));
            // Guardar el zoológico en un archivo CSV
            zoologico.guardarEnCSV("src/data/animales.csv");
            // Cargar el zoológico desde el archivo CSV
            zoologicoCargado.cargarDesdeCSV("src/data/animales.csv");
            System.out.println("\nAnimales cargados desde archivo CSV:");
            zoologicoCargado.paraCadaElemento(animal -> System.out.println(animal));
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
    

