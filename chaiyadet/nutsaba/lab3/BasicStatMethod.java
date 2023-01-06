/*
 * This program is to get at least 1 number but not more than 10 numbers.
 *   Then the program will sort the values.  and find the minimum and maximum values,
 *  mean, median, and standard deviation.
 * 
 * Author: Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* Date: january 6, 2023
 */
package chaiyadet.nutsaba.lab3;

import java.util.Scanner;
import java.util.Arrays;

public class BasicStatMethod {
    public static void main(String[] args) {
    String input = getInput();
    CalculateStat(input);
    }
    public static String getInput() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter numbers (separated by space): ");
        String input = sn.nextLine();
        sn.close();
        return input;
    }
    public static void CalculateStat(String input) {
        String n[] = input.split(" ");
        int total = n.length; //Count the number of entered numbers.
        double xList[] = new double[total];
        for (int i=0; i<total; i++){
            xList[i] = Double.parseDouble(n[i]);
        }
        if (total < 1) {
            System.out.println("Please provide at least one argument.");
        }
        else if (total > 10){
            System.out.println("Please provide at most tenargument.");
        }
        else if (total <= 10){
            Arrays.sort(xList); //Sort numbers from least to greatest.
            System.out.print("Sort number are ");
            for (double element : xList){
                System.out.print(element + " ");
            }

            Double max = Arrays.stream( xList ).max().getAsDouble(); //find the maximum
            System.out.println("\nMinimum: " + xList[0]); //Take the first position as the lowest value.
            System.out.println("Maximum: " + max);
            int sum = 0 ; //fine the average 
            float x = 0;
            for (int i = 0; i < total; i++ ) {
                sum += xList[i];
            }
            x = sum / total;  
            System.out.println("Average: " + String.format("%.2f",  x )); 
            if (total%2 == 0){ //If the number of numbers received is an even number  will print like this
                System.out.println("Median: " + String.format("%.2f",((xList[total/2-1]+xList[total/2])/2)));
            }
            else if (total%2 == 1){ //If the number of numbers received is an odd number  will print like this
                System.out.println("Median: " + String.format("%.2f", (xList[(total+1)/2-1])));
            }
            double sum1 = 0;
            for (int i=0; i<total; i++) { 
                double sum2 = (xList[i] - x)*(xList[i] - x);
                sum1 += sum2;
            }
            System.out.println("standard deviation: " +  String.format("%.2f", Math.sqrt(sum1/total)));
        }
    }
}
