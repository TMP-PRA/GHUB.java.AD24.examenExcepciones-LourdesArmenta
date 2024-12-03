package miPrincipal;

public class Principal {
    

    public static void main(String[] args) {
        Paciente[] pacientes = new Paciente[10]; // Suponiendo que sabemos que hay 10 registros
        int index = 0;

        pacientes = LeerPacientes.cargarPacientes("pacientes.txt", 10);

        for (Paciente paciente : pacientes) {
            if (paciente != null) {
                System.out.println("Paciente creado: " + paciente);
            }
        }

        System.out.println("Programa terminado.");
    }
        
    
}