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
public class Exercice2XP {

    public static void main(String[] args) {
        
        triangle = "";
        
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= i; j++) {
                triangle += String.valueOf(i);
            }
            System.out.println(triangle);
            triangle = "";
        }
               
    }
}
