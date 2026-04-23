package nomina;

public class Repartidor extends Empleado {

    private int numeroRepartos;
    private char zona;
    private double valorPorReparto = 10000;
    private double pagoRepartos;
    private double descuento;
    private double neto;

    public Repartidor(String identificacion, String nombre, int edad, int añoIngreso, double salarioBasico, int numeroRepartos, char zona) {
        super(identificacion, nombre, edad, añoIngreso, salarioBasico);
        this.numeroRepartos = numeroRepartos;
        this.zona = validarZona(zona);
        this.pagoRepartos = 0;
        this.descuento = 0;
        this.neto = 0;
    }

    private char validarZona(char zona) {
        if (zona == 'A' || zona == 'B' || zona == 'C' || zona == 'D') return zona;
        return 'C';
    }

    public double calcularPagoRepartos() {
        this.pagoRepartos = numeroRepartos * valorPorReparto;
        return pagoRepartos;
    }

    @Override
    public double calcularBonificacion() {
        int año = java.time.Year.now().getValue() - añoIngreso;
        if (año >= 5 && zona == 'C') return 50000;
        return 0;
    }

    @Override
    public double liquidarNomina() {
        double bonificacion = calcularBonificacion();
        calcularPagoRepartos();

        double bruto = salarioBasico + pagoRepartos + bonificacion;
        this.descuento = bruto * 0.10;
        this.neto = bruto - descuento;

        return neto;
    }

    @Override
    public String toString() {
        return "Repartidor, Identificación: " + identificacion +
               ", Nombre: " + nombre +
               ", Año de Ingreso: " + añoIngreso +
               ", Salario Básico: " + salarioBasico +
               ", Número Repartos: " + numeroRepartos +
               ", Valor Pagado Repartos: " + pagoRepartos +
               ", Descuentos: " + descuento +
               ", Neto Pagado: " + neto;
    }
}
