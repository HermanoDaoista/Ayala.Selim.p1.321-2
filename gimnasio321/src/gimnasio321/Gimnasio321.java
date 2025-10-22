
package gimnasio321;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.security.auth.kerberos.EncryptionKey;

public class Gimnasio321 {


    public static void main(String[] args) {
        gimnasio gym = new gimnasio("MuscleUP");
        caragarGym(gym);
         gym.mostrarSueldos();
         System.out.println("----------------------------------------------------------------------");
         System.out.println(gym.entrenadorConMasClientes().toString());
        
    }
    

    
    
    
    public static void caragarGym(gimnasio gym) {
        gym.agregarEntrenador(new EntrenadorEquipo(500, 1231, "Luis", "Peres", LocalDate.MIN));
        gym.agregarEntrenador(new EntrenadorEquipo(200, 1231, "Loos", "Zeres", LocalDate.MIN));
        gym.agregarEntrenador(new EntrenadorEquipo(100, 1231, "puis", "Leres", LocalDate.MIN));
        gym.agregarEntrenador(new EntrenadorEquipo(300, 1231, "zuis", "Veres", LocalDate.MIN));
        gym.agregarEntrenador(new PersonalTrainer("Zuan", "Fort", LocalDate.MIN, 400, 10, 5, 1332));
        gym.agregarEntrenador(new PersonalTrainer("pitfall", "Lort", LocalDate.MIN, 400, 16, 5, 1332));
        gym.agregarEntrenador(new PersonalTrainer("Luan", "Rort", LocalDate.MIN, 400, 12, 5, 1332));
        gym.agregarEntrenador(new PersonalTrainer("Yuan", "Tort", LocalDate.MIN, 400, 13, 5, 1332));
        gym.agregarEntrenador(new PersonalTrainer("Tuan", "Bort", LocalDate.MIN, 400, 1, 5, 1332));
        
    }
    
}
