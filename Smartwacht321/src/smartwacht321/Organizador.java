/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package smartwacht321;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public interface Organizador {

    static List<Tarea> filtrarTareas(List<Tarea> tareas, FiltroTarea filtro) {
        List<Tarea> toReturn = new ArrayList<>();

        for (Tarea tarea : tareas) {
            if (filtro.test(tarea)) {
                toReturn.add(tarea);
            }
        }

        return toReturn;

    }

    static List<Tarea> ordenarTareas(List<Tarea> tareas, Comparator<Tarea> criterio) {
        List<Tarea> ordenada = new ArrayList<>(tareas);
        ordenada.sort(criterio);

        return ordenada;
    }

    static void aplicarAccion(List<Tarea> tareas, AccionTarea accion) {
        //tareas.forEach(accion::ejecutar);
        
        tareas.forEach(tarea-> accion.ejecutar(tarea));
    }
        
    }



