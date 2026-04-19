package nomina;

public class Repartidor extends Empleado {

    private int numeroRepartos;
    private char zona;
    private double valorPorReparto = 10000;

    public Repartidor(String identificacion, String nombre, int edad, int anioIngreso, double salarioBasico, int numeroRepartos, char zona) {
        super(identificacion, nombre, edad, anioIngreso, salarioBasico);
        this.numeroRepartos = numeroRepartos;
        this.zona = validarZona(zona);
    }

    private char validarZona(char zona) {
        if (zona == 'A' || zona == 'B' || zona == 'C' || zona == 'D') {
            return zona;
        }
        return 'C';
    }

    public double calcularPagoRepartos() {
        return numeroRepartos * valorPorReparto;
    }

    @Override
    public double calcularBonificacion() {
    	int anios = java.time.Year.now().getValue() - anioIngreso;
        if (anios >= 5 && zona == 'C') {
            return 50000;
        }
        return 0;
    }

    @Override
    public double liquidarNomina() {
        double pagoRepartos = calcularPagoRepartos();
        double bonificacion = calcularBonificacion();

        double bruto = salarioBasico + pagoRepartos + bonificacion;
        double descuento = bruto * 0.10;

        return bruto - descuento;
    }

    @Override
    public String toString() {
        double pagoRepartos = calcularPagoRepartos();
        double bonificacion = calcularBonificacion();
        double bruto = salarioBasico + pagoRepartos + bonificacion;
        double descuento = bruto * 0.10;
        double neto = bruto - descuento;

        return "Repartidor, Identificación: " + identificacion +
               ", Nombre: " + nombre +
               ", Año de Ingreso: " + anioIngreso +
               ", Salario Básico: " + salarioBasico +
               ", Número Repartos: " + numeroRepartos +
               ", Valor Pagado Repartos: " + pagoRepartos +
               ", Descuentos: " + descuento +
               ", Neto Pagado: " + neto;
    }
}