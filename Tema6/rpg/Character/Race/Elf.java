package rpg.Character.Race;

import rpg.Character.Stat.Constitution;
import rpg.Character.Stat.Dexterity;
import rpg.Character.Stat.Inteligence;
import rpg.Character.Stat.Stat;

public class Elf extends Race{

    @Override
    public int modifier(Stat stat) {

        int resultado = 0;

        if(stat instanceof Dexterity){
            resultado = 3;
        }else if(stat instanceof Inteligence){
            resultado = 3;
        }else if(stat instanceof Constitution){
            resultado = -1;
        }
        
        return resultado;
    }
}
