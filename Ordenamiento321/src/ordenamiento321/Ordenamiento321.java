
package ordenamiento321;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Ordenamiento321 {

    
    public static void main(String[] args) {
        List<Empleado> lista = new ArrayList<>();
        List<String> nombres = new ArrayList<>(List.of("Juan", "Pedro", "Bartolo"));
        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,54,321,2,7,89));
        
        cargarEmpleados(lista);
       //una clase anonima 
        Comparator<Empleado> c = new Comparator<>(){
            @Override
            public int compare(Empleado o1, Empleado o2) {
                    return o1.getSector().name().compareTo(o2.getSector().name());
                
            }

            };
            
        
        Collections.sort(lista, c);
        //lista.sort(Comparator.reverseOrder());
       Collections.sort(lista, new Comparator<>() {
           @Override
           public int compare(Empleado e1, Empleado e2) {
               return e1.getFechaIngreso().compareTo(e2.getFechaIngreso());
           }
           
       });
       //Collections.sort(lista, new ComparadorEmpleadoGenero());
       
       
        
        //mostrarLista(lista);
        
        listarEmpleados(lista);
                
        
        
        
        
    }
    
    public static void cargarEmpleados(List<? super Empleado> lista) {
        lista.add(new Empleado(1234, "Juan", 'm', new Date(1, 2, 2020), 34, Sector.CONTABLE, 1000));
        lista.add(new Empleado(2132, "Juana", 'f', new Date(23, 4, 2024), 21, Sector.SISTEMA, 2000));
        lista.add(new Empleado(3928, "Felisa", 'f', new Date(1, 2, 2023), 21, Sector.CONTABLE, 1450));
        lista.add(new Empleado(2833, "Mario", 'm', new Date(18, 7, 2023), 23, Sector.RRHH, 1700));
        lista.add(new Empleado(9483, "Andrea", 'f', new Date(10, 8, 2022), 25, Sector.SISTEMA, 1340));
        lista.add(new Empleado(1123, "Joaquin", 'm', new Date(1, 7, 2021), 22, Sector.RRHH, 2300));
        lista.add(new Empleado(5643, "Agustina", 'f', new Date(1, 9, 2020), 27, Sector.LEGALES, 1180));

    }
    
    public static void listarEmpleados(List<? extends Empleado> lista) {
        for(Empleado emp : lista) {
            System.out.println(emp);
        
    }
    }
    
        public static void mostrarLista(List<?> objetos) {
        for(Object elemento : objetos) {
            System.out.println(elemento);
        }
    }
    
}
