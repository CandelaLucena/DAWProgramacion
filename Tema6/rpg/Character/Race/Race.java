package rpg.Character.Race;

import rpg.Character.Stat.Stat;

public abstract class Race {
    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);
    
    @Override
    //Devuelve true si son la misma clase
    public boolean equals(Object obj){
        return true;
    }

    @Override
    //Devuelve el nombre simple de la clase
    public String toString(){
        return null;
    }
}
