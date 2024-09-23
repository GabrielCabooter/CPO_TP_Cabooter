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
        System.out.print("Veuillez saisir une valeur réelle : ");
        double Val = scanner.nextDouble();
        System.out.println( Val);
        System.out.print("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.print(" 1) De Celcius vers Kelvin ");
        System.out.print(" 2) De Kelvin vers Celcius ");
        System.out.print(" 3) De Farenheit vers Celcius ");
        System.out.print(" 4) De Celcius vers Farenheit ");
        System.out.print(" 5) De Kelvin vers Farenheit ");
        System.out.print(" 6) De Farenheit vers Kelvin ");
        
        double result = 0;
        int Convertion = scanner.nextInt();
        
        switch (Convertion) {
            case 1 -> result = CelciusVersKelvin (Val); 
            case 2 -> result = KelvinVersCelcius ( Val );
            case 3 -> result = FarenheitVersCelcius ( Val );
            case 4 -> result = CelciusVersFarenheit ( Val );
            case 5 -> result = KelvinVersFarenheit ( Val );
            case 6 -> result = FarenheitVersKelvin ( Val );
            
        }
        
                
            
         
        
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