/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip;

/**
 *
 * @author guilhem
 */
public class Tartiflette {
    public int nbCalories;


    public Tartiflette(int qtt){
        nbCalories =qtt;
    }
    
    @Override
    public String toString() {
        return "Cette tartiflette contient "+nbCalories +" calories.";
    }
    
}
