/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionales;

public class Division implements OperacionBinariaPro<Integer, Double>{

    @Override
    public Double operar(Integer o1, Integer o2) {
       return (double) o1 / o2;
    }
    
}
