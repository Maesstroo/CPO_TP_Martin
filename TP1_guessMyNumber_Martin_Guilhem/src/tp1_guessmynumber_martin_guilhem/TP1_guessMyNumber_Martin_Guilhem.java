/* 
 * Martin Guilhem TDB
 * TPO EXO1 25/09/2023
 */
package tp1_guessmynumber_martin_guilhem;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guilhem
 */
public class TP1_guessMyNumber_Martin_Guilhem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int niveau;
        int maxRange;
        int tentatives;

        System.out.println("Choisissez le niveau de difficulté :");
        System.out.println("1. Facile (entre 0 et 50, 10 tentatives)");
        System.out.println("2. Normal (entre 0 et 100, 7 tentatives)");
        System.out.println("3. Difficile (entre 0 et 200, 5 tentatives)");
        niveau = sc.nextInt();

        switch (niveau) {
            case 1:
                maxRange = 50;
                tentatives = 10;
                break;
            case 2:
                maxRange = 100;
                tentatives = 7;
                break;
            case 3:
                maxRange = 200;
                tentatives = 5;
                break;
            default:
                System.out.println("Niveau inconnu. Choisissez un niveau valide.");
                return;
        }

        int n = generateurAleat.nextInt(maxRange + 1);
        int compteur = 0;

        System.out.println("Devinez le nombre entre 0 et " + maxRange);

        while (compteur < tentatives) {
            int nbr1 = sc.nextInt();
            compteur++;

            if (nbr1 < 0 || nbr1 > maxRange) {
                System.out.println("Veuillez entrer un nombre valide entre 0 et " + maxRange);
            } else if (n == nbr1) {
                System.out.println("Gagné au bout de " + compteur + " tentatives !");
                break;
            } else {
                double proba = Math.random(); // Génération d'un nombre aléatoire entre 0 et 1

                if (proba <= 0.3) { // 30% de chance de donner une mauvaise indication
                    if (n > nbr1) {
                        System.out.println("Trop grand");
                    } else {
                        System.out.println("Trop petit");
                    }
                } else if (Math.abs(n - nbr1) > maxRange / 2) {
                    System.out.println("Vraiment trop " + (n > nbr1 ? "petit" : "grand"));
                } else {
                    System.out.println("Trop " + (n > nbr1 ? "petit" : "grand"));
                }
            }
        }

        if (compteur == tentatives) {
            System.out.println("Désolé, vous avez épuisé vos tentatives. Le nombre était " + n);
        }
    }
    
    
    
    
    
}

    
    

