public class Estudiante extends Persona { // HERENCIA: Estudiante es una subclase de Persona
    private String codigo;
    private String carrera;
    private String[] materiasInscritas;
    private int totalMaterias;

    public Estudiante(String nombre, String identificacion, String correo,
        String codigo, String carrera) {
        super(nombre, identificacion, correo);
        this.codigo = codigo;
        this.carrera = carrera;
        this.materiasInscritas = new String[10];
        this.totalMaterias = 0;
    }

    // SOBREESCRITURA POLIMORFISMO DINÁMICO
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy estudiante de: " + carrera);
        System.out.println("Código estudiantil: " + codigo);
        System.out.println("Materias inscritas: " + totalMaterias);
    }

    // SOBRECARGA - versión 1 (sin grupo) POLIMORFISMO ESTÁTICO
    public void inscribir(String materia) {
        if (totalMaterias >= 10) {
            System.out.println("Límite de materias alcanzado (máximo 10)");
            return;
        }
        materiasInscritas[totalMaterias] = materia;
        totalMaterias = totalMaterias + 1;
        System.out.println("Materia inscrita: " + materia + " (sin grupo específico)");
    }

    // SOBRECARGA - versión 2 (con grupo) POLIMORFISMO ESTÁTICO
    public void inscribir(String materia, int grupo) {
        if (totalMaterias >= 10) {
            System.out.println("Límite de materias alcanzado (máximo 10)");
            return;
        }
        String registro = materia + " - Grupo " + grupo;
        materiasInscritas[totalMaterias] = registro;
        totalMaterias = totalMaterias + 1;
        System.out.println("Materia inscrita: " + registro);
    }

    public void mostrarMaterias() {
        if (totalMaterias == 0) {
            System.out.println("No hay materias inscritas");
            return;
        }
        System.out.println("Materias de " + getNombre() + ":");
        for (int i = 0; i < totalMaterias; i++) {
            System.out.println("  " + (i + 1) + ". " + materiasInscritas[i]);
        }
    }
}
