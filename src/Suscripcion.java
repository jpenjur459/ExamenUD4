public class Suscripcion implements Comprable{
    private String descripcion;
    private int existencias;

    private double precio;

    public String getDescripcion() {
        return descripcion;
    }

    public Suscripcion(String descripcion, int existencias, double precio) {
        setDescripcion(descripcion);
        setExistencias(existencias);
        setPrecio(precio);
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isBlank()){
            throw new IllegalArgumentException("la descripción no puede estar vacia");
        }
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        if (existencias < 0){
            throw new IllegalArgumentException("las existencias deven de ser mayores que 0");
        }
        this.existencias = existencias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            throw new IllegalArgumentException("el precio tiene que ser mayor que cero");
        }
        this.precio = precio;
    }

    @Override
    public void cogerUnidad(int cantidad) throws Exception {
        if (cantidad > getExistencias()){
            throw NoHayExistenciasException("no hay existencias");
        }
    }

    @Override
    public double getPrecioventa(int cantidad) {
        return getPrecio() * (1 + (double) 21 / 100);
    }

    private Exception NoHayExistenciasException(String noHayExistencias) {
        return null;
    }


}
