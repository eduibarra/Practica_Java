package claseabstracta;

public abstract class FiguraGeometrica {
    protected String tipoFigura;
    // Constructor
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    // Metodo abstracto
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "Tipo de figura: " + tipoFigura;
    }
    
    
}
