package rpg.Character;

import rpg.Character.Job.Job;
import rpg.Character.Race.Race;
import rpg.Character.Stat.Constitution;
import rpg.Character.Stat.Dexterity;
import rpg.Character.Stat.Inteligence;
import rpg.Character.Stat.Strength;

public class Character {
    String name;
    Race race;
    Job job;
    Strength strength;
    Constitution constitution;
    Dexterity dexterity;
    Inteligence inteligence;

    public Character(String name, Race race, Job job, Strength strength, Constitution constitution, Dexterity dexterity,
            Inteligence inteligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = strength;
        this.constitution = constitution;
        this.dexterity = dexterity;
        this.inteligence = inteligence;
    }
    public String getName(){
        return name;
    }
    public Race getRace(){
        return race;
    }
    public Job getJob(){
        return job;
    }

    //(Valor base Dexterity + bonif. raza + bonif.profesion)*2
    public double velocity(){
        return (dexterity.getValue()+race.modifier(dexterity)+job.modifier(dexterity))*2;
    }
    //(Valor base Strength + bonif. raza + bonif.profesion)*2
    public double power(){
        return (strength.getValue()+race.modifier(strength)+job.modifier(strength))*2;
    }
    //(Valor base Intelligence + bonif. raza + bonif.profesion)*2
    public double magic(){
        return (inteligence.getValue()+race.modifier(inteligence)+job.modifier(inteligence))*2;
    }
    @Override
    //Muestra toda la información de un personaje
    public String toString(){
        return "My name is Caliel. I’m an elf assassin."+
        "My stats are: Strength: 6 Dexterity: 11 Constitution: 5 Intelligence: 8 Velocity: 22.0 Power: 12.0 Magic: 16.0 Health: 125.0";
    }
}
