package nomina;

public class Vendedor extends Empleado {

    private double totalVentas;
    private double comision;
    private double descuento;
    private double neto;

    public Vendedor(String identificacion, String nombre, int edad, int anioIngreso, double salarioBasico, double totalVentas) {
        super(identificacion, nombre, edad, anioIngreso, salarioBasico);
        this.totalVentas = totalVentas;
        this.comision = 0;
        this.descuento = 0;
        this.neto = 0;
    }

    public double calcularComision() {
        this.comision = totalVentas * 0.15;
        return comision;
    }

    @Override
    public double calcularBonificacion() {
        int año = java.time.Year.now().getValue() - anioIngreso;
        if (año > 20) return 100000;
        return 0;
    }

    @Override
    public double liquidarNomina() {
        double bonificacion = calcularBonificacion();
        calcularComision();

        double bruto = salarioBasico + comision + bonificacion;
        this.descuento = bruto * 0.10;
        this.neto = bruto - descuento;

        return neto;
    }

    @Override
    public String toString() {
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
