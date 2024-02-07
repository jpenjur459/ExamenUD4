public interface Comprable {
    static boolean hayUnidades(int cantidad){
        if (cantidad <= cantidad){
            return false;
        }
        return true;
    }
     void cogerUnidad(int cantidad) throws Exception;
    double getPrecioventa(int cantidad);

}
