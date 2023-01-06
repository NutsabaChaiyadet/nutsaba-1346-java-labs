/*
 * This program is to play Hi-Lo game.  There are 2 choices. 
 *  The first option is to select High or Low.  
 * and option 2 is to select the numbers to be randomly selected.
 * 
 * Author: Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* Date: january 6, 2023
 */
package chaiyadet.nutsaba.lab3;

import java.util.Scanner;

public class SicBo {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.println("Choose how do you want to bet:");
            System.out.println("Type 1 for choosing high or low numbers.");
            System.out.println("Type 2 for choosing number between 1-6.");
            System.out.print("Enter yourchoice:");
            int c = sn.nextInt();
            int dice1 = 1 + (int)(Math.random() * ((6-1) + 1));
            int dice2 = 1 + (int)(Math.random() * ((6-1) + 1));
            int dice3 = 1 + (int)(Math.random() * ((6-1) + 1));

            if (c == 1) {
                System.out.print("Type in h for high and l for low:");
                String t = sn.next();
                if (t.equalsIgnoreCase("h")) {
                    System.out.println("Dice 1 : " + dice1 + ", " + "Dice 2 : " +  dice2 + ", " + " Dice 3 : " + dice3);         
                    int total = dice1 + dice2 + dice3;
                    System.out.println("Total is " + total);
                    if (total >= 11 && total <= 18){
                        System.out.println("You win 20 Bath.");
                    }
                    else if (total >= 3 && total <= 10){
                        System.out.println("You loose 10 Bath.");
                    } 
                }
                else if (t.equalsIgnoreCase("l")) {
                    System.out.println("Dice 1 : " + dice1 + ", " + "Dice 2 : " +  dice2 + ", " + " Dice 3 : " + dice3);         
                    int total = dice1 + dice2 + dice3;
                    System.out.println("Total is " + total);
                    if (total >= 11 && total <= 18){
                        System.out.println("You loose 10 Bath.");
                    }
                    else if (total >= 3 && total <= 10){
                        System.out.println("You win 20 Bath.");
                    } 
                }
                else {
                    System.out.println("Incorrect input. Enter h for high and l for low only");
                }
            }
            else if (c == 2) {
                System.out.println("Type in a number to bet on (1-6):");
                int y = sn.nextInt();
                if (y >= 1 && y <= 6){
                    System.out.println("Dice 1 : " + dice1 + ", " + "Dice 2 : " +  dice2 + ", " + " Dice 3 : " + dice3);
                    if ((dice1 == y) && (dice2 == y) && (dice3 == y)){  //If random numbers get all 3 numbers that we have chosen
                        System.out.println("You win 90 Baht.");             
                    }
                    else if (((dice1 == y) && (dice2 == y)) || ((dice1 == y) && (dice3 == y)) || ((dice2 == y) && (dice3 == y))) {
                        System.out.println("You win 60 Baht."); //If random numbers get 2 numbers that we have chosen
                    }
                    else if ((dice1 == y) || (dice2 == y) || (dice3 == y)){
                        System.out.println("You win 30 Baht."); //If random numbers get the numbers that we choose 1 child               
                    }            
                    else if ((dice1 != y) && (dice2 != y) && (dice3 != y)) {
                        System.out.println("You loose 10 Baht");
                    }
            }
                else {
                    System.out.println("Incorrect input. Enter a number between 1-6 only.");
                }
            }
            else {
                System.out.println("Incorrect input. Enter 1 or 2 only.");
            }
        }  
    }
}
