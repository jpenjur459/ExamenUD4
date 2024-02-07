import java.util.ArrayList;
import java.util.List;

public class CestaCompra {
    private double presupuesto;

    private List<Producto>Comparables;

    public CestaCompra(double presupuesto) {
        this.presupuesto = presupuesto;
        Comparables = new ArrayList<>();
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Producto> getCesta() {
        return List.copyOf(Comparables);
    }

    public void setComparables(List<Producto> comparables) {
        Comparables = comparables;
    }
    public void addElemento(Producto producto){
        Comparables.add(producto);
    }
    public double getPrecioCesta(){
        double resultado = 0;
        for (Producto p: Comparables){
            resultado =+ p.getPrecioventa();

        }
        return resultado;
    }
    public String imprimir(){
        int restante = (int) (presupuesto - getPrecioCesta());
        for (Producto p: Comparables){

        }
        return  "presupuesto "+ presupuesto + "suma: " + getPrecioCesta() + "restante: "+ restante;
    }
}
