package ventas;
public class Ventas {

    public static void main(String[] args) {
        // Creamos productos
        Productos p1 = new Productos("Camisa", 250);
        Productos p2 = new Productos("Pantalon", 500);
        Productos p3 = new Productos("Corbata", 150);
        
        // Creamos una orden
        Orden orden1 = new Orden();
        
        // Agregamos productos a la orden
        orden1.agregarProductos(p1);
        orden1.agregarProductos(p2);
        orden1.agregarProductos(p3);
        
        // Imprimimos la orden
        orden1.mostrarOrden();
        
        // Creamos una segunda orden
        Orden orden2 = new Orden();
        
        // Creamos mas productos
        Productos p4 = new Productos("Zapatos", 500);
        Productos p5 = new Productos("Blusa", 300);
        
        // Agregamos productos a la orden2
        orden2.agregarProductos(p5);
        orden2.agregarProductos(p4);
        orden2.agregarProductos(p1);
        orden2.agregarProductos(p3);
        
        // Imprimimos la orden2
        System.out.println("");
        orden2.mostrarOrden();
    }
    
}
