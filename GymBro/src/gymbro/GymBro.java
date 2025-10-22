
package gymbro;

import java.time.LocalDate;

public class GymBro {


    public static void main(String[] args) {
        
        
        Gimnasio gymbro = new Gimnasio("Gym-Bro");
        
        gymbro.agregarEntrenador(new PersonalTrainer(2312, "Juan", "Bolt", LocalDate.of(2022, 8, 15),  1000, 10, 45));
        gymbro.agregarEntrenador(new PersonalTrainer(7654, "Horacio", "Cobol", LocalDate.of(2020, 8, 15),  3000, 50, 45));
        gymbro.agregarEntrenador(new PersonalTrainer(1987, "Arturo", "Duro", LocalDate.of(2017, 8, 15),  1000, 3, 8));
        gymbro.agregarEntrenador(new EntrenadorEquipo(8765, "Pepo", "Ursuc", LocalDate.of(1982,4,27), 8000));
        gymbro.agregarEntrenador(new EntrenadorEquipo(9373, "Horacio", "Gimnasio", LocalDate.of(1998,4,27), 8000));
        gymbro.agregarEntrenador(new EntrenadorEquipo(4553, "Fantino", "Zeus", LocalDate.of(2025,4,27), 8000));
        
        gymbro.mostrarSueldos();
        
        System.out.println(gymbro.entrenadorConMasClientes().nombreCompleto());
    }
    
}
