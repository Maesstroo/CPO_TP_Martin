/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_martin;

import Armes.Baton;
import Armes.Epee;
import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;

/**
 *
 * @author guilhem
 */
public class TP3_MARTIN {

    public static void main(String[] args) {
        
       Guerrier Guilhem = new Guerrier(100,true,"Ulysse");
       Magicien Tanguy = new Magicien(100,false,"Adrien");
       
       Epee Excalibur = new Epee(7,5,"Excalibur");
       Epee Durandal = new Epee(1,1,"Durandal");
       Baton Charme = new Baton(5,6,"Charme");
       Baton Chene = new Baton(4,5,"Chêne");
       
       Guilhem.addWeaponToInv(Excalibur);
       Guilhem.addWeaponToInv(Chene);
       Guilhem.equipWeapon("Excalibur");
       
       Tanguy.addWeaponToInv(Chene);
       Tanguy.addWeaponToInv(Durandal);
       Tanguy.equipWeapon("Chêne");
       
       System.out.println("------Personnages------");
       System.out.println("Nombre de Personnages : "+Personnage.getNbCarracter());
       System.out.println("Nombre de Guerriers : "+Guerrier.getNbWarrior());
       System.out.println("Nombre de Magiciens : "+Magicien.getNbMage());
       System.out.println("-----------------------");
          
       System.out.println(Guilhem);
       System.out.println(Tanguy);

       Guilhem.attaquer(Tanguy);
       Tanguy.attaquer(Guilhem);
       
       System.out.println(Guilhem);
       System.out.println(Tanguy);
       
       if(Guilhem.estVivant()==true) System.out.println("Guilhem est vivant");
       else System.out.println("Guilhem est mort");
       if(Tanguy.estVivant()==true) System.out.println("Tanguy est vivant");
       else System.out.println("Tanguy est mort");
    }
}
