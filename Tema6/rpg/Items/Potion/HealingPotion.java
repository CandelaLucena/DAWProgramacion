package rpg.Items.Potion;

public class HealingPotion extends Potion{

    public void consumedBy(Character character) {
        power = 50;
    }
}
