package rpg.Items.Food;

import rpg.Character.Character;

public abstract class Food implements IConsumable{
    private double power;
    
    public Food(double power) {
        this.power = power;
    }

    public void consumedBy(Character character){
        character.heals(power);
    }
}
