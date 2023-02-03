/**
 * This program is to write output.  to print like this we want
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,3 2023
 */
package chaiyadet.nutsaba.lab6;

import java.util.ArrayList;
import chaiyadet.nutsaba.lab5.Athlete;

public class WorldAthleteV3 {
    public static void main(String[] args) {
        ArrayList<AthleteV2> athletes = new ArrayList<AthleteV2>();
        BadmintonPlayerV2 ratchanok = new BadmintonPlayerV2("Ratchanok Intanon",
         55.0, 1.68, Athlete.Gender.FEMALE, "Thai", "05/02/1995");
        FootballerV2 tom = new FootballerV2("Tom Brady", 102, 1.93, 
        Athlete.Gender.MALE,"Thai", "03/08/1977");
        BoxerV2 wisaksil = new BoxerV2("Wisaksil Wanget", 51.0, 1.60,
        Athlete.Gender.MALE, "Thai", "08/12/1986");
        athletes.add(ratchanok);
        athletes.add(tom);
        athletes.add(wisaksil);

        for (AthleteV2 athlete : athletes){
            System.out.println(athlete);
            athlete.practice();
        }
    }
}
