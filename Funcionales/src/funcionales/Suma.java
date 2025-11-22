
package funcionales;

/**
 *
 * @author rogel
 */
public class Suma implements OperacionBinaria<Integer>{

    @Override
    public Integer operar(Integer o1, Integer o2) {
        return o1 + o2;
    }
}
