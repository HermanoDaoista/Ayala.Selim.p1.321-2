
package ContadorString;


public class contador {
     
    
    public int contarCaracteres(String caracteres)
    {
        return caracteres.length();
    }
    public int cantidadDePalabras(String caracteres)
    {
        String[] palabras = caracteres.trim().split("\\s+");
        
        return palabras.length;
    }
    public void minusmayus(String caracteres)
    {
        String mensaje = caracteres.toLowerCase();
        String mensajemi = caracteres.toUpperCase();
        System.out.println(mensaje + " " + mensajemi);
        
    }
    public void buscarJava(String frase, String buscada)
    {   boolean encontrada = false;
        String[] palabras = frase.split("\\s+");
        for (String palabra : palabras) {
                 if(palabra.equalsIgnoreCase(buscada))
                 {
                     encontrada = true;
                     break;
                 }
        }
        if(encontrada) 
        {
            System.out.println("Se encontro");
        }else
        {
            System.out.println("No se encontro");
        }
        
    }
}
