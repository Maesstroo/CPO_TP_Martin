/* 
 * Martin Guilhem TDB
 * TPO EXO1 13/10/2023
 */
package tp2_bieres_martin_guilhem;

/**
 *
 * @author guilhem
 */
public class TP2_Bieres_Martin_Guilhem {

    
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere ();
    uneBiere.nom = "Cuvée des trolls";
    uneBiere.degreAlcool = 7.0; 
    uneBiere.brasserie= "Dubuisson" ;
    uneBiere.ouverte = false;
    uneBiere.lireEtiquette();
    
    BouteilleBiere deuxBieres = new BouteilleBiere ();
    deuxBieres.nom = "Leffe";
    deuxBieres.degreAlcool = 6.6; 
    deuxBieres.brasserie= "Abaye de Leffe" ;
    deuxBieres.lireEtiquette();
    }
}

