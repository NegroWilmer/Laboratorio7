package ProductoAbst;

abstract class Producto {
    protected String codigo;
    protected String descripcion;
    protected double precioBase;

    public Producto(String codigo, String descripcion, double precioBase) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioVenta();
}

