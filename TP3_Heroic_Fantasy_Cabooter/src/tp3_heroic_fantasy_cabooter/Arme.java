/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_cabooter;

/**
 *
 * @author gabri
 */
public abstract class Arme {
    protected String nom;        // Nom de l'arme
    protected int niveauAttaque; // Niveau d'attaque de l'arme (entier <= 100)

    // Constructeur pour initialiser le nom et le niveau d'attaque
    public Arme(String nom, int niveauAttaque) {
        if (niveauAttaque <= 100 && niveauAttaque >= 0) {
            this.nom = nom;
            this.niveauAttaque = niveauAttaque;
        } else {
            System.out.println("Erreur : le niveau d'attaque doit être compris entre 0 et 100.");
        }
    }

    // Méthode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Méthode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Méthode toString redéfinie pour afficher le nom et le niveau d'attaque
    @Override
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}

