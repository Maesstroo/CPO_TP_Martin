/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_martin_version_console;

import java.util.Random;

/**
 *
 * @author guilhem
 */
public class GrilleDeCellules {
    
    

    CelluleLumineuse[][] matriceCellules ;
   

    int nbLignes, nbColonnes;

    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        this.matriceCellules = new CelluleLumineuse[this.nbLignes][this.nbColonnes];
       
        for(int i=0;i<this.nbLignes;i++){
            for(int j=0;j<this.nbColonnes;j++){
                matriceCellules[i][j]=new CelluleLumineuse();
            }
        }
    }
   
  
    public void eteindreToutesLesCellules(){
        for(int i=0;i<nbLignes;i++){
            for(int j=0;j<nbColonnes;j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
   

    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random r = new Random();
        int loc =r.nextInt(3);        
        switch (loc) {
            case 0 -> {
                int lr =r.nextInt(nbLignes);
                this.activerLigneDeCellules(lr);
            }
            case 1 -> {
                int cr =r.nextInt(nbColonnes);
                this.activerColonneDeCellules(cr);
            }
            case 2 -> {
                int dr =r.nextInt(2);
                if(dr==0){
                    this.activerDiagonaleMontante();
                } else this.activerDiagonaleDescendante();
            }
            default -> {
            }
        }
       
    }
  
    @Override
    public String toString() {
        String grille="";
        String trait="----";
        String line1="   |";
        for(int i=0;i<nbLignes+1;i++){
            if(i==0){
                    for(int k=0;k<nbColonnes;k++){
                        line1+=" "+Integer.toString(k)+ " |";
                        trait+="----";
                    }
                    line1+="\n"+trait+"\n";
                }    
        } grille+=line1;
           
        for(int i=0;i<nbLignes;i++){
            for(int j=0;j<nbColonnes;j++){
                if(j==0){
                    grille+= " "+Integer.toString(i)+" |";
                }
                if(matriceCellules[i][j].estEteint()){
                    grille+=" O |";
                } else {
                    grille+=" X |";
                }
                if(j==nbColonnes-1){
                    grille+="\n"+trait+"\n";
                }
            }
        } return grille;
    }
   
   
 
    public void activerLigneDeCellules(int idLigne){
        for(int i=0;i<nbColonnes;i++){
                    matriceCellules[idLigne][i].activerCellule();
                }  
    }
   
 
    public void activerColonneDeCellules(int idColonne){
        for(int i=0;i<nbLignes;i++){
                    matriceCellules[i][idColonne].activerCellule();
                }  
    }
   

    public void activerDiagonaleDescendante(){
        for(int i=0;i<nbLignes;i++){
            matriceCellules[i][i].activerCellule();

        }
       
    }
   
 
    public void activerDiagonaleMontante(){
        for(int i=0;i<nbLignes;i++){
            matriceCellules[i][nbLignes-1-i].activerCellule();
        }
       
    }
   

    public boolean cellulesToutesEteintes(){
        for(int i=0;i<nbLignes;i++){
            for(int j=0;j<nbColonnes;j++){
                if(!(matriceCellules[i][j].estEteint())){
                    return false;
                }
            }
        } return true;
    }
   
    public void melangerMatriceAleatoirement(int nbTours){
        for(int i=0;i<nbTours;i++){
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }
}