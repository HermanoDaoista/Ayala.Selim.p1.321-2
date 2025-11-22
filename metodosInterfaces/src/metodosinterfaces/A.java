
package metodosinterfaces;

public interface A {
    default String saludar() {
        return "Hola desde A ";
    }
}
