 /**
 * This program is a football competition.of each year which extends from competition
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,3 2023
 */
package chaiyadet.nutsaba.lab6;

import java.util.ArrayList;
//Creating variables for the teams to compete
public class AFFChampionship extends Competition{
    protected String teamA;
    protected String teamB;

    public String getTeamA() {
       return teamA;
    }
    public void setTeamA(String teamA) {
       this.teamA = teamA;
    }
    public String getTeamB() {
       return teamB;
    }
    public void setTeamB(String teamB) {
       this.teamB = teamB;
    }
    public AFFChampionship(String region,String name,String teamA,String teamB){
       this.teamA = teamA;
       this.teamB = teamB;
       this.name = name;
       this.region = region;
    }
    public AFFChampionship(String name,String teamA,String teamB){
        this.name = name;
        this.teamA = teamA;
        this.teamB =teamB;
    }
    //return data to print
    public String toString(){
        return(name + " in the final round was the game between " + teamA + " vs " + teamB);
    }
    @Override
    void setDescription() {
        
    }

    @Override
    void setSponsorship(ArrayList<String> sponsors) {
        if(sponsors.size() > 1){ //If more than one sponsor, print the line below.
            System.out.println("Sponsors of " + name + " are " + sponsors);
        } else { // not to print sponsor index0  and followed by the text on the line below
            System.out.println(sponsors.get(0) + " is a sponsor of " + name );
        }
    }
    public void setPlaces(ArrayList<String> place){ //Printing names and places to play
        System.out.println(name + " plays at these stadiums");
        System.out.println(place);
    }
    
}