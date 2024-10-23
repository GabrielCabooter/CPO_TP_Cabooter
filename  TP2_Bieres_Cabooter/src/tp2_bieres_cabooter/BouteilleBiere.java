/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_cabooter;

/**
 *
 * @author gabri
 */
public class BouteilleBiere {
    private String nom;          // Nom de la bière
    private float degreAlcool;   // Degré d'alcool de la bière
    private String brasserie;    // Nom de la brasserie
    private boolean ouverte;     // Indique si la bouteille est ouverte

    // Constructeur pour initialiser les attributs
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;  // Par défaut, la bouteille est fermée
    }

    // Méthode pour afficher l'étiquette de la bouteille
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + 
                           " degrés) \nBrasserie : " + brasserie);
    }

    // Méthode pour décapsuler la bouteille
    public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;  // On ouvre la bouteille
            return true;
        } else {
            System.out.println("Erreur : Biere deja ouverte !");
            return false;  // La biere est deja ouverte
        }
    }

    
    public String toString() {
        String chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";
        if (ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}




    

