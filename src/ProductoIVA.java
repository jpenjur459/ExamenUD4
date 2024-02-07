public abstract class ProductoIVA extends Producto{
    private double IVA;



    public ProductoIVA(String descripcion, double precioProducto, double IVA) {
        super(descripcion, precioProducto);
        this.IVA = IVA;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    @Override
    public double getPrecioneto() {
        double preciofinal = this.getPrecioBruto() * (1 + this.IVA / 100);
        return preciofinal;
    }

    @Override
    public String toString() {
        return super.toString() + getIVA() + "%" +" = "+ getPrecioneto();
    }
}
