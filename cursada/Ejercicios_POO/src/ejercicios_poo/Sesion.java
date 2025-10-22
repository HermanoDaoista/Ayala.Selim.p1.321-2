/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_poo;



/**
 *
 * @author rogel
 */
public class Sesion {
    
 static String usuarioLogueado;
 
 
 public static void login(String Usuario) {
       usuarioLogueado = Usuario;
       
 }
 
 public static void logout() {
         System.out.println("Saliendo...");
         usuarioLogueado = null;
 }
 
 public static void mostrarEstado() {
         if (usuarioLogueado == null) {
                System.out.println("No hay ninguna sesion abierta ");

         }else {
         System.out.println("El usario " + usuarioLogueado + " esta logueado" );
         }
 }
    
}
