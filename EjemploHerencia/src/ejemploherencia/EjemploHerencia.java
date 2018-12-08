package ejemploherencia;
public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juancito", 10000);
        System.out.println("Mostramos el empleado e1: ");
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Pedro", 12000);
        e2.setEdad(25);
        e2.setGenero('M');
        e2.setDireccion("Buenos Aires, Argentina");
        System.out.println("\nMostramos el empleado e2: ");
        System.out.println(e2);
        
        Cliente c1 = new Cliente(new java.util.Date(), false);
        System.out.println("Mostramos el Cliente c1: ");
        System.out.println(c1);
        // Mostramos mas datos...
        c1.setNombre("Martita");
        c1.setEdad(32);
        c1.setGenero('F');
        c1.setVip(true);
        c1.setDireccion("Santiago del Estero, Argentina");
        System.out.println("\nVolvemos a mostrar el cliente c1 con mas datos:");
        System.out.println(c1);
    }
    
}
