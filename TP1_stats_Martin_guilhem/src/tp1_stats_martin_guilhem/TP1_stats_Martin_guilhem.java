/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_martin_guilhem;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guilhem
 */
public class TP1_stats_Martin_guilhem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        // Créez un tableau de 6 entiers et initialisez-le à 0
        int[] tableauFaces = new int[6];

        System.out.println("Saisissez le nombre d'itérations (m) : ");
        int m = sc.nextInt();

        // Effectuez m itérations
        for (int i = 0; i < m; i++) {
            // Générez un nombre aléatoire entre 0 et 5 inclus
            int resultatLancer = generateurAleat.nextInt(6);

            // Incrémentez la case correspondante dans le tableau
            tableauFaces[resultatLancer]++;
        }

        // Affichez le tableau résultat
        System.out.println("Résultat des lancers :");
        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + " : " + tableauFaces[i] + " fois");
        }
    }
}

    }
    
}
