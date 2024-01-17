package tp2_manip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilhem
 */
public class Moussaka {
    
    public int nbCalories;
    
    public Moussaka(int qtt){
        nbCalories =qtt;
    }
    @Override
    public String toString() {
        return "Cette moussaka contient "+nbCalories +" calories.";
    }
    
}
