/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import com.mycompany.tp3_martin.etreVivant;
import java.util.ArrayList;

/**
 *
 * @author guilhem
 */
public abstract class Personnage implements etreVivant{
    ArrayList<Arme> inventaireArmes= new ArrayList<Arme>();
    private String name;
    private int health,points;
    private Arme Arme_en_Main;
    static private int nbCarracter;


    public Personnage(int health, String name) {
        this.name = name;
        this.health = health;
        addNbCarracter();
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    } 
    public Arme getArme_en_Main(){
        return Arme_en_Main;
    }
    public static int getNbCarracter() {
        return nbCarracter;
    }
    public int getPoints() {
        return points;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    public void setPoints(int points) {
        this.points = points;
    }
   
    public void addWeaponToInv(Arme arme){
        if(inventaireArmes.size()==5){
            System.out.println("Ce personnage a un inventaire d'armes complet");
        } else {
            inventaireArmes.add(arme);
        }
    } 
    
    public void disarm(){
        this.Arme_en_Main=null;
    }
    
    public void equipWeapon(String weapon){
        String msg="Cette arme n'est pas posséedée par le personnage";
        for(int i=0;i<inventaireArmes.size();i++){
            if(inventaireArmes.get(i).getName().equals(weapon)){
                msg = "L'arme a bien été équipée";
                Arme_en_Main = inventaireArmes.get(i);
            }
        } 
        System.out.println(msg);
    }
    
    
    public int numberOfWeaponOfChoice(){
        int nb=0;
        for(int i=0;i<inventaireArmes.size();i++){
            if((this instanceof Magicien && inventaireArmes.get(i)instanceof Baton)|| (this instanceof Guerrier && inventaireArmes.get(i) instanceof Epee)){
                nb++;
            }
        }
        return nb;
    }
    
    public static void addNbCarracter(){
        nbCarracter++;
    }
    
    @Override
    public void finalize(){
        nbCarracter--;
    }
    
    public void seFatiguer(){
        points-=10;
    }
    public boolean estVivant(){
        if(health>0){
            return true;
        } else return false;
    }
    public void estAttaqué(int points){
        health-=points;
    }
    public void attaquer(Personnage victime){
        if(this instanceof Magicien){ 
            if(this.Arme_en_Main instanceof Baton){
                if((victime instanceof Guerrier && ((Guerrier) victime).getRidingHorse()==true) || (victime instanceof Magicien && ((Magicien) victime).getConfirmed()==true)) {
                    victime.estAttaqué(20*Arme_en_Main.getAge()/2); 
                }else victime.estAttaqué(20*Arme_en_Main.getAge()); 
            } 
        
        } else  if(this instanceof Guerrier){ 
            if(this.Arme_en_Main instanceof Epee){
                if((victime instanceof Guerrier && ((Guerrier) victime).getRidingHorse()==true) || (victime instanceof Magicien && ((Magicien) victime).getConfirmed()==true)) {
                    victime.estAttaqué(30*Arme_en_Main.getFinesse()/2);
                }else victime.estAttaqué(30*Arme_en_Main.getFinesse());  
            }    
        }
        this.seFatiguer();
    }
    
    
}
