package rpg.Items.Food;

import rpg.Character.Character;

public abstract class Food implements IConsumable{
    double power;
    
    public void consumedBy(Character character){
        character.heals(power);
    }
}
