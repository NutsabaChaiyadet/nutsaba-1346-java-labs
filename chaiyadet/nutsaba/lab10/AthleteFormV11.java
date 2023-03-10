package chaiyadet.nutsaba.lab10;

import chaiyadet.nutsaba.lab9.AthleteFormV8;
import chaiyadet.nutsaba.lab7.AthleteFormV2;
import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import chaiyadet.nutsaba.lab5.Athlete.Gender;

public class AthleteFormV11 extends AthleteFormV8{
    protected JMenu dataMenu,sortMenu;
    protected JMenuItem addMI,displayMI,clearMI,searchMI,bynameMI,byheight,byheightandweight;
    protected  ArrayList<Athlete> athleteArrayList = new ArrayList<>();

    public AthleteFormV11(String title) {
        super(title);
    }
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
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object clickObject = event.getSource();
        if (clickObject == addMI){
            addAthlete();
        } else {
            super.actionPerformed(event);
        }
    }
    public void addListeners() {
        super.addListeners();
        addMI.addActionListener(this);
    }
    public void addAthlete() {
        toString();
    }
    public String toString() {
        return nameTxtField.getText() + " " + weightTxtField.getText() + " " + heightTxtField.getText() + " "
         + groupButton.getSelection() + " " + nationalityComboBox.getSelectedItem  () + " " + dateTxtField;
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
