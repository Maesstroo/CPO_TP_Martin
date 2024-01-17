package tp2_bieres_martin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilhem
 */
public class TP2_Bieres_MARTIN {
    
    public static void main(String[] args) {
       
        //Création de la bouteille 1
        BouteilleBiere biere1 = new BouteilleBiere("Cuvée des trolls",(float)7.0 ,"Dubuisson") ;
        biere1.Decapsuler();
        System.out.println(biere1) ;

        //Création de la bouteille 2
        BouteilleBiere biere2 = new BouteilleBiere("Desperados",(float) 5.5, "Fischer");
        biere2.Decapsuler();
        System.out.println(biere2);
       
        //Création de la bouteille 3
        BouteilleBiere biere3 = new BouteilleBiere("Chouffe Cherry",(float) 8, "Ardennes Belges");
        System.out.println(biere3);
     

    }
}
