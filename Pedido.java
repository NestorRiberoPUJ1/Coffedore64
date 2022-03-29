import java.util.ArrayList;

class Pedido {

    private String nombre;
    private boolean listo;
    private ArrayList<Articulo> items;

    public Pedido() {
        this.nombre = "Invitado";
        this.items = new ArrayList<Articulo>();
    }

    public Pedido(String name) {
        this.nombre = name;
        this.items = new ArrayList<Articulo>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double computeTotal() {
        double total = 0;
        for (Articulo item : items) {
            total += item.getPrecio();
        }
        return total;
    }

    public void addItem(Articulo item) {
        items.add(item);
        computeTotal();
    }

    public void setlisto(boolean listo) {
        this.listo = listo;
    }

    public boolean isListo() {
        return listo;
    }

    public String getStatusMessage(){
        if(isListo()){
            return "Tu pedido está listo";
        }
        else {
            return "Gracias por esperar. Tu pedido estará listo pronto";
        }
    }

    public void display(){
        System.out.println(String.format("Nombre Cliente:\t%s", nombre));
        for (Articulo item : items) {
            System.out.println(String.format("%s\t%s", item.getNombre(),item.getPrecio()));
        }
        System.out.println(String.format("Total:\t%s", computeTotal()));
    }

}