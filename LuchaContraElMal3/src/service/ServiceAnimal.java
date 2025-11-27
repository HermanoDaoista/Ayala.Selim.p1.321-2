/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Animal;
import model.TipoAlimentacion;


public class ServiceAnimal {
     public static void hardcodearAnimales(List<? super Animal> lista) {
         lista.add(new Animal(1, "Leon", "Panthera leo",TipoAlimentacion.CARNIVORO));
         lista.add(new Animal(2, "Elefante", "Loxodonta",TipoAlimentacion.HERBIVORO));
         lista.add(new Animal(3, "Oso", "Ursus arctos",TipoAlimentacion.OMNIVORO));
         lista.add(new Animal(4, "Zorro", "Vulpes vulpes",TipoAlimentacion.CARNIVORO));
         lista.add(new Animal(1, "Gorila", "Gorilla gorilla",TipoAlimentacion.OMNIVORO));
         
                 
     }
     
      public static void listarAnimales(List<? extends Animal> lista) {
        lista.forEach(System.out::println);
    }

}
