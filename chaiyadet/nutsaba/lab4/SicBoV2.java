/*
 * This program is a Hi-Lo game with 2 options: high or low and choose numbers 1-6.
 *   If finished playing  will go up, enter an a to continue playing  or put another one to stop
 * 
 * Author: Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* Date: january 13, 2023
 */

package chaiyadet.nutsaba.lab4;

import java.util.Scanner;
/**
 * Hi-Lo game
*/
public class SicBoV2 {
    static int choice;
    static Scanner sn = new Scanner(System.in);

    /**
     * Get value is an option to choose which game to play, 
     * type1 choose high or low, type2 choose the number the dice will roll.
     */
    public static void getChoice() {
        System.out.println("Welcome to นุษบา ไชยเดช (653040134-6) Game:");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter yourchoice:");    
    }

    /**
     * Game play, if choose 1, will get the value, type h or l,
     *  if choose h, the sum equals 11-18 to win, less than 11 is a loss, if choose l, 
     * the sum must be less than 11 to win, if greater than 10, lose,
     *  if selected  2 will choose numbers 1-6  If you choose the ball, you will win.
     */
    public static void playGame(){
        int c = sn.nextInt();
        //randomization of individual dice
        int dice1 = 1 + (int)(Math.random() * ((6-1) + 1));
        int dice2 = 1 + (int)(Math.random() * ((6-1) + 1));
        int dice3 = 1 + (int)(Math.random() * ((6-1) + 1));
        if (c == 1){ //If you choose 1, ask if you want to choose low or high.
            System.out.print("Type in h for high and l for low:");
            String t = sn.next();
            if (t.equalsIgnoreCase("h")) {
                System.out.println("Dice 1 : " + dice1 + ", " + "Dice 2 : " +  dice2 + ", " + " Dice 3 : " + dice3);         
                int total = dice1 + dice2 + dice3;
                System.out.println("Total is " + total);
                if (total >= 11 && total <= 18){ //If you choose Over, the sum of the dice must be greater than or equal to 11 but not more than 18 to win.
                    System.out.println("You win 20 Bath.");
                }
                else if (total >= 3 && total <= 10){ //If the total score is 3-10 points, it means losing.
                    System.out.println("You loose 10 Bath.");
                } 
            }
            else if (t.equalsIgnoreCase("l")) {
                System.out.println("Dice 1 : " + dice1 + ", " + "Dice 2 : " +  dice2 + ", " + " Dice 3 : " + dice3);         
                int total = dice1 + dice2 + dice3;
                System.out.println("Total is " + total);
                if (total >= 11 && total <= 18){ //If you choose l, the sum of points 11-18 is a loss.
                    System.out.println("You loose 10 Bath.");
                }
                else if (total >= 3 && total <= 10){ //If you choose l, the sum must be 3-10 to win.
                    System.out.println("You win 20 Bath.");
                } 
            }
            else {
                System.out.println("Incorrect input. Enter h for high and l for low only");
            }
        }
        else if (c == 2){
            System.out.print("Type in a number to bet on (1-6):");
            int y = sn.nextInt();
            if (y >= 1 && y <= 6){
                System.out.println("Dice 1 : " + dice1 + ", " + "Dice 2 : " +  dice2 + ", " + " Dice 3 : " + dice3);
                if ((dice1 == y) && (dice2 == y) && (dice3 == y)){ //If random numbers get all 3 numbers that we have chosen
                    System.out.println("You win " + " " + 10*3*(6%5+1) + " " + "Baht.");             
                }
                else if (((dice1 == y) && (dice2 == y)) || ((dice1 == y) && (dice3 == y)) || ((dice2 == y) && (dice3 == y))) {
                    System.out.println("You win " + " " + 10*2*(6%5+1) + " " + "Baht."); //If random numbers get 2 numbers that we have chosen
                }
                else if ((dice1 == y) || (dice2 == y) || (dice3 == y)){//If random numbers get the numbers that we choose 1 child   
                    System.out.println("You win " + " " + 10*1*(6%5+1) + " " + "Baht.");              
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

    /**
     * Getchoice and playgame display  Then choose whether to continue playing or not,
     *  if playing, loop to receive the value.  If not brake
     */
    public static void main(String[] args) {
        getChoice();
        playGame();
        while (true) { 
             System.out.println("Press A to play again. press the other keys to exit."); //Ask if you want to play again.  if playing choose a  If you stop printing other
             String agian = sn.next();
             if (agian.equalsIgnoreCase("A")){ //Typing A will loop back to getchoice and playgame .
                getChoice();
                playGame();
             }
             else{ //Typing A will loop back to getchoice and playgame .
                System.out.println("Good Bye!");
                break;
             }
            }
            sn.close();
    }
}