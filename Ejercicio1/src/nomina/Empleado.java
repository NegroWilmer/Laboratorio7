package nomina;

public abstract class Empleado {
    protected String identificacion;
    protected String nombre;
    protected int edad;
    protected int añoIngreso;
    protected double salarioBasico;

    public Empleado(String identificacion, String nombre, int edad, int añoIngreso, double salarioBasico) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.añoIngreso = añoIngreso;
        this.salarioBasico = salarioBasico;
    }

    public double calcularBonificacion() {
        return 0;
    }

    public abstract double liquidarNomina();
}
