package tp2_bieres_martin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilhem
 */
public class BouteilleBiere {

    public String Nom;
    public float degreAlcool ;
    public String brasserie;
    public boolean ouverte;
   
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }


    public void lireEtiquette() {
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
    " degres) \nBrasserie : " + brasserie ) ;

    }
    public void Decapsuler() {
       
        if(ouverte==false){
            ouverte = true;
        } else {
            ouverte=false;
            System.out.println("Erreur, bière déja ouverte");
        }

    }
   
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
   
   
}
     

