
package funcionales;

public class Funcionales {


    public static void main(String[] args) {
        Integer x = 20;
        Integer y =30;
        OperacionBinariaPro<Double, Double> resta = new OperacionBinaria<Double>() {
            @Override
            public Double operar(Double o1, Double o2) {
                return o1 - o2;
            }
        };
        
        
        realizarOperacion(x, y, new Suma());
        realizarOperacion(x.doubleValue(), y.doubleValue(), resta);
        realizarOperacion(10,2, new Division());
        realizarOperacion("Hola", "Mundo", (a, b) -> a+b);
        //realizarOperacion("Hola", "Mundo", (a, b) -> a.+b);
                
    }
    
    
    
    public static <T,R> void realizarOperacion(T op1, T op2, OperacionBinariaPro<T,R> o) {
        R resultado = o.operar(op1, op2);
        System.out.println(resultado);
    }
    
    public static <T>void discriminar(T elemento, Patovica<T> pato ) {
         System.out.println(pato.admitir(elemento) ? "Pasa " : " No pasa");
    }
    
}
