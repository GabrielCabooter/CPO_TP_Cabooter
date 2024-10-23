/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_cabooter;

/**
 *
 * @author gabri
 */
public class Baton extends Arme {
    private int age;  // Âge du bâton (<100)

    // Constructeur pour initialiser le bâton avec nom, niveau d'attaque et âge
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);  // Appel du constructeur de la classe parent (Arme)
        if (age <= 100 && age >= 0) {
            this.age = age;
        } else {
            System.out.println("Erreur : l'âge doit être compris entre 0 et 100.");
        }
    }

    // Redéfinition de la méthode toString pour afficher les informations du bâton
    @Override
    public String toString() {
        return super.toString() + ", Âge : " + age;
    }
}
