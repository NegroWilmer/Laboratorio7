package nomina;

public abstract class Empleado {
    protected String identificacion;
    protected String nombre;
    protected int edad;
    protected int anioIngreso;
    protected double salarioBasico;

    public Empleado(String identificacion, String nombre, int edad, int anioIngreso, double salarioBasico) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.anioIngreso = anioIngreso;
        this.salarioBasico = salarioBasico;
    }

    public double calcularBonificacion() {
        return 0; // Se redefine en las clases hijas
    }

    public abstract double liquidarNomina();
}