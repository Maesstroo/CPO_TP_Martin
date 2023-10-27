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
// Classe Partie
public class Partie {
    private GrilleDejeu grille;
    private int nbCoups;

    /**
     * Constructeur de la classe Partie. Crée une nouvelle instance de la grille de cellules lumineuses
     * avec le nombre de lignes et de colonnes spécifié, puis initialise le compteur de coups à zéro.
     */
    public Partie() {
        grille = new GrilleDejeu(4, 4); // Par défaut, grille de 4x4 pour le niveau normal
        nbCoups = 0;
    }

    /**
     * Le c?ur de la classe Partie. Permet de jouer au jeu LightOff de manière interactive.
     * Affiche l'état initial de la grille, puis entre dans une boucle de jeu qui continue tant que
     * toutes les cellules ne sont pas éteintes.
     */
    public void lancerPartie() {
        initialiserPartie();
        afficherGrille();

        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes() && !grille.cellulesToutesAllumees()) {
            System.out.println("Choisis entre ligne, colonne, diagonale ou quitter : ");
            String coup = scanner.nextLine();

            if (coup.equals("ligne")) {
                System.out.print("Entrez le numéro de la ligne : ");
                int ligne = scanner.nextInt();
                grille.activerLigneDeCellules(ligne - 1); // Soustrayez 1 pour correspondre à l'index 0-based
            } else if (coup.equals("colonne")) {
                System.out.print("Entrez le numéro de la colonne : ");
                int colonne = scanner.nextInt();
                grille.activerColonneDeCellules(colonne - 1); // Soustrayez 1 pour correspondre à l'index 0-based
            } else if (coup.equals("diagonale")) {
                grille.activerDiagonaleDescendante();
            } else if (coup.equals("quitter")) {
                System.out.println("Vous avez décider de quitter");
                break;
            } else {
                System.out.println("Commande invalide.");
            }

            nbCoups++;
            afficherGrille();
            scanner.nextLine();
        }

        if (grille.cellulesToutesEteintes()) {
            System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
        } else if (grille.cellulesToutesAllumees()) {
            System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
        }
    }

    /**
     * Affiche l'état actuel de la grille.
     */
    public void afficherGrille() {
        System.out.println(grille);
    }

    /**
     * Permet au joueur de choisir un niveau de difficulté : Facile, Normal ou Difficile.
     * La taille de la grille varie en fonction du niveau choisi.
     */
    public void choisirNiveau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisis le niveau de difficulté que tu veux:");
        System.out.println("1. Facile avec une taille 2x2");
        System.out.println("2. Normal avec une taille 4x4");
        System.out.println("3. Difficile avec une taille 8x8");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                grille = new GrilleDejeu(2, 2);
                break;
            case 2:
                grille = new GrilleDejeu(4, 4);
                break;
            case 3:
                grille = new GrilleDejeu(8, 8);
                break;
            default:
                System.out.println("Niveau de difficulté non valide. Le Niveau normal de taille 4x4 est choisi par défaut.");
                break;
        }
    }

    /**
     * Initialise une nouvelle partie en choisissant le niveau de difficulté et en mélangeant la grille.
     */
    public void initialiserPartie() {
        choisirNiveau();
        grille.melangerMatriceAleatoirement(15); // Mélanger la grille
    }
}