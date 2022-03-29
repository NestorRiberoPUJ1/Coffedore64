class Articulo {

    private String nombre;
    private double precio;
    private int index;

    public Articulo(String nombre,double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return precio;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setIndex(int index){
        this.index=index;
    }
    public double getIndex(){
        return index;
    }

}
