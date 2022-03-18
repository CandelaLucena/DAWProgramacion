package rpg.Character.Job;

import rpg.Character.Stat.Dexterity;
import rpg.Character.Stat.Inteligence;
import rpg.Character.Stat.Stat;

public class Mage extends Job{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if(stat instanceof Dexterity){
            resultado = 1;
        }else if(stat instanceof Inteligence){
            resultado = 4;
        }
        
        return resultado;
    }
}
