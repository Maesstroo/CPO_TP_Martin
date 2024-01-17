/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author guilhem
 */
public class Arme {
    
    private int level,age,finesse;
    String name;

    public Arme(int lvl, String name) {
        this.level=lvl;
        this.name=name; 
    } 


    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getFinesse() {
        return finesse;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFinesse(int finesse) {
        this.finesse = finesse;
    }
    
}
