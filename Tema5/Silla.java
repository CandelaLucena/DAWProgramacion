import java.awt.Point;

public class Silla {
    //Las clases se nombran en mayuscula siempre
    //Atribujos de objetos
    private String color; // "Amarillo", "Azul"
    private int numPatas; // 0 - 100
    private boolean tieneRespaldo; // Si o No
    private int comodidad; // 0 - 10
    private Point ubicacion;
    private String material;

    //Autogenerados contructor
    
    public Silla(String color, int numPatas, boolean tieneRespaldo, int comodidad, Point ubicacion, String material) {
        this.color = color;
        this.numPatas = numPatas;
        this.tieneRespaldo = tieneRespaldo;
        this.comodidad = comodidad;
        this.ubicacion = ubicacion;
        this.material = material;
    }

    public Silla() {
        //Generar sillas aleatorias
    }

    //Autogenerados set get
    public boolean isTieneRespaldo() {
        return tieneRespaldo;
    }

    public void setTieneRespaldo(boolean tieneRespaldo) {
        this.tieneRespaldo = tieneRespaldo;
    }

    public Point getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Point ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    //Getters, permiten obtener. Se utiliza para tener una capa de protección
    public int getComodidad(){
        return comodidad;
    }

    public String getColor(){
        return color;
    }

    public int getNumPatas(){
        return numPatas;
    }

    //Setters
    public void setComodidad(int nuevaComodidad){
        comodidad = nuevaComodidad;
    }

    public void setColor(String nuevoColor){
        color = nuevoColor;
    }

    public void setNumPatas(int nuevoNumPatas){
        if (nuevoNumPatas < 0){
            numPatas = 0;
        }else if(nuevoNumPatas > 100){
            numPatas = 100;
        }else{
            numPatas = nuevoNumPatas;
        }
    }
}
