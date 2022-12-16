package chaiyadet.nutsaba.lab3;

import java.util.Scanner;

public class SicBo{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Choose how do you want to bet:");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter yourchoice:");
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
            System.out.println("Type in a number to bet on (1-6):");
            int c = sn.nextInt();
            

        }
          
    }
}
