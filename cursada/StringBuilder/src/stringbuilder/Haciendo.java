/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringbuilder;

/**
 *
 * @author rogel
 */
public class Haciendo {
    
    public String encadenado()
    {
        StringBuilder cadena = new StringBuilder("");
    
        for (int i = 1; i <= 100; i++)
       {
        cadena.append(i).append("-");
        }
    return "Tiene " + cadena.length() +" Caracteres" + "\n" + cadena.toString();
    }
    
}
