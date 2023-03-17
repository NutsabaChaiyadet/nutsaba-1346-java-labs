/**
 * This program is to create a Data menu.  then press menu items,
 *  click add input  Click display to show all information. 
 *  Click clear to clear the information in the display.
 *   Click searh to search for added data. 
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version March,17 2023
 */
package chaiyadet.nutsaba.lab10;

import chaiyadet.nutsaba.lab9.AthleteFormV10;
import chaiyadet.nutsaba.lab6.AthleteV2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import chaiyadet.nutsaba.lab5.Athlete.Gender;

public class AthleteFormV11 extends AthleteFormV10{
    protected JMenu dataMenu,sortMenu;
    protected JMenuItem addMI,displayMI,clearMI,searchMI,bynameMI,byheight,byheightandweight;
    protected  ArrayList<AthleteV2> athleteArrayList = new ArrayList<AthleteV2>();
    protected String name;
    protected double weight;
    protected double height; 
    Gender gender;
    protected String nationality;
    protected String birthdate;

    public AthleteFormV11(String title) {
        super(title);
    }
    //create data menu  And there is a menu item that is add display clear search sort byname by height and by height weight.
    public void addMenus(){
        super.addMenus();
        dataMenu = new JMenu("Data");
        sortMenu = new JMenu("Sort");
        addMI = new JMenuItem("Add");
        displayMI = new JMenuItem("Display");
        clearMI = new JMenuItem("Clear");
        searchMI = new JMenuItem("Search");
        bynameMI = new JMenuItem("By Name");
        byheight = new JMenuItem("By Height");
        byheightandweight = new JMenuItem("By Height and Weight");
        
        sortMenu.add(bynameMI);
        sortMenu.add(byheight);
        sortMenu.add(byheightandweight);
        dataMenu.add(addMI);
        dataMenu.add(displayMI);
        dataMenu.add(clearMI);
        dataMenu.add(searchMI);
        dataMenu.add(sortMenu);
        menuBar.add(dataMenu);

        this.setJMenuBar(menuBar);

        dataMenu.setFont(new Font("SanSerif",Font.BOLD,14));
        sortMenu.setFont(new Font("SanSerif",Font.BOLD,14));
        addMI.setFont(new Font("SanSerif",Font.BOLD,14));
        displayMI.setFont(new Font("SanSerif",Font.BOLD,14));
        clearMI.setFont(new Font("SanSerif",Font.BOLD,14));
        searchMI.setFont(new Font("SanSerif",Font.BOLD,14));
        bynameMI.setFont(new Font("SanSerif",Font.BOLD,14));
        byheight.setFont(new Font("SanSerif",Font.BOLD,14));
        byheightandweight.setFont(new Font("SanSerif",Font.BOLD,14));

        addMI.setForeground(new Color(6,57,112));
        displayMI.setForeground(new Color(6,57,112));
        clearMI.setForeground(new Color(6,57,112));
        searchMI.setForeground(new Color(6,57,112));
        sortMenu.setForeground(new Color(6,57,112));
        bynameMI.setForeground(new Color(6,57,112));
        byheight.setForeground(new Color(6,57,112));
        byheightandweight.setForeground(new Color(6,57,112));
    }
    //is creating conditions  If you click on any menu items, it will display the results according to those methods.
    @Override
    public void actionPerformed(ActionEvent event) {
        Object clickObject = event.getSource();
        if (clickObject == addMI){
            addAthlete();
        } else if (clickObject == displayMI) {
            displayAthlete();
        } else if (clickObject == clearMI){
            clearAthlete();
        } else if (clickObject == searchMI) {
            sarchAthlete();
        } else {
            super.actionPerformed(event);
        }
    }
    //Adding to display when an item is clicked
    public void addListeners() {
        super.addListeners();
        addMI.addActionListener(this);
        displayMI.addActionListener(this);
        clearMI.addActionListener(this);
        searchMI.addActionListener(this);
    }
    //menu items add to add information provided by the user  Save it to the storage.
    protected void addAthlete() {
        name = nameTxtField.getText();
        weight = Double.parseDouble(weightTxtField.getText());
        height = Double.parseDouble(heightTxtField.getText());
        nationality = nationalityComboBox.getSelectedItem().toString();
        birthdate = dateTxtField.getText();
        if (femaleButton.isSelected()){
            gender = Gender.FEMALE;
        }else if (maleButton.isSelected()){
            gender = Gender.MALE;
        } 
        AthleteV2 athleteV2 = new AthleteV2(name, weight, height, gender, nationality, birthdate);
        athleteArrayList.add(athleteV2);
        JOptionPane.showMessageDialog(this, athleteV2);
    }
    //to display the added information
    public void displayAthlete() {
        String adddisplay = "";
        for(int i = 0; i < athleteArrayList.size(); i++){
            adddisplay += "\n"+(i+1) + ". " + athleteArrayList.get(i).toString() ;
        }if (athleteArrayList.size() == 0) {
            JOptionPane.showMessageDialog(this, "There is no athlete in the list" );
        }else if (athleteArrayList.size() == 1) {
            JOptionPane.showMessageDialog(this, "There is one athletes as follows:" + adddisplay );
        }else {
        JOptionPane.showMessageDialog(this, "There are " + athleteArrayList.size() + " athletes as follows:" + adddisplay );
        }
    }
    //Clear all added data
    public void clearAthlete() {
        athleteArrayList.removeAll(athleteArrayList);
    }
    //showInput and enter to search for names that have been added.
    public void sarchAthlete() {
        String sarch = JOptionPane.showInputDialog("Please enter athlete name:");
        int searchName = 0;
        for(int i = 0; i < athleteArrayList.size(); i++){
            if (sarch.equals(athleteArrayList.get(i).getName())) {
                JOptionPane.showMessageDialog(this,athleteArrayList.get(i).toString());
                searchName = 1;
            }
         }
        if (searchName == 0) {
                JOptionPane.showMessageDialog(this, "Athlete " + sarch + " is NOT found");
            }
        }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFormV11 msw = 
            new AthleteFormV11("Athlete Form V11");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
    }
    public void setFrameFeatures(){
        super.setFrameFeatures();
    }
}
