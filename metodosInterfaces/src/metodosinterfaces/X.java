
package metodosinterfaces;


public class X extends Z implements A , B{

    @Override
    public String saludar() {
        return B.super.saludar();
        
    }
    
    
}
