/**
 * This program is  BadmintonplayerV3 extends form BadmintonplayerV2 
 *  Added is racketLengh and world ranking and speed.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,3 2023
 */

package chaiyadet.nutsaba.lab6;
interface BadmintonPlayable{ //Badminton Playable interface with 2 methods
    public void racketLength();   
    public void worldRanking();
}
interface Sprinter{ //Sprint interface with 1 method
    public void speed();
}
public class BadmintonPlayerV3 extends BadmintonPlayerV2{
    protected int racketLength;
    protected int worldRanking;
    protected double speed;
    public int getRacketLength() {
        return racketLength;
    }
    public void setRacketLength(int racketLength) {
        this.racketLength = racketLength;
    }
    public int getWorldRanking() {
        return worldRanking;
    }
    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public BadmintonPlayerV3(String name, double weight, double height, Gender gender, String nationality,
            String birthdate,int racketLength,int worldRanking,double speed) {
        super(name, weight, height, gender, nationality, birthdate);
    }
    //Returning data to be output
    public String toString(){
        return super.toString() + "\n " + name + " is a Badminton player whose world ranking is " + worldRanking + " and has sprint speed as " + speed;
    }
}
