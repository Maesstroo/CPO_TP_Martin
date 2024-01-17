/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_martin;

/**
 *
 * @author guilhem
 */
public class TP2_relation_1_MARTIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles\n"+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0] ) ;
        
        bob.liste_voitures[1] = uneMicra;
        bob.nbVoitures++;
        uneMicra.Proprietaire = bob;
        System.out.println("La deuxieme voiture de bob est "+bob.liste_voitures[1]);
        
        reno.liste_voitures[0] = uneAutreClio;
        reno.liste_voitures[1] = une2008;
        reno.nbVoitures =2;
        uneAutreClio.Proprietaire=reno;
        une2008.Proprietaire=reno;
        System.out.println("la premiere voiture de Reno est " +reno.liste_voitures[0] ) ;
        System.out.println("la deuxieme voiture de Reno est " +reno.liste_voitures[1] ) ;
        
        bob.nbVoitures=0;
        reno.nbVoitures=0;
        reno.liste_voitures = new Voiture [3];
        bob.liste_voitures =  new Voiture [3];
        uneClio.Proprietaire = null;
        uneAutreClio.Proprietaire =null;
        une2008.Proprietaire =null;
        uneMicra.Proprietaire=null;
        
        System.out.println("------------Réinitialsiation----------");
        
        if(reno.ajouter_voiture(uneClio)==true && reno.ajouter_voiture(uneAutreClio)==true && reno.ajouter_voiture(uneMicra)==true){
            System.out.println("Reno possède désormais :\n"+uneClio+"\n"+uneAutreClio+"\n"+uneMicra);
        }
        
        System.out.println("Tentative d'ajout d'une quatrième voiture à la collection de Reno");
        
        if(reno.ajouter_voiture(une2008)==true){
            System.out.println("Reno dispose désormais de 4 voitures");
        } else{
            System.out.println("Ajout non effectué");
        }
        
        System.out.println("Tentative d'ajout d'une 2008 à Bob");
        
        if(bob.ajouter_voiture(une2008)==true){
            System.out.println("Bob dispose désormais d'une "+une2008);
        }
    }
    
}
