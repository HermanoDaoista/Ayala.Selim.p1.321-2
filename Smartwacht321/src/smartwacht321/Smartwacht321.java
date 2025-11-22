/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartwacht321;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Smartwacht321 {


    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        
        agregarTarea(tareas, crearTarea(()-> new Tarea("estudiar", false, LocalDate.of(2025, 11, 23), 120, Prioridad.ALTA)));
        agregarTarea(tareas, crearTarea(()-> new Tarea("comprar", true, LocalDate.of(2025, 11, 13), 90, Prioridad.MEDIA)));
        agregarTarea(tareas, crearTarea(()-> new Tarea("entrenar", false, LocalDate.of(2025, 11, 20), 60, Prioridad.BAJA)));



    List<Tarea> completada = Organizador.filtrarTareas(tareas, (t) -> t.isCompletada());
    List<Tarea> tareasXPrioridad = Organizador.ordenarTareas(tareas, (t1,t2)->t2.getPrioridad().compareTo(t1.getPrioridad()));
    List<Tarea> enviarRecordatorio87
    
        mostrarTareas(tareasXPrioridad);
}
    
    public static void agregarTarea(List<? super Tarea> tareas, Tarea tarea) {
        tareas.add(tarea);
    }
    
    public static void mostrarTareas(List<? extends Tarea> tareas) {
        tareas.forEach(System.out::println);
    }
    
    public static Tarea crearTarea(Supplier<Tarea> s) {
        return s.get();
    }
    
    
}
