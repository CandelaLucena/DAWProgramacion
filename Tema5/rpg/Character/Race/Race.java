package Character.Race;

public abstract class Race {
    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);
    
    @Override
    //Devuelve true si son la misma clase
    public boolean equals(Object obj){
    
    }

    @Override
    //Devuelve el nombre simple de la clase
    public String toString(){
    
    }
}
