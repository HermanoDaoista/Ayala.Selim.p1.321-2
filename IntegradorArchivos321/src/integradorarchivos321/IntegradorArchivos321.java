/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integradorarchivos321;

import config.RutasArchivos;
import java.util.ArrayList;
import java.util.List;
import model.Empleado;
import persistence.PersistenciaEmpleados;
import service.ServiceEmpleado;


public class IntegradorArchivos321 {


    public static void main(String[] args) {
       
        List<Empleado> empleados = new ArrayList<>();
        
        ServiceEmpleado.hardcodearEmpleados(empleados);
        
        ServiceEmpleado.listarEmpleados(empleados);
        PersistenciaEmpleados.guardarEmpleadosCSV(empleados, RutasArchivos.getRutaCSVString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        ServiceEmpleado.listarEmpleados(PersistenciaEmpleados.cargarEmpleadosCSV(RutasArchivos.getRutaCSVString()));
        
        
        PersistenciaEmpleados.serializarEmpleados(empleados, RutasArchivos.getRutaBINString());
        
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
       ServiceEmpleado.listarEmpleados(PersistenciaEmpleados.deserializarEmpleados(RutasArchivos.getRutaBINString()));

        
    }
    
}
