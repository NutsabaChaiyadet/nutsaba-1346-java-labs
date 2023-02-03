/**
 * This program is display of training data of badminton athletes.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,3 2023
 */
package chaiyadet.nutsaba.lab6;

class BadmintonPlayerV2 extends AthleteV2{

    public BadmintonPlayerV2(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
            }
            @Override
            public void practice() {
                super.practice();
                System.out.println("and plays half court singles");
            }
}

