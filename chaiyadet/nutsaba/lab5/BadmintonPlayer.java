/**
 * This program is to import badminton player data type to display in main.
 * 
 *  @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version january 20, 2023
 */
package chaiyadet.nutsaba.lab5;

public class BadmintonPlayer extends Athlete{
    static String sport = "Badminton";
    private double racketLength;
    private int worldRanking;

    public BadmintonPlayer(String name,double weight,double height,Gender gender,String nationality,String birthdate,double racketLength, int worldRanking){
        super(name, weight, height, gender, nationality, birthdate);
        this.racketLength = racketLength;
        this.worldRanking = worldRanking;
    }
    public double getRacketLength() {
        return racketLength;
    }
    public void setRacketLength(double racketLength) {
        this.racketLength = racketLength;
    }
    public int getWorldRanking() {
        return worldRanking;
    }
    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }

    @Override
    public String toString() {
        return name + ", " + weight + "kg" + ", " + height + "m" + ", " + gender + ", " 
        + nationality + ", " + birthdate + ", "+ sport + ", " + racketLength + "cm" + "rank:" + worldRanking ;
    }
    public static String getSport() {
        return sport;
    }
    
} 

