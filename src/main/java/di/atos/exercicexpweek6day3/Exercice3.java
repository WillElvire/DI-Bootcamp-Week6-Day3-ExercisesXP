/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercicexpweek6day3;

import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author Koua Wilfried
 */
public class Exercice3XP {

    public static void main(String[] args) {
       
        System.out.println("======= Exercice 3 =========");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer un numéro : ");
        int userEntry = sc.nextInt();
        
        String userEntryToString = String.valueOf(userEntry);
        String userEntryToStringReverse = "";
        
        for(int i = userEntryToString.length() - 1; i >= 0; i--) {
            userEntryToStringReverse += userEntryToString.charAt(i);
        }
        
        System.out.println("userEntry is : " + userEntry + " userEntryReverse is: " + userEntryToStringReverse);
        
        System.out.println("======= Fin exercice 3 ========");
        
    }
}
