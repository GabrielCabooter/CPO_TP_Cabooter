/*
 * Gabriel CABOOTER
 * TD1 Ex 2
 */
package tp1_convertisseur_cabooter;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TP1_convertisseur_Cabooter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir une valeur reelle : ");
        
        double val = scanner.nextDouble();
        
        System.out.println( val);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println(" 1) De Celcius vers Kelvin ");
        System.out.println(" 2) De Kelvin vers Celcius ");
        System.out.println(" 3) De Farenheit vers Celcius ");
        System.out.println(" 4) De Celcius vers Farenheit ");
        System.out.println(" 5) De Kelvin vers Farenheit ");
        System.out.println(" 6) De Farenheit vers Kelvin ");
        
        String uniteInitiale = "";
        String uniteFinale = "";
        
        double resultat = 0;
        int Convertion = scanner.nextInt();
        
        switch (Convertion) {
            case 1 -> {
                resultat = CelciusVersKelvin(val);
                uniteInitiale = "degres Celsius";
                uniteFinale = "Kelvin";
            }
            case 2 -> {
                resultat = KelvinVersCelcius(val);
                uniteInitiale = "Kelvin";
                uniteFinale = "degres Celsius";
            }
            case 3 -> {
                resultat = FarenheitVersCelcius(val);
                uniteInitiale = "degrés Fahrenheit";
                uniteFinale = "degres Celsius";
            }
            case 4 -> {
                resultat = CelciusVersFarenheit(val);
                uniteInitiale = "degrés Celsius";
                uniteFinale = "degres Fahrenheit";
            }
            case 5 -> {
                resultat = KelvinVersFarenheit(val);
                uniteInitiale = "Kelvin";
                uniteFinale = "degres Fahrenheit";
            }
            case 6 -> {
                resultat = FarenheitVersKelvin(val);
                uniteInitiale = "degres Fahrenheit";
                uniteFinale = "Kelvin";
            }
            
            
        }
        
        System.out.println(val + " " + uniteInitiale + " est egal a " + resultat + " " + uniteFinale);
    }
    


public static double CelciusVersKelvin (double Val) { 
    
        return Val + 273.15;
    
        }
public static double KelvinVersCelcius (double Val ) { 
    
        return  Val - 273.15;
    
        }
public static double FarenheitVersCelcius (double Val ) { 
    
        return (Val/9/5) + 32 ;
    
        }
public static double CelciusVersFarenheit (double Val ) { 
    
        return (Val*9/5) - 32 ;
    
        }
public static double KelvinVersFarenheit (double Val ) { 
    
        return CelciusVersFarenheit(KelvinVersCelcius(Val)) ;
    
        }
public static double FarenheitVersKelvin (double Val ) { 
    
        return KelvinVersCelcius(CelciusVersFarenheit(Val)) ;
    
        }

}