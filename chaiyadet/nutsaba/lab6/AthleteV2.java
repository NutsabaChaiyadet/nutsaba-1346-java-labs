/**
 * This program,athletesV2 extends from athletes program 
 * to inform athletes of each type of training.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,3 2023
 */
package chaiyadet.nutsaba.lab6;

import chaiyadet.nutsaba.lab5.Athlete;


public class AthleteV2 extends Athlete{
    public AthleteV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    public void practice(){
        System.out.print(name + " runs for 10 km ");
    }
}
