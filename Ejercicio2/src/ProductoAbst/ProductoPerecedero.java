package ProductoAbst;

class ProductoPerecedero extends Producto {
    private RangoCaducidad estadoCaducidad;

    public ProductoPerecedero(String codigo, String descripcion, double precioBase, RangoCaducidad estado) {
        super(codigo, descripcion, precioBase);
        this.estadoCaducidad = estado;
    }

    @Override
    public double calcularPrecioVenta() {
        return precioBase / estadoCaducidad.getDivisor();
    }

    @Override
    public String toString() {
        return "Perecedero, " + codigo + ", " + descripcion + ", " + precioBase + ", " + estadoCaducidad.getEtiqueta();
    }
}
