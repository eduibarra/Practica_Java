package claseabstracta;

public class ClaseAbstracta {
    public static void main(String[] args) {
        // Creacion de objetos
        FiguraGeometrica rectangulo = new Rectangulo("Soy un rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Soy un triangulo");
        FiguraGeometrica circulo = new Circulo("Soy un circulo");
        
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();
        
        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();
    }
    
}
