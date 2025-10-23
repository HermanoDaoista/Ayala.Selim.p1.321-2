/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchacontraelmal;


public class ErrorNombreRepetido extends RuntimeException {
    private static final String MASSAGE = "Nombre de especie repetido";
    
    public ErrorNombreRepetido() {
        super(MASSAGE);
    }
}
