/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Empleado;
import model.Sector;

/**
 *
 * @author rogel
 */
public class ServiceEmpleado {
   
    public static void hardcodearEmpleados(List<? super Empleado> lista) {
        lista.add(new Empleado(1234, "juan", 1230, Sector.CONTABLE));
        lista.add(new Empleado(3454, "pepe", 1980, Sector.CONTABLE));
        lista.add(new Empleado(7218, "luis", 1234,Sector.VENTAS));
        lista.add(new Empleado(4560, "julian", 2340, Sector.RRHH));
        lista.add(new Empleado(1044, "juana", 1040, Sector.SISTEMAS));
    }
    
    public static void listarEmpleados(List<? extends Empleado> lista) {
        lista.forEach(System.out::println);
    }
    
}
