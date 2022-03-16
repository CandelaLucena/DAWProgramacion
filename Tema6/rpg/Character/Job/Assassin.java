package rpg.Character.Job;

import rpg.Character.Stat.Constitution;
import rpg.Character.Stat.Dexterity;
import rpg.Character.Stat.Stat;
import rpg.Character.Stat.Strength;

public class Assassin extends Job{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if(stat instanceof Dexterity){
            resultado = 3;
        }else if(stat instanceof Strength){
            resultado = 1;
        }else if(stat instanceof Constitution){
            resultado = 1;
        }

        return resultado;
    }
    
}
