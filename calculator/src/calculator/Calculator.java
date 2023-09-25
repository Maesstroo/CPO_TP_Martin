/* 
 * Martin Guilhem TDB
 * TPO EXO1 25/09/2023
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author guilhem
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("Please enter the operator:\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
    int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre entre 1 et 5 :");
        operateur=sc.nextInt();
        
    if (operateur!=1 && operateur!=2 && operateur!=3 && operateur!=4 && operateur!=5){
        System.out.println("Erreur veuilllez entrer un nombre entre 1 et 5");
      System.exit(0);}
    
     int operande1;
        System.out.println("\n Entrer le nombre :");
        operande1=sc.nextInt();
    
    int operande2;
        System.out.println("\n Entrer le nombre :");
        operande2=sc.nextInt();
    int resultats = 0;
    
    if (operateur == 1) {
        resultats=operande1 + operande2 ;
         System.out.println(operande1+"+"+operande2+"="+resultats);} 
    
    if (operateur == 2) {
        resultats= operande1-operande2;
         System.out.println(operande1+"-"+operande2+"="+resultats);} 
    
    if (operateur == 3) {
        resultats= operande1*operande2;
         System.out.println(operande1+"*"+operande2+"="+resultats);} 
    
    if (operateur == 4) {
        resultats= operande1/operande2;
         System.out.println(operande1+"/"+operande2+"="+resultats);} 
    
    if (operateur == 5) {
        resultats= operande1%operande2;
         System.out.println(operande1+"%"+operande2+"="+resultats);}
    
    
    
    
    }

}
