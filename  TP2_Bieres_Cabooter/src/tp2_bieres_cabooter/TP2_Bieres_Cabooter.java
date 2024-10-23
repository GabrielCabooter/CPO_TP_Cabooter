/*
 * Gabriel Cabooter TP2 ex Biere
 */
package tp2_bieres_cabooter;

/**
 *
 * @author gabri
 */
public class TP2_Bieres_Cabooter {

   
    public static void main(String[] args) {
        // Creation de plusieurs objets BouteilleBiere
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0f, "Dubuisson");
        uneBiere.lireEtiquette();  // Affiche l'etiquette de la biere
        System.out.println(uneBiere);  // Utilisation de toString()

        // Creation de deux autres bieres
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere encoreUneBiere = new BouteilleBiere("Heineken", 5.0f, "Heineken");

        // Affichage des etiquettes des autres bieres
        autreBiere.lireEtiquette();
        encoreUneBiere.lireEtiquette();

        // Decapsuler les bieres
        uneBiere.Decapsuler();  // Ouvre la premiere biere
        autreBiere.Decapsuler();  // Ouvre la deuxieme biere
        autreBiere.Decapsuler();  // Tente de reouvrir une biere deja ouverte (affiche une erreur)

        // Affichage de l'etat des bieres apres decapsulage
        System.out.println(uneBiere);  // Affiche que la biere est ouverte
        System.out.println(autreBiere);  // Affiche que la biere est ouverte
        System.out.println(encoreUneBiere);  // Affiche que la biere est fermee
    }


}

      