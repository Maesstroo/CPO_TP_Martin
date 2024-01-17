/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_martin_version_console;

import java.util.Scanner;

/**
 *
 * @author guilhem
 */

public class Partie {
    

    GrilleDeCellules grille;
   

    int nbCoups;



    public  Partie() {
       
        this.nbCoups = 0;
       
        Scanner sc = new Scanner(System.in);
        int difficulty;
       
        System.out.println("Lancement d'une partie de LightOff,\nChoisissez la difficulté que vous souhaitez :");
       
        do {
        System.out.println("1) Facile (Grille 2x2)\n2) Normal (Grille 3x3)\n3) Difficile (Grille 4x4)\n4) Au choix (Grille au choix)");
        difficulty = sc.nextInt();
        switch(difficulty){
            default->{
                System.out.println("Erreur de saisie");
            }
            case 1->{
                System.out.println("Choix effectué : Grille Facile");
                grille = new GrilleDeCellules(2,2);
                this.initialiserPartie();
                this.lancerPartie();
            }
            case 2->{
                System.out.println("Choix effectué : Grille Normale");
                grille = new GrilleDeCellules(3,3);
                this.initialiserPartie();
                this.lancerPartie();
            }
            case 3->{
                System.out.println("Choix effectué : Grille Difficile");
                grille = new GrilleDeCellules(4,4);
                this.initialiserPartie();
                this.lancerPartie();
            }
            case 4->{
                int size;
                System.out.println("Choix effectué : Grille au choix\nTaille de la grille voulue :");
                size = sc.nextInt();
                System.out.println("Très bien, la partie se lancera avec une grille de taille : "+size);
                grille = new GrilleDeCellules(size,size);
                this.initialiserPartie();
                this.lancerPartie();
            }
        }
        }while(!(difficulty ==1 || difficulty ==2 || difficulty ==3 || difficulty ==4));
    }
   

    public void  initialiserPartie(){
        grille.melangerMatriceAleatoirement(20);
        System.out.println(grille);
    }
   

    public void lancerPartie(){
       
        Scanner sc = new Scanner(System.in);
        int coup;
       
        do{
            do{
            System.out.println("Choisissez l'action que vous souhaitez effectuer :\n1) Intervertir Ligne\n2) Intervertir Colonne\n3) Intervertir Diagonale Montante\n4) Intervertir Diagonale Descendante");
            coup=sc.nextInt();
            switch(coup){
                default ->{
                    System.out.println("Erreur de saisie");
                }
                case 1->{
                    System.out.println("Entrez le numéro de la ligne concernée");
                    int input;
                    input = sc.nextInt();
                    if(verifSaisie(input)!=-1){
                    grille.activerLigneDeCellules(input);
                    }
                   
                }
                case 2->{
                    System.out.println("Entrez le numéro de la colonne concernée");
                    int input;
                    input = sc.nextInt();
                    if(verifSaisie(input)!=-1){
                    grille.activerColonneDeCellules(input);
                    }
                }
                case 3->{
                    grille.activerDiagonaleMontante();
                }
                case 4->{
                    grille.activerDiagonaleDescendante();
                }
            }
            }while(!(coup==1 || coup==2 || coup==3 || coup==4));
            nbCoups++;
            System.out.println(grille);

           
        }while(!grille.cellulesToutesEteintes());
        System.out.println("Félicitations !\nNombre de coups necessaires pour gagner : "+nbCoups);
    }
   
    public int verifSaisie(int input){
        if(input>grille.nbColonnes-1 || !(input>=0)){
           System.out.println("Erreur de saisie : La taille de la grille est de "+grille.nbColonnes);
           return -1;
        } else return input;
}
}