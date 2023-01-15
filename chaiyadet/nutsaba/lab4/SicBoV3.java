/*
 * This program is a Hi-Lo game with 2 options: high or low and choose numbers 1-6. 
 *  If finished playing  will go up, enter an a to continue playing  or put another one to stop  Then if select a,
 *  enter a new option whether to choose option 1 or 2, then select again.  And if receiving the wrong value, 
 * it will receive new values ​​continuously
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version january 13, 2023
 */
package chaiyadet.nutsaba.lab4;

import java.util.Scanner;
/**
 * Generating Random Hi-Lo Games
 */
public class SicBoV3 {
    static int choice;
    static Scanner sn = new Scanner(System.in);
    static int t1;
    /**
     * Get the value of whether to continue playing or not. 
     *  If you don't press anything, it's goodbye. If playing, press a.
     */
    public static void main(String[] args) {
        getChoice();
        playGame();
        while (true) {
             System.out.println("Press A to play again. press the other keys to exit.");
             String agian = sn.next();
             if (agian.equalsIgnoreCase("A")){
                getChoice();
                playGame();
             }
             else{
                System.out.println("Good Bye!");
                break;
             }
            }
            sn.close();
    }
    /**
     * Get value is an option to choose which game to play, type1 choose high or low, 
     * type2 choose the number the dice will roll.  If you choose 1 or 2, 
     * you can continue playing the game.  If not, will loop back to get new values.
     */
    public static void getChoice() {
        System.out.println("Choose how do you want to bet:");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter yourchoice:");   
        while (true){ //loop get value
            String type = sn.next();
            if (type.equals("1") || type.equals("2")){
                t1 = Integer.parseInt(type);

            }else {
                System.out.println("Enter only 1 or 2: ");
                getChoice();
            }     
            break;    
        } 
    }
    /**
     * The playgame is if 1 is selected and then h or l is selected, the game is played.  
     * If you type another character, it will return to accept the new value.
     */
    public static void playGame(){
        int dice1 = 1 + (int)(Math.random() * ((6-1) + 1));
        int dice2 = 1 + (int)(Math.random() * ((6-1) + 1));
        int dice3 = 1 + (int)(Math.random() * ((6-1) + 1));

        if (t1 == 1){
            System.out.print("Type in h for high and l for low: ");
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
                playGame();
            }
        }
        else if (t1 == 2){ 
            System.out.print("Type in a number to bet on (1-6): ");
            String z = sn.next();
            if(z.equals("1") || z.equals("2") || z.equals("3") || z.equals("4") || z.equals("5") || z.equals("6")) {
                int y = Integer.parseInt(z);
                if (y >= 1 && y <= 6){
                    System.out.println("Dice 1 : " + dice1 + ", " + "Dice 2 : " +  dice2 + ", " + " Dice 3 : " + dice3);
                    if ((dice1 == y) && (dice2 == y) && (dice3 == y)){
                        System.out.println("You win " + " " + 10*3*(6%5+1) + " " + "Baht.");             
                    }
                    else if (((dice1 == y) && (dice2 == y)) || ((dice1 == y) && (dice3 == y)) || ((dice2 == y) && (dice3 == y))) {
                        System.out.println("You win " + " " + 10*2*(6%5+1) + " " + "Baht.");
                    }
                    else if ((dice1 == y) || (dice2 == y) || (dice3 == y)){
                        System.out.println("You win " + " " + 10*1*(6%5+1) + " " + "Baht.");              
                    }            
                    else if ((dice1 != y) && (dice2 != y) && (dice3 != y)) {
                        System.out.println("You loose 10 Baht");
                    }             
            }    
            }     
            else {
                System.out.println("Incorrect input. Enter a number between 1-6 only.");
                playGame();
            }
        }
        else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
        }  
    }
   
}