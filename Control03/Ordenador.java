public class Ordenador {
    private String color;                                                //indica el color {"rojo", "amarillo", "azul", "verde"};  
    private String formato;                   //indica si es sobremesa o portatil {"sobremesa", "portatil"};  
    private Teclado teclado;                                                //indica el teclado
    
    public Ordenador() {
    }

    public Ordenador(String color, String formato, Teclado teclado) {
        this.color = color;
        this.formato = formato;
        this.teclado = teclado;
    }

    public String getColor() {
        return color;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void conectar(Ordenador ordenador){
        
    }
}
