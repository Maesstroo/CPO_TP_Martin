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
    public static void main(String[] args) {
        System.out.println("Please enter the operator:\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
    int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre entre 1 et 5 :");
        operateur=sc.nextInt();
    int operande1;
        System.out.println("\n Entrer le nombre :");
        operande1=sc.nextInt();
    int operande2;
        System.out.println("\n Entrer le nombre :");
        operande2=sc.nextInt();
    
    }

}
