package rpg.Items.Potion;

import rpg.Items.Food.IConsumable;
import rpg.Character.Character;

public abstract class Potion implements IConsumable{
    double power;

    public Potion(double power) {
        this.power = power;
    }

    public void consumedBy(Character character){
        character.heals(power);
    }
}
