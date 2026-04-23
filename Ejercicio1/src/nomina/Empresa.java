package nomina;

import java.util.ArrayList;

public class Empresa {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Vendedor("1", "Juan", 45, 1990, 2000000, 5000000));
        empleados.add(new Vendedor("2", "Ana", 30, 2010, 1800000, 3000000));
        empleados.add(new Vendedor("3", "Luis", 50, 1985, 2200000, 7000000));

        empleados.add(new Repartidor("4", "Carlos", 28, 2018, 1500000, 50, 'A'));
        empleados.add(new Repartidor("5", "Maria", 35, 2015, 1600000, 70, 'C'));
        empleados.add(new Repartidor("6", "Pedro", 40, 2010, 1700000, 80, 'Z'));

     
        System.out.println("=== DATOS INICIALES ===");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

   
        System.out.println("\n=== NOMINA ===");
        for (Empleado empleado : empleados) {
            empleado.liquidarNomina();
            System.out.println(empleado);
        }
    }
}
