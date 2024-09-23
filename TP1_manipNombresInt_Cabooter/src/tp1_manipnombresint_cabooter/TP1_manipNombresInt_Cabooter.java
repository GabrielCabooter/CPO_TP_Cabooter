/*
 * Gabriel Cabooter
 * TD1
 */
package tp1_manipnombresint_cabooter;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TP1_manipNombresInt_Cabooter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir le premier entier : ");
        int premierEntier = scanner.nextInt(); 
        System.out.print("Veuillez saisir le deuxième entier : ");
        int deuxiemeEntier = scanner.nextInt(); 

        int somme = premierEntier + deuxiemeEntier;
        int difference = premierEntier - deuxiemeEntier;
        int produit = premierEntier * deuxiemeEntier;
        Double quotient = ( premierEntier * 1.0) / deuxiemeEntier;
        Double reste = ( premierEntier * 1.0) % deuxiemeEntier;

        System.out.println("Vous avez saisi : " + premierEntier + " et " + deuxiemeEntier);
        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence entre les deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);
        System.out.println("Le quotient entier de la division du premier par le second est : " + quotient);
        System.out.println("Le reste de la division euclidienne du premier par le second est : " + reste);

    }
    
}
