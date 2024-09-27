/*
 * TP1 Gabriel Cabooter
 * Jeu guess my number
 */
package tp1_guessmynumber_cabooter;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TP1_guessMyNumber_Cabooter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();

        // Choix du niveau de difficulté
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1) Facile (10 essais)");
        System.out.println("2) Normal (7 essais)");
        System.out.println("3) Difficile (5 essais)");
        int difficulte = scanner.nextInt();

        int essaisRestants;
        switch (difficulte) {
            case 1 -> essaisRestants = 10; // Facile
            case 2 -> essaisRestants = 7;  // Normal
            case 3 -> essaisRestants = 5;  // Difficile
            default -> {
                System.out.println("Niveau non valide, passage en mode normal.");
                essaisRestants = 7; // Par défaut, mode normal
            }
        }

        // Génération d'un nombre aléatoire entre 0 et 100
        int nombreADeviner = generateurAleat.nextInt(101);
        System.out.println("Devinez le nombre entre 0 et 100 !");

        int proposition;
        int nombreTentatives = 0;

        // Boucle while jusqu'à ce que l'utilisateur devine le bon nombre ou épuise ses essais
        while (essaisRestants > 0) {
            System.out.print("Entrez un nombre : ");
            proposition = scanner.nextInt();
            nombreTentatives++;
            essaisRestants--;

            // Comparaison et affichage des messages en fonction du niveau de difficulté
            if (proposition < nombreADeviner) {
                if (Math.abs(proposition - nombreADeviner) > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (proposition > nombreADeviner) {
                if (Math.abs(proposition - nombreADeviner) > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Gagné ! Vous avez trouve le nombre en " + nombreTentatives + " tentatives.");
                return;
            }

            if (essaisRestants > 0) {
                System.out.println("Il vous reste " + essaisRestants + " essais.");
            }
        }

        // Si l'utilisateur n'a plus d'essais, il a perdu
        System.out.println("Desole, vous avez épuise tous vos essais. Le nombre a deviner etait " + nombreADeviner);
    
    }
    
}
