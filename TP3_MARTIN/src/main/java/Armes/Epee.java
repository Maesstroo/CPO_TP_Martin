/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author guilhem
 */
public class Epee extends Arme{
    
    public Epee(int fein, int Lvl, String Name) {
        super(Lvl, Name);
        this.name=Name;
        this.setFinesse(fein);
    } 

    @Override
    public String toString() {
        return "Epee{" + "finesse=" + this.getFinesse() + ",lvl="+this.getLevel()+",name="+name+'}';
    }
}
