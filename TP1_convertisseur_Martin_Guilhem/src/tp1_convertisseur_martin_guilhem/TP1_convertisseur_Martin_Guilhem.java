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
        System.out.println("Entrez la température dans l'unité que vous désirez:");
        vr=sc.nextDouble();
        System.out.println("Choisir votre convertion:\n 1 pour des Kelvin en Celcius\n2 pour des Farenheit en Celcius\n 3 pour des Celcius en Farenheit\n4 pour des Kelvin en Farenheit\n5 pour des Farenheit en Kelvin\n6 pour des Celcius en Kelvin");
        commande=sc.nextDouble();
        
        
        if (commande==1){
            double KversC= KelvinVersCelcius(vr);
            System.out.println("Les "+vr+" degrès Kelvin donnent "+KversC +"degrésCelcius");}
    
        if(commande==2){
        double FversC = FarenheitVersCelcius(vr);
        System.out.println("Les "+vr+" degrès Farenheit donnent "+FversC+"degrés Celcius");}
        
        if ( commande==3) {
        double CversF = CelciusVersFarenheit(vr);
        System.out.println("Les "+vr+" degrès Celcius donnent "+CversF+"Farenheit");}
        
        
        if(commande==4){
        double KversF= KelvinVersFarenheit(vr); 
        System.out.println("Les "+vr+" Kelvin donnent "+KversF+"Farenheit"); }
        
        if (commande==5) {
        double FversK = FarenheitVersKelvin (vr);
        System.out.println("Les "+vr+" degrès Farenheit donnent "+FversK+"Kelvin"); }
        
        if (commande==6) {
        double CversK = CelciusVersKelvin(vr);
        System.out.println("Les "+vr+" degrès Celcius donnent "+CversK+"Kelvin");}
        
         
    
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
    
    public static double KelvinVersFarenheit (double tKelvin2) { 
    double Celcius ;
    double Faren ;
    Celcius = tKelvin2 - 273.15; 
    Faren = Celcius * (9/5) + 32 ; 
    return Faren;}
  
    public static double FarenheitVersKelvin (double tFaren2) { 
    double Kelvin ;
    double Celcius ;
    Celcius = tFaren2 - 273.15; 
    Kelvin = Celcius * (9/5) + 32 ; 
    return Kelvin;}
    
 


}