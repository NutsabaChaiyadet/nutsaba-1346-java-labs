
/**
 * This Footballer program is to accept three arguments: footballer name, the 
*  the nationality of the footballer, and the football club that the footballer plays.
*  Its output format is 
*  “My Favorite football player  is <athlete_name>.  
*  His nationality as <athlete_nationality>
*  He plays for <his football club>” 
*
* Author: Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* Date: December 9, 2022
*
**/


package chaiyadet.nutsaba.lab2;

public class Footballer {
    public static void main(String[] args) {
        if (args.length == 3){
            String name = args[0];
            String nationality = args[1];
            String football_club = args[2];
            System.out.println("My favorite football player is "+name);
            System.out.println("His nationality as "+nationality);
            System.out.println("He play for "+football_club);
        }
        else {
            System.out.println("Usage. Footballer <football name> <nationality> <club name>");
        }        
    }
}