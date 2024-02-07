final public class ProductoGeneral extends ProductoIVA{

    public ProductoGeneral(String descripcion, double precioProducto, double IVA) {
        super(descripcion, precioProducto, IVA);
        IVA=21;
    }

}
