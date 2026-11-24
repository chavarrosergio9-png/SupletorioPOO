public abstract class Persona {
    private String nombre;
    private String identificacion;
    private String correo;

    public Persona(String nombre, String identificacion, String correo) {
        this.nombre = validar(nombre);
        this.identificacion = validar(identificacion);
        this.correo = validar(correo);
    }

    // Si el valor es nulo o vacío, se asigna "No definido"
    private String validar(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            return "No definido";
        }
        return valor;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Correo: " + correo);
    }

    public void actualizarCorreo(String nuevoCorreo) {
        if (nuevoCorreo != null && nuevoCorreo.contains("@") && nuevoCorreo.contains(".")) {
            correo = nuevoCorreo;
            System.out.println("Correo actualizado a: " + correo);
        } else {
            System.out.println("Correo inválido. No se realizó el cambio.");
        }
    }

    public String getNombre() { // Encapsulamiento: método getter para obtener el nombre
        return nombre;
    }
}
