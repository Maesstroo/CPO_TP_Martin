/* 
 * Martin Guilhem TDB
 * TPO EXO1 25/09/2023
 */
package tp1_convertisseur_martin_guilhem;

import java.util.Scanner;

/**
 *
 * @author guilhem
 */
public class TP1_convertisseur_Martin_Guilhem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vr;
        double commande; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la température");
        vr=sc.nextDouble();
        System.out.println("Choisir votre convertion:\n 1 pour des Kelvin en Celcius\n2 pour des Farenheit en Celcius\n 3 pour des Celcius en Farenheit\n4 pour des Kelvin en Farenheit\n5 pour des Farenheit en Kelvin\n6 pour des Celcius en Kelvin");
        commande=sc.nextDouble();
        
        double CversK = CelciusVersKelvin(vr);
        System.out.println("Les "+vr+" degrès celcius donnent "+CversK+"Kelvin");
         
        double KversC= KelvinVersCelcius(vr);
        System.out.println("Les "+vr+" degrès celcius donnent "+KversC +"Kelvin");
        
        double CversF = CelciusVersFarenheit(vr);
        System.out.println("Les "+vr+" degrès celcius donnent "+CversF+"Kelvin");
        
        double FversC = FarenheitVersCelcius(vr);
        System.out.println("Les "+vr+" degrès celcius donnent "+FversC+"Kelvin");
         
    
    }
     public static double CelciusVersKelvin (double tCelcius) { 
    double kelvin ;
    kelvin = tCelcius + 273.15; 
    return kelvin;}
     
     public static double KelvinVersCelcius (double tKelvin) { 
    double Celcius ;
    Celcius = tKelvin - 273.15; 
    return Celcius;}
    
    public static double CelciusVersFarenheit(double tCelcius2)  { 
    double Faren ;
    Faren = tCelcius2 * (9/5) + 32 ; 
    return Faren;
     }
    
    public static double FarenheitVersCelcius(double tFaren)  { 
    double Celcius2 ;
     Celcius2 = tFaren / (9/5) - 32 ; 
    return Celcius2 ;
    }



}