package claseabstracta;

public class Triangulo extends FiguraGeometrica{
    
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    public void dibujar(){
        System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName());
    }
}
