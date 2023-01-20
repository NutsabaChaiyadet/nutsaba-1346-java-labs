/**
 * This program is to call each class to display.
 *   The information of each type of athlete is displayed.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version january 20, 2023
 */
package chaiyadet.nutsaba.lab5;

public class WorldAthleteV2 {
    /**
     * Printing information of each type of athlete
     * @param args
     */
    public static void main(String[] args) {
        BadmintonPlayer ratchanok = new BadmintonPlayer("Ratchanok Intanon",55,1.68, Athlete.Gender.FEMALE, "Thai","05/02/1995",66.5, 4);
        Footballer tom = new Footballer("Tom Brady", 102, 1.93, Athlete.Gender.MALE, "American", "03/08/1977","Quarterback","New England Patriots");
        Boxer wisaksil = new Boxer("Wisakail Wangek",51.5,1.60,Athlete.Gender.MALE, "Thai", "08/12/1986", "Super Flyweigh","M");
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
        BadmintonPlayer nitchaon = new BadmintonPlayer("Nitchaon Jindapol",52,1.63,Athlete.Gender.FEMALE, "Thailand", "31/03/1998",67,11);
        System.out.println("Both " + ratchanok.getName() + " and " + nitchaon.getName() + " Play " + BadmintonPlayer.getSport());
        ratchanok.compareAge(tom);
        ratchanok.compareAge(nitchaon);

        if(isTaller(wisaksil, tom)){
            System.out.println(wisaksil.getName() + " is taller than " + tom.getName());
        } else {
            System.out.println(wisaksil.getName() + " is not taller than " + tom.getName());
        }
    }
    /**
     * Athlete height comparison
     * @param one
     * @param two
     * @return
     */
    public static boolean isTaller(Athlete one, Athlete two ){
        if(one.getHeight() > two.getHeight()){
            return true;
        }else{
            return false;
        }
    }
}
