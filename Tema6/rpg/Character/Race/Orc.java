package rpg.Character.Race;

import rpg.Character.Stat.Constitution;
import rpg.Character.Stat.Inteligence;
import rpg.Character.Stat.Stat;
import rpg.Character.Stat.Strength;

public class Orc extends Race{

    @Override
    public int modifier(Stat stat) {
        
        int resultado = 0;

        if(stat instanceof Strength){
            resultado = 5;
        }else if(stat instanceof Inteligence){
            resultado = -3;
        }else if(stat instanceof Constitution){
            resultado = 3;
        }

        return resultado;
    }
}
