/**
 * This program is a competition.  with race title and region and sponsor
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,3 2023
 */
package chaiyadet.nutsaba.lab6;

import java.util.ArrayList;

abstract class Competition {
    protected String name;
    protected String region;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    abstract void setDescription();
    abstract void setSponsorship(ArrayList<String> sponsors);
}
