package chaiyadet.nutsaba.lab4;

import java.util.Scanner;

public class SicBoV2 {
    static int choice;
    static Scanner sn = new Scanner(System.in);
    public static void getChoice() {
        System.out.println("Welcome to นุษบา ไชยเดช (653040134-6) Game:");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter yourchoice:");    
    }
    public static void playGame(){
        int c = sn.nextInt();
        int dice1 = 1 + (int)(Math.random() * ((6-1) + 1));
        int dice2 = 1 + (int)(Math.random() * ((6-1) + 1));
        int dice3 = 1 + (int)(Math.random() * ((6-1) + 1));

        if (c == 1){
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
        else if (c == 2){
            System.out.print("Type in a number to bet on (1-6):");
            int y = sn.nextInt();
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
            else {
                System.out.println("Incorrect input. Enter a number between 1-6 only.");
            }
        }
        else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
        }  
    }
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
}




       