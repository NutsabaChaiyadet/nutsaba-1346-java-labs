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

public class WorldAthleteV4 {
    public static void main(String[] args) {
        BadmintonPlayerV3 akane =
            new BadmintonPlayerV3("Akane Yamaguchi",  55,1.68,Athlete.Gender.FEMALE,"Japan","05/02/1997", 0, 0, 0);
        BadmintonPlayerV3 ratchanok =
            new BadmintonPlayerV3("Ratchanok Intanon",  55,1.68,Athlete.Gender.FEMALE,"Thai","05/02/1995", 0, 0, 0);
        akane.setWorldRanking(1);
        ratchanok.setWorldRanking(6);
        akane.setSpeed(4);
        ratchanok.setSpeed(6);
        ArrayList<BadmintonPlayerV3> badmintonPlayers = new ArrayList<BadmintonPlayerV3>();
        badmintonPlayers.add(akane);
        badmintonPlayers.add(ratchanok);
        for (BadmintonPlayerV3 BadmintonPlayer : badmintonPlayers){
            System.out.println(BadmintonPlayer);
        }
    }
}