public class PrincipalProductro {
    public static void main(String[] args) {
        Producto p1 = new Producto("juego",50);
        System.out.println(p1);

        ProductoGeneral p3 = new ProductoGeneral("j",34,16);
        System.out.println(p3);
        ProductoReducido p4 = new ProductoReducido("j",34,16);
        System.out.println(p4);
    }
}
