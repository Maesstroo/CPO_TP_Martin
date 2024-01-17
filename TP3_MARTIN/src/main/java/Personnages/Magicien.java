/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author guilhem
 */
public class Magicien extends Personnage{
    
    private String name;
    private boolean confirmed;
    static private int nbMage;
    
    public Magicien(int Health, boolean Confirmed, String Name) {
        super(Health, Name);
        this.name=Name;
        this.confirmed=Confirmed;
        addNbMage();

    }

    
    @Override
    public String toString() {
        return "Magicien{" + "health=" + this.getHealth() + ", points="+this.getPoints()+", name=" + name + ", confirmed=" + confirmed +", equipped_weapon="+this.getArme_en_Main()+'}';
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
    
    public static int getNbMage() {
        return nbMage;
    }

    public boolean getConfirmed() {
        return confirmed;
    }
    
    
    
    
    public static void addNbMage(){
        nbMage++;
    }
    
    @Override
    public void finalize(){
    nbMage--;    
    }
    
}
