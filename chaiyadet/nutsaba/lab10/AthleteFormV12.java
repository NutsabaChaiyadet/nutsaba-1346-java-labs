/**
 * This program is  Click sort byname to sort name, 
 * byheight to sort height ascending. Click by weight by height to sort height. 
 * and if the weights are equal,
 * the weights will be sorted from least to greatest
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version March,17 2023
 */
package chaiyadet.nutsaba.lab10;

import java.awt.event.*;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.*;
import chaiyadet.nutsaba.lab6.AthleteV2;

public class AthleteFormV12 extends AthleteFormV11 {

    public AthleteFormV12(String title) {
        super(title);
    }
    //The alphabetical order of the name from the first
    class NameComparator implements Comparator<AthleteV2> {
        @Override
        public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
            if (athlete1.getName().compareToIgnoreCase(athlete2.getName()) < 0) {
                return -1;
            } else if (athlete1.getName().compareToIgnoreCase(athlete2.getName()) == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }
    //Sorting the height from the smallest
    class HeightComparator implements Comparator<AthleteV2> {
        @Override
        public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
            if (athlete1.getHeight() < athlete2.getHeight()) {
                return -1;
            } else if (athlete1.getHeight() == athlete2.getHeight()) {
                return 0;
            } else {
                return 1;
            }
        }
    }
    //sorting height and weight  ascending if the height is the same  Let's sort the weight information.
    class HeightWeightComparator implements Comparator<AthleteV2> {
        @Override
        public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
            if (athlete1.getHeight() < athlete2.getHeight()) {
                return -1;
            } else if (athlete1.getWeight() == athlete2.getWeight()) {
                if (athlete1.getWeight() < athlete2.getWeight()) {
                    return -1;
                } else if (athlete1.getWeight() == athlete2.getWeight()) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }
    }
    //Creating a condition if clicking a menu item displays a method.
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object clickObject = event.getSource();
        if (clickObject == bynameMI) {
            Collections.sort(athleteArrayList, new NameComparator());
            displayAthlete();
        } else if (clickObject == byheight) {
            Collections.sort(athleteArrayList, new HeightComparator());
            displayAthlete();
        } else if (clickObject == byheightandweight) {
            Collections.sort(athleteArrayList, new HeightWeightComparator());
            displayAthlete();
        }
    }
    //Add it so that when you click it, you can read it.
    public void addListeners() {
        super.addListeners();
        bynameMI.addActionListener(this);
        byheight.addActionListener(this);
        byheightandweight.addActionListener(this);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI() {
        AthleteFormV12 msw = new AthleteFormV12("Athlete Form V12");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
    }
    public void setFrameFeatures() {
        super.setFrameFeatures();
    }
}
