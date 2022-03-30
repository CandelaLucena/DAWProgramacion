package rpg.Character;

import rpg.Character.Job.Job;
import rpg.Character.Race.Race;
import rpg.Character.Stat.Constitution;
import rpg.Character.Stat.Dexterity;
import rpg.Character.Stat.Inteligence;
import rpg.Character.Stat.Strength;
import rpg.Items.Food.IConsumable;

public class Character implements IDamageable{
    private String name;
    private Race race;
    private Job job;
    private double health;
    private Strength strength;
    private Constitution constitution;
    private Dexterity dexterity;
    private Inteligence inteligence;
    

    public Character(String name, Race race, Job job, int strength, int constitution, int dexterity, int inteligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        health = maxHealth();
        this.strength = new Strength(strength);
        this.constitution = new Constitution(constitution);
        this.dexterity = new Dexterity(dexterity);
        this.inteligence = new Inteligence(inteligence);
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
        return "My name is "+getName()+". I’m an "+getRace()+" "+getJob()+"."+
        "My stats are:"+
        "Health: "+health()+"/"+maxHealth()+
        "Strength: "+strength.getValue()+" Dexterity: "+dexterity.getValue()+" Constitution: "+constitution.getValue()+" Intelligence: "+inteligence.getValue()+" "+
        "Velocity: "+velocity()+" Power: "+power()+" Magic: "+magic();
    }

    @Override
    public double maxHealth() {
        return (constitution.getValue()+race.modifier(constitution)+job.modifier(constitution))*25;
    }

    @Override
    public double health() {
        return health;
    }

    @Override
    public boolean isDead() {
        if(health() == 0 || health() < 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void receivesDamage(double amount) {
        health = health - amount;
    }
    
    @Override
    public void heals(double amount) {
        health =  health + amount;
    }

    public void consumes(IConsumable consumable) {
        System.out.println(getName()+" consumed: "+consumable);
    }
}
