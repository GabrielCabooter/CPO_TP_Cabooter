/*
 * Gabriel Cabooter TD1 ex4
 */
package tp1_stats_cabooter;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TP1_stats_Cabooter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        int[] distributionDes = new int[6]; // Tableau de 6 cases, initialisé à 0 par défaut

        System.out.print("Combien de fois voulez-vous lancer le dé ? ");
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            int resultat = generateurAleat.nextInt(6); // Génère un nombre entre 0 et 5 (inclus)
            distributionDes[resultat]++; // Incrémente la case correspondante
        }

        System.out.println("\nRésultats des lancers de dés (affichage des cellules) :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (distributionDes[i] * 100.0) / m; // Calcul du pourcentage
            System.out.println("Face " + (i + 1) + ": " + pourcentage + "%");
        }   
    }
    
}
