/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_cabooter;

/**
 *
 * @author gabri
 */
public class Epee extends Arme {
    private int finesse;  // Indice de finesse (<100)

    // Constructeur pour initialiser l'épée avec nom, niveau d'attaque et finesse
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);  // Appel du constructeur de la classe parent (Arme)
        if (finesse <= 100 && finesse >= 0) {
            this.finesse = finesse;
        } else {
            System.out.println("Erreur : la finesse doit être comprise entre 0 et 100.");
        }
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'épée
    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}
