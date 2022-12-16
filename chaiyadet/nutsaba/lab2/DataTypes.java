/* 
 * This program is output my name and my ID
 * Author: Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* Date: December 16, 2022
*/
package chaiyadet.nutsaba.lab2;

public class DataTypes {
    public static void main(String[] args) {
        String name = "Nutsaba Chaiyadet";
        String student_ID = " 6530401346";
        char c1 = name.charAt(0);
        boolean n = true;
        int base8 = 056; // เลขฐาน8
        int base16 = 0x2E; //เลขฐาน16
        long num = 46L;
        float num1 = 46.65F;
        double num2 = 46.22;

    System.out.println("My name is " + name);
    System.out.println("My student ID was" + student_ID);
    System.out.println(c1 + " " + n + " " + base8 + " " + base16 );
    System.out.println(num + " " + num1 + " " + num2);
    }
} 