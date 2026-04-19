package nomina;

public class Empresa {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[6];

        empleados[0] = new Vendedor("1", "Juan", 45, 1990, 2000000, 5000000);
        empleados[1] = new Vendedor("2", "Ana", 30, 2010, 1800000, 3000000);
        empleados[2] = new Vendedor("3", "Luis", 50, 1985, 2200000, 7000000);

        empleados[3] = new Repartidor("4", "Carlos", 28, 2018, 1500000, 50, 'A');
        empleados[4] = new Repartidor("5", "Maria", 35, 2015, 1600000, 70, 'C');
        empleados[5] = new Repartidor("6", "Pedro", 40, 2010, 1700000, 80, 'Z'); // zona inválida

        System.out.println("=== NOMINA ===");

        for (Empleado e : empleados) {
            System.out.println(e.toString());
        }
    }
}