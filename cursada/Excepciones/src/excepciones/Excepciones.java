/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author rogel
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ProductoPedecedero pd = new ProductoPedecedero("Atun en lata", 0, 90);
       
        
        try {
            pd.vender(90);
        }
    
        catch (StockInsuficienteException error) {
            System.err.println("Error " + error.getMessage());
    }
        catch(PrecioInvalidoException error){
                        System.err.println("Erroris" + error.getMessage());

        }
    
}
}