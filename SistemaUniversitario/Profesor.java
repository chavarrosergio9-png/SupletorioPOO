public class Profesor extends Persona {
    private String departamento;
    private int horasContrato;
    private double salarioBase;

    public Profesor(String nombre, String identificacion, String correo,
                    String departamento, int horasContrato, double salarioBase) {
        super(nombre, identificacion, correo);
        this.departamento = departamento;
        this.horasContrato = horasContrato;
        this.salarioBase = salarioBase;
    }

    // SOBREESCRITURA
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy profesor del departamento de: " + departamento);
        System.out.println("Contrato: " + horasContrato + " horas semanales");
    }

    // final: ninguna subclase puede sobreescribir este método
    public final double calcularSalario() {
        // Prima de 15% sobre el salario base por cada 10 horas sobre 20
        int horasExtra = horasContrato - 20;
        if (horasExtra < 0) {
            horasExtra = 0;
        }
        double bonificacion = (horasExtra / 10) * (salarioBase * 0.15);
        double salarioTotal = salarioBase + bonificacion;
        System.out.println("Salario de " + getNombre() + ": $" + salarioTotal);
        System.out.println("  Base: $" + salarioBase);
        System.out.println("  Bonificación por horas: $" + bonificacion);
        return salarioTotal;
    }

    public void mostrarInfo() {
        presentarse();
        System.out.println("Salario mensual: $" + calcularSalario());
    }
}