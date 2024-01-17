/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_martin_version_console;

/**
 *
 * @author guilhem
 */
public class CelluleLumineuse {
    
 
    private boolean etat;


    public CelluleLumineuse() {
        this.etat = false;
    }
   

    public void activerCellule(){
        if(!(this.etat))this.etat=true;
        else this.etat=false;
    }
   

    public void eteindreCellule(){
        this.etat =false;
    }
   

    public boolean estEteint(){
        if(!(this.etat)) return true;
        else return false;
    }

    public boolean getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        if(this.etat){
        return "X";
        } else return "O";
    }
}