package chaiyadet.nutsaba.lab6;

import chaiyadet.nutsaba.lab5.Athlete;


public class AthleteV2 extends Athlete{
    public AthleteV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    public void practice(){
        System.out.print(name + "runs for 10 km and plays half court");
    }
}
class BadmintonPlayerV2 extends AthleteV2{

    public BadmintonPlayerV2(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
            }
            @Override
            public void practice() {
                super.practice();
                System.out.println(name + "runs for 10 km and plays half court");
            }
}
class BoxerV2 extends AthleteV2{

    public BoxerV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }
    @Override
    public void practice() {
        super.practice();
        System.out.println(name + "runs for 10 km and plays half court");
    }

}
class FootballerV2 extends AthleteV2{

    public FootballerV2(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }
    @Override
    public void practice() {
        super.practice();
        System.out.println(name + "runs for 10 km and plays half court");
    }
    
}
