package rpg.Items.Food;


import rpg.Character.Character;
public interface IConsumable {
    //Pasamos el personaje para poder actuar sobre él
    void consumedBy(Character character);
}
