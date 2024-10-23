/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_cabooter;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class TP3_Heroic_Fantasy_Cabooter {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // Création des épées
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // Création des bâtons
        Baton chene = new Baton("Chene", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Création d'un tableau dynamique pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des épées et des bâtons dans la liste
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // Affichage des caractéristiques de chaque arme dans le tableau dynamique
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
    }
}