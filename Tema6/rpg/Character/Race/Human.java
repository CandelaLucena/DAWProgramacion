package rpg.Character.Race;

import rpg.Character.Stat.Constitution;
import rpg.Character.Stat.Dexterity;
import rpg.Character.Stat.Stat;
import rpg.Character.Stat.Strength;

public class Human extends Race{

    @Override
    public int modifier(Stat stat) {
        
        int resultado = 0;

        if(stat instanceof Strength){
            resultado = 2;
        }else if(stat instanceof Dexterity){
            resultado = 1;
        }else if(stat instanceof Constitution){
            resultado = 2;
        }

        return resultado;
    }
}
