/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package funcionales;

/**
 *
 * @author rogel
 */
public interface OperacionBinariaPro<T,R> extends OperacionBinariaFull<T, T,R>{
    @Override
    R operar(T o1, T o2);
}
