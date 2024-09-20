/*
 * GabrielCabooter
 * EX 2 TD0
 */
package exo.pkg2;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class EXO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
 int nb; // nombre d'entiers à additionner
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrer le nombre :");
        nb = sc.nextInt(); // On lit le nombre une seule fois
        int result; // résultat
        int ind; // indice
        
        result = 0;
        
        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind++;
        }
        
        // Affichage du résultat
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est : " + result);
        
    }
    
}
