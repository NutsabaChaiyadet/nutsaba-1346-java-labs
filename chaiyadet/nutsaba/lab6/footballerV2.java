/**
 * This program is display of training data of footballer athletes.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,3 2023
 */
package chaiyadet.nutsaba.lab6;

class FootballerV2 extends AthleteV2{

    public FootballerV2(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }
    @Override
    public void practice() {
        super.practice();
        System.out.println("and catches a football");
    }
    
}