
public class TestPedidos {
    public static void main(String[] args) {

        // Elementos del menú
        Articulo articulo1 = new Articulo("Mocca", 1200);
        Articulo articulo2 = new Articulo("Chai", 3000);
        Articulo articulo3 = new Articulo("Cold Brew", 4500);
        Articulo articulo4 = new Articulo("Frappe", 6500);
        // Ordenar variables -- orden1, orden2, etc.
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido("Cindhuri");
        Pedido pedido4 = new Pedido("Noah");
        Pedido pedido5 = new Pedido("Jimmy");
        // Simulaciones de aplicaciones
        pedido2.addItem(articulo1);
        pedido3.addItem(articulo4);
        pedido4.addItem(articulo2);
        pedido1.setlisto(true);
        pedido4.addItem(articulo3);
        pedido4.addItem(articulo3);
        pedido2.setlisto(true);
        // Utiliza este código de ejemplo para probar las actualizaciones de varios
        // pedidos
        pedido1.display();
        pedido2.display();
        pedido3.display();
        pedido4.display();
        System.out.println(pedido5.getStatusMessage());
    }
}