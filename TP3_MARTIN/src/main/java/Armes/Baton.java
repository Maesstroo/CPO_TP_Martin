/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author guilhem
 */
public class Baton extends Arme {
    
    int Age;
    //Constructeur
    public Baton(int age, int level, String nom) {
        super(level, nom);
        this.setAge(age);
    }  // Fin Constructeur



    

    @Override
    public String toString() {
        return "Baton{" + "age=" + this.getAge() + ",lvl=" + this.getLevel() +",name="+this.getName()+'}';
    }
    
}
