public class Producto implements Comprable{
    private String descripcion;
    private double precioBruto;


    public Producto(String descripcion, double precioBruto) {
        setDescripcion(descripcion);
        setPrecioBruto(precioBruto);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    private void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isBlank()){
            throw new IllegalArgumentException("la descripción no puede estar vacia");
        }
        this.descripcion = descripcion;
    }

    private void setPrecioBruto(double precioBruto) {
        if (precioBruto < 0){
            throw new IllegalArgumentException("el precio bruto deve ser mayor que 0");
        }
        this.precioBruto = precioBruto;
    }

    public double getPrecioneto(){
        return 0;
    }

    @Override
    public String toString() {
        return descripcion + ": " + precioBruto +"€ " ;
    }

    @Override
    public void cogerUnidad(int cantidad) throws Exception {

    }

    @Override
    public double getPrecioventa(int cantidad) {
        return cantidad * (1+ 21/100);
    }
}