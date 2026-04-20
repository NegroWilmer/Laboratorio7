package ProductoAbst;

public enum RangoCaducidad {
    UN_DIA(4, "1 día"), 
    DOS_DIAS(3, "2 días"), 
    TRES_DIAS(2, "3 días"), 
    NORMAL(1, "Más de 3 días");

    private final int divisor;
    private final String etiqueta;

    RangoCaducidad(int divisor, String etiqueta) {
        this.divisor = divisor;
        this.etiqueta = etiqueta;
    }

    public int getDivisor() { return divisor; }
    public String getEtiqueta() { return etiqueta; }
}
