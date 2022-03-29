import java.util.ArrayList;

class PedidoKiosko {

    ArrayList<Articulo> menu;
    ArrayList<Pedido> pedidos;

    public PedidoKiosko() {
        menu = new ArrayList<Articulo>();
        pedidos = new ArrayList<Pedido>();
    }

    public void addMenuItem(Articulo item) {
        item.setIndex(menu.size());
        menu.add(item);

    }

    public void displayMenu() {
        for (Articulo item : menu) {
            System.out.println(String.format("%d %s -- %d", item.getIndex(), item.getNombre(), item.getPrecio()));
        }
    }

    public void newOrder() {

        // Mostrar al usuario un aviso de mensaje y luego establece su entrada en una
        // variable, nombre
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();

        // Tu código:
        // Crea un nuevo pedido con la cadena de entrada dada
        Pedido pedido1 = new Pedido(name);
        // Muestra el menú al usuario, para que puedan elegir artículos para agregar
        displayMenu();

        // Pedir al usuario que ingrese un número de artículo
        System.out.println("Ingrese un índice de artículo del menú o q para salir:");
        String itemNumber = System.console().readLine();

        // Escribir un bucle while para recopilar todos los artículos del pedido del
        // usuario
        while (!itemNumber.equals("q")) {

            Articulo item = menu.get(Integer.parseInt(itemNumber));
            pedido1.addItem(item);
            // Obtén el objeto del artículo del menú y agrega el artículo al pedido
            // Pídales que ingresen un nuevo índice de artículo o q nuevamente, y toma su
            // entrada
            System.out.println("Ingrese un índice de artículo del menú o q para salir:");
            itemNumber = System.console().readLine();
        }
        // Después de haber completado su pedido, imprime los detalles del pedido
        // como el ejemplo de abajo. Puedes utilizar el método de visualización del
        // pedido

        pedido1.display();

    }
}
