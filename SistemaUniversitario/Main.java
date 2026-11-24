public class Main {
    public static void main(String[] args) {
        // Crear personas de cada tipo
        Estudiante estudiante = new Estudiante("Ana Martínez", "1001234567", "ana@uni.edu",
                "2024100101", "Ingeniería de Sistemas");

        EstudianteGraduado graduado = new EstudianteGraduado("Carlos Pérez", "1009876543", "carlos@uni.edu",
                "2020100045", "Ingeniería de Sistemas",
                "Ingeniero de Sistemas",
                "Sistema de detección de fraude con ML",
                "Dr. Ramírez");

        Profesor profesor = new Profesor("Dra. Laura Gómez", "52001234", "lgomez@uni.edu",
                "Ciencias de la Computación", 32, 4500000.0);

        // Demostrar SOBRECARGA de inscribir (dos métodos con el mismo nombre pero diferente firma)
        estudiante.inscribir("Programación OOP");          // sin grupo
        estudiante.inscribir("Bases de Datos", 2);         // con grupo 2
        estudiante.inscribir("Estructuras de Datos", 1);   // con grupo 1
        estudiante.mostrarMaterias();

        // El graduado también puede inscribir (heredó el método)
        graduado.inscribir("Seminario de Investigación", 1);

        // Demostrar SOBREESCRITURA de presentarse en los tres niveles
        System.out.println("--- ESTUDIANTE ---");
        estudiante.presentarse();

        System.out.println("--- ESTUDIANTE GRADUADO ---");
        graduado.presentarse();

        System.out.println("--- PROFESOR ---");
        profesor.presentarse();

        // Demostrar calcularSalario final
        profesor.calcularSalario();

        // Actualizar correos usando el método heredado de Persona
        estudiante.actualizarCorreo("ana.martinez@universidad.edu.co");
        profesor.actualizarCorreo("correo-invalido");   // debe rechazarse

        // Mostrar proyecto del graduado
        graduado.mostrarProyecto();

        // Polimorfismo: arreglo de Persona
        Persona[] comunidad = { estudiante, graduado, profesor };
        System.out.println("--- TODOS SE PRESENTAN ---");
        for (Persona persona : comunidad) {
            persona.presentarse();   // cada uno tiene su versión, polimorfismo dinámico
            System.out.println("----");
        }
    }
}