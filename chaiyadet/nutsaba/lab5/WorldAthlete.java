/**
 * This program is to retrieve output from Athlete.java file.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version january 20, 2023
 */
package chaiyadet.nutsaba.lab5;

import chaiyadet.nutsaba.lab5.Athlete.Gender;

public class WorldAthlete {
    /**
     * The output of the program should be as show name,weight,gender,nationality,birthdate
     * 
     * @param args
     */
    public static void main(String[] args) {
        Athlete ratchanok = new Athlete("Ratchanok Intanon",55.0,1.68,Gender.FEMALE,"Thai","05/02/1995");
        Athlete wisaksil = new Athlete("Wisaksil Wanget", 51.0, 1.60, Gender.MALE, "Thai", "08/12/1986");
        Athlete tom = new Athlete("Tom Brady", 102, 1.93, Gender.MALE, "Thai", "03/08/1977");
        System.out.println(ratchanok.getName() + "'s height is" + ratchanok.getHeight());
        ratchanok.setHeight(1.70);
        System.out.println(ratchanok.getName() + "'s height has increaded to " + ratchanok.getHeight());
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
    }
}
