/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author guilhem
 */
public class Guerrier extends Personnage{
    
    private String name;
    private boolean ridingHorse;
    private static int nbWarrior;
    

    public Guerrier(int Health, boolean RidingHorse, String Name) {
        super(Health, Name);
        this.name = Name;
        this.ridingHorse = RidingHorse;
        addNbWarrior();
    } 

    
    @Override
    public String toString() {
        return "Guerrier{" + "health=" + this.getHealth() + ", points="+this.getPoints()+", name=" + name + ", ridingHorse=" + ridingHorse +", equipped_weapon="+this.getArme_en_Main()+ '}';
    }

    
    public void setRidingHorse(boolean ridingHorse) {
        this.ridingHorse = ridingHorse;
    }  
    
    public static int getNbWarrior() {
        return nbWarrior;
    }
    public boolean getRidingHorse(){
        return ridingHorse;
    }
    
    
    public static void addNbWarrior(){
        nbWarrior++;
    }
    
    public void finalize(){
    nbWarrior--;
    }
    
}
