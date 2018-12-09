package claseabstracta;

public class Rectangulo extends FiguraGeometrica{
    
     public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    public void dibujar(){
        System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName());
    }
}
