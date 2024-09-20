/*
 * GabrielCabooter
 * TP0 ex3
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Affichage du texte pour demander à l'utilisateur de choisir une opération
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        
        int operateur = scanner.nextInt();
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: Invalid operator selected. Please choose a number between 1 and 5.");
            
        }
            
        
        // Demande de la première valeur
        System.out.println("Please enter the first value:");
        double operande1 = scanner.nextDouble();
        System.out.println("Please enter the second value:");
        double operande2 = scanner.nextDouble();
        
        
        
        
        // Variable pour stocker le résultat
        double result = 0;
        boolean validOperation = true; // Pour gérer les divisions par zéro

        // Calcul du résultat en fonction de l'opérateur choisi
        switch (operateur) {
            case 1 -> result = operande1 + operande2;
            case 2 -> result = operande1 - operande2;
            case 3 -> result = operande1 * operande2;
            case 4 -> {
                if (operande2 != 0) {
                    result = operande1 / operande2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
            }
            case 5 -> {
                if (operande2 != 0) {
                    result = operande1 % operande2;
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    validOperation = false;
                }
            }
            default -> {
                System.out.println("Invalid operator selected.");
                validOperation = false;
            }
        }

        // Affichage du résultat si l'opération est valide
        if (validOperation) {
            System.out.println("The result of the operation is: " + result);
        }
        
        // Fermeture du scanner
        scanner.close();
    }
        
        
        
    
}
