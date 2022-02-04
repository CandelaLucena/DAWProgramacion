public class Teclado {
    private String color;                                 //indica el color {"rojo", "amarillo", "verde", "azul"}; 
    private int numTeclas;                               //indica numero de teclas
    private String conectividad;                        //indica si es inalambrico o por cable {"inalambrico", "por cable"};
    private String idioma;                             //indica el idioma {"es", "it"};  
    private String formato;                           //indica si es compacto o extendido {"compacto", "extendido"}; 
    private static int contadorTeclados = 0;
    
    public Teclado() {
        contadorTeclados++;
    }

    public Teclado(String color, int numTeclas, String conectividad, String idioma, String formato) {
        this.color = color;
        this.numTeclas = numTeclas;
        this.conectividad = conectividad;
        this.idioma = idioma;
        this.formato = formato;
        contadorTeclados++;
    }

    public String getColor() {
        return color;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public String getConectividad() {
        return conectividad;
    }

    public String getIdioma() {
        return idioma;
    }
    
    public String getFormato() {
        return formato;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

}