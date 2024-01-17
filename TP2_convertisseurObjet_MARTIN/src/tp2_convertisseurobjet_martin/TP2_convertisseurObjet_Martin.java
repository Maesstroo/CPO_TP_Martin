/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_martin;

import java.util.Scanner;

/**
 *
 * @author guilhem
 */
public class TP2_convertisseurObjet_Martin{

    public static void main(String[] args) {
       
        int conversion;
        float temp;
        boolean program=true;
       
        Convertisseur SuperTemperator = new Convertisseur();
       
        do{  
        boolean condition=true;

        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saisissez une température");
        temp = sc.nextFloat(); 
       
        do {
       
        System.out.println("En quelle unité voulez-vous convertir cette température ?\n1) Celcius en Kelvin\n2) Kelvin en Celcius\n3) Farenehit en Celcius\n4) Celcius en Farenheit\n5) Kelvin en Farenheit\n6) Farenheit en Kelvin");
        conversion = sc.nextInt();
       
         if (conversion > 6 || conversion <1) {
         System.out.println("Erreur de saisie, choisissez une valeur entre 1 et 6");  
        } else {
             condition = false;  
           }      
       } while(condition);
       
        switch(conversion){
            case 1 -> 
                System.out.println(SuperTemperator.CelciusVersKelvin(temp));
     
            case 2 -> 
                System.out.println(SuperTemperator.KelvinVersCelcius(temp));

            case 3 -> 
                System.out.println(SuperTemperator.FarenheitVersCelcius(temp));

            case 4 -> 
                System.out.println(SuperTemperator.CelciusVersFarenheit(temp));

            case 5 -> 
                System.out.println(SuperTemperator.KelvinVersFarenheit(temp));

            case 6 -> 
                System.out.println(SuperTemperator.FarenheitVersKelvin(temp));

            default -> {
            }
            }
       
        int restart=0;
        condition = true;
       
        do {
        System.out.println("Voulez-vous reconvertir une température ?\n1) Oui\n2) Non");
        restart = sc.nextInt(); 
       
         if ((!(restart==1)) && (!(restart==2))) {
         System.out.println("Erreur de saisie, choisissez une valeur entre 1 et 2");  
        } else {
             condition = false;  
           }      
       } while(condition);
       
       if(restart==2){
           program=false;
       }
       
        }while(program);
       
        System.out.println("Nombre de conversions réalisées :");
        System.out.print(SuperTemperator);
    }
    
    
}
