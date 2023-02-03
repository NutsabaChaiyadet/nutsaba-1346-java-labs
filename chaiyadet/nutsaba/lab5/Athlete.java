/**
 * This program is used to collect name, weight, height, nationality, date of birth of athletes. 
 *  to be displayed in the main worldAthlete
 * 
 *@author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version january 20, 2023
 */
package chaiyadet.nutsaba.lab5;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

/**
 * Configuration name, weight, height, nationality, date of birth of athletes. 
 */
public class Athlete {
    protected String name;
    protected double weight;
    protected double height;
    protected String nationality;
    protected LocalDate birthdate;
    public Gender gender;
    public enum Gender{MALE ,FEMALE};


    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = LocalDate.parse(birthdate, formatter);
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public DateTimeFormatter getFormatter() {
        return this.formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Athlete(String name,double weight,double height,Gender gender,String nationality,String birthdate){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.nationality = nationality;
        this.birthdate = LocalDate.parse(birthdate, formatter);
        this.gender = gender;
    }
    public void compareAge(Athlete athlete){
        int year = (int) ChronoUnit.YEARS.between(this.getBirthdate(), athlete.getBirthdate());

        if(year > 0){
            System.out.println(name + " " + year + " older than " + name);
        }else if(year < 0){
            System.out.println(name + " is " + year * -1 + " years younger than " + name);
        }else{
            System.out.println(name + " is " + " not taler than  " + name);
        }
    }
    
public String toString(){
    return "Athlete " + "[" + name + ", " + weight + "kg" + ", " + height + "m" + ", " + gender + ", " + nationality + ", " + birthdate + "]";
}
}