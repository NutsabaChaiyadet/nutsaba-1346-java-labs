/**
 * This application is announcing the type of boxing athlete information.  to be displayed in main
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version january 20, 2023
 */
package chaiyadet.nutsaba.lab5;

public class Boxer extends Athlete {
    static String sport = "Boxing";
    private String division;
    private String golveSize;
    public Boxer(String name,double weight,double height,Gender gender,String nationality,String birthdate,String division,String golveSize){
        super(name, weight, height, gender, nationality, birthdate);
        this.division = division;
        this.golveSize = golveSize;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public String getGolveSize() {
        return golveSize;
    }
    public void setGolveSize(String golveSize) {
        this.golveSize = golveSize;
    }
    @Override
    public String toString() {
        return  name + ", " + weight + "kg" + ", " + height + "m" + ", " + gender + ", " 
        + nationality + ", " + birthdate + ", "+ sport + ", " + division + ", " + golveSize ;
    }
    public static String getSport() {
        return sport;
    }
}
