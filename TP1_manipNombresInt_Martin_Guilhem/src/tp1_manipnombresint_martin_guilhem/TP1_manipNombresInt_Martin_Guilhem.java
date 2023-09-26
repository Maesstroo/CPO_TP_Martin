/* 
 * Martin Guilhem TDB
 * TPO EXO1 25/09/2023
 */
package tp1_manipnombresint_martin_guilhem;

import java.util.Scanner;

/**
 *
 * @author guilhem
 */
public class TP1_manipNombresInt_Martin_Guilhem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nbr1; 
        int nbr2; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un entier");
        nbr1=sc.nextInt();
        System.out.println("Entrez un entier");
        nbr2=sc.nextInt();
        
        System.out.println(nbr1+"+"+nbr2+"="+(nbr1+nbr2)) ;
        System.out.println(nbr1+"-"+nbr2+"="+(nbr1-nbr2)) ;
        System.out.println(nbr1+"*"+nbr2+"="+(nbr1*nbr2)) ;
        
        System.out.println(nbr1+"/"+nbr2+"="+(nbr1/nbr2)+"avec une reste de "+(nbr1%nbr2)) ;
        
    }
    
}
