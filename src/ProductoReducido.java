final public class ProductoReducido extends ProductoIVA {

    public ProductoReducido(String descripcion, double precioProducto, double IVA) {
        super(descripcion, precioProducto, IVA);
        IVA=5;
    }
}
