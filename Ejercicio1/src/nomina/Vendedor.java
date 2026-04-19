package nomina;

public class Vendedor extends Empleado {

    private double totalVentas;
    private double comision;

    public Vendedor(String identificacion, String nombre, int edad, int anioIngreso, double salarioBasico, double totalVentas) {
        super(identificacion, nombre, edad, anioIngreso, salarioBasico);
        this.totalVentas = totalVentas;
    }

    public double calcularComision() {
        this.comision = totalVentas * 0.15;
        return comision;
    }

    @Override
    public double calcularBonificacion() {
    	int anios = java.time.Year.now().getValue() - anioIngreso;
        if (anios > 20) {
            return 100000;
        }
        return 0;
    }

    @Override
    public double liquidarNomina() {
        double comision = calcularComision();
        double bonificacion = calcularBonificacion();

        double bruto = salarioBasico + comision + bonificacion;
        double descuento = bruto * 0.10;

        return bruto - descuento;
    }

    @Override
    public String toString() {
        double comision = calcularComision();
        double bonificacion = calcularBonificacion();
        double bruto = salarioBasico + comision + bonificacion;
        double descuento = bruto * 0.10;
        double neto = bruto - descuento;

        return "Vendedor, Identificación: " + identificacion +
               ", Nombre: " + nombre +
               ", Año de Ingreso: " + anioIngreso +
               ", Salario Básico: " + salarioBasico +
               ", Total Ventas: " + totalVentas +
               ", Valor Comisión: " + comision +
               ", Descuentos: " + descuento +
               ", Neto Pagado: " + neto;
    }
}