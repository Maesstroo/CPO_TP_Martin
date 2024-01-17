/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip;

import java.util.Random;

/**
 *
 * @author guilhem
 */
public class TP2_manip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2;
        
        /* D'après le code suivant
        System.out.println(assiette1); //Affichage du nb de calories de assiette1
        System.out.println(assiette2); //Affichage du nb de calories de assiette2
        System.out.println(assiette3); //Affichage du nb de calories de assiette3 = assiette2 : Même objet 
        
        On peut voir que 2 objets Tartiflette sont créés, cependant un objet à 2 références : assiette2 et assiette3    
        */
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        System.out.println("---------------");
        
        // On va désormais inverser les références objets des objets assiette 1 et assiette 2
        //Sachant que assiette3 est une référence au deuxieme objet assiette3 = assiette2
        
        System.out.println("Assiette 1 : "+assiette1);
        System.out.println("Assiette 2 : "+assiette2);
        
        assiette2 = assiette1;
        assiette1 = assiette3;
        
        System.out.println("Après l'échange des assiettes :");
        System.out.println("Assiette 1 : "+assiette1);
        System.out.println("Assiette 2 : "+assiette2);
        
        /* 6 / 
        Moussaka assiette666 = assiette1 ;
        Moussaka assiette667 = new Tartiflette() 
        On remarque qu'on ne peut pas convertir deux types d'objets différents 
        Réponse : Non
        */ 
        
        System.out.println("----------");
        
        //Création d'un tableau contenant  10 références à 10 objets Moussaka
        Moussaka [] tab = new Moussaka[10];
        
        //Génération d'un nombre aléatoire de calories
        Random generateurAleat = new Random();
        
        for(int i=0;i<tab.length;i++){
            tab[i] = new Moussaka(generateurAleat.nextInt(500));
            System.out.println(tab[i]);
        }
    }
    
    
}
