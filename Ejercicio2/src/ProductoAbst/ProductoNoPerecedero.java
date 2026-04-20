package ProductoAbst;

class ProductoNoPerecedero extends Producto {
    private Calidad tipo;

    public ProductoNoPerecedero(String codigo, String descripcion, double precioBase, Calidad tipo) {
        super(codigo, descripcion, precioBase);
      
        this.tipo = (tipo == null) ? Calidad.B : tipo;
    }

    @Override
    public double calcularPrecioVenta() {
        switch (tipo) {
            case A: return precioBase * 1.03;
            case B: return precioBase * 1.02;
            case C: return precioBase * 1.015;
            default: return precioBase;
        }
    }

    @Override
    public String toString() {
        return "No Perecedero, " + codigo + ", " + descripcion + ", " + precioBase + ", " + tipo;
    }
}
