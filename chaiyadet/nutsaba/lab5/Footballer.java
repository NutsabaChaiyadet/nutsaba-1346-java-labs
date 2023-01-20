/**
 * This program is to import athlete data types to display in main.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version january 20, 2023
 */
package chaiyadet.nutsaba.lab5;

public class Footballer extends Athlete{
    static String sport = "American Football";
    private String position;
    private String team;

    public Footballer(String name,double weight,double height,Gender gender,String nationality,String birthdate,String position, String team){
        super(name, weight, height, gender, nationality, birthdate);
        this.position = position;
        this.team = team;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return name + ", " + weight + "kg" + ", " + height + "m" + ", " + gender + ", " 
        + nationality + ", " + birthdate + ", "+ sport + ", " + position + ", " + team ;
    }
    public static String getSport() {
        return sport;
    }
} 


