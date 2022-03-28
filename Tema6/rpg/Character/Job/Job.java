package rpg.Character.Job;

import rpg.Character.Stat.Stat;

public abstract class Job {
    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);

    @Override
    //*Devuelve true si son la misma clase
    public boolean equals(Object obj){
        if(obj.equals(obj)){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    //*Devuelve el nombre simple de la clase
    public String toString(){
        return null;
    }
}
