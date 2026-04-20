package ProductoAbst;

import java.util.ArrayList;

public class Empresa {

    public static void main(String[] args) {
        System.out.println("PROGRAMA CIENCIAS DE LA COMPUTACIÓN E INTELIGENCIA ARTIFICIAL");
        System.out.println("ASIGNATURA FUNDAMENTOS DE DISEÑO DE SOFTWARE");
        System.out.println("Laboratorio # 7 Relaciones entre clase herencia, clase abstractas, polimorfismo");
        System.out.println("----------------------------------------------------------------------\n");

    
        ArrayList<Producto> listaProductos = new ArrayList<>();

     
        listaProductos.add(new ProductoPerecedero("P001", "Leche Entera", 3600.0, RangoCaducidad.UN_DIA));
        listaProductos.add(new ProductoPerecedero("P002", "Yogurt Fresa", 2400.0, RangoCaducidad.DOS_DIAS));
        listaProductos.add(new ProductoPerecedero("P003", "Pan Artesanal", 5000.0, RangoCaducidad.TRES_DIAS));

       
        listaProductos.add(new ProductoNoPerecedero("NP01", "Arroz Premium", 4500.0, Calidad.A));
        listaProductos.add(new ProductoNoPerecedero("NP02", "Aceite Girasol", 12000.0, Calidad.C));
        listaProductos.add(new ProductoNoPerecedero("NP03", "Sal Marina", 1800.0, Calidad.A));

       
        System.out.println("--- DATOS DE LOS PRODUCTOS ---");
        for (Producto p : listaProductos) {
            System.out.println(p.toString());
        }

        System.out.println("\n");


        System.out.println("--- REPORTE DE VENTAS CON PRECIO FINAL ---");
        for (Producto p : listaProductos) {

            System.out.println(p.toString() + ", " + p.calcularPrecioVenta());
        }
    }
}
