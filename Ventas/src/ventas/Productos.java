package ventas;

public class Productos {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Productos(){
        this.idProducto = ++contadorProductos;
    }
    
    public Productos(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "idProducto: " + idProducto + ", nombre: " + nombre + ", precio: " + precio + '}';
    }
    
    
}
