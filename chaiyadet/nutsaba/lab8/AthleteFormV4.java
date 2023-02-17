/**
 * This program is extens from AthleteV3, added is hopbies to tick and year of experience 
 * in this sport to be slider to scroll.
 * 
 *  @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,17 2023
 */
package chaiyadet.nutsaba.lab8;

import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;

import chaiyadet.nutsaba.lab7.AthleteFormV3;

public class AthleteFormV4 extends AthleteFormV3 {
    protected JPanel hobbiesPanel,sliderPanel ,groupPanel1, groupPanel2,hobbiPanel1;
    protected JLabel hobbiesLabel, sliderLabel;
    protected JCheckBox readingCheckBox, gardeningCheckBox, watchingmovivesCheckBox, shoppingCheckBox, othersCheckBox;
    protected JSlider slider1;

    public AthleteFormV4(String title) {
        super(title);
    }
    
    public void addComponents(){
        super.addComponents();
        //Declaring variables in hobbies
        hobbiesPanel = new JPanel();
        hobbiesLabel = new JLabel("Hobbies:");
        readingCheckBox = new JCheckBox("Reading");
        gardeningCheckBox = new JCheckBox("Gardening");
        watchingmovivesCheckBox = new JCheckBox("Watching movies",true);
        shoppingCheckBox = new JCheckBox("shopping");
        othersCheckBox = new JCheckBox("Others");

        //Slider variable declaration
        sliderLabel = new JLabel("Year of experience in this sport:");
        slider1 = new JSlider(0,20,0);
        slider1.setMajorTickSpacing(5);
        slider1.setMinorTickSpacing(1);
        slider1.setPaintTicks(true);
        slider1.setLabelTable(slider1.createStandardLabels(5));
        slider1.setPaintLabels(true);

        //Adding options to hobbies
        hobbiesPanel.add(hobbiesLabel);
        hobbiesPanel.add(readingCheckBox);
        hobbiesPanel.add(gardeningCheckBox);
        hobbiesPanel.add(watchingmovivesCheckBox);
        hobbiesPanel.add(shoppingCheckBox);
        hobbiesPanel.add(othersCheckBox);

        //remove mainPanel
        mainPanel.removeAll();

        //Define the panel of hobbiesPanel1.
        hobbiPanel1 = new JPanel(new BorderLayout());
        hobbiPanel1.add(hobbiesLabel, BorderLayout.NORTH);//add hoppies label  in hobbiesPanel1 is north.
        hobbiPanel1.add(hobbiesPanel, BorderLayout.SOUTH);//add hoppiespanel  In hobbiesPanel1 is south.

        sliderPanel = new JPanel(new BorderLayout());
        sliderPanel.add(sliderLabel, BorderLayout.NORTH);
        sliderPanel.add(slider1, BorderLayout.SOUTH);

        groupPanel1 = new JPanel(new BorderLayout());
        groupPanel1.add(keepMainPanel, BorderLayout.NORTH);
        groupPanel1.add(hobbiPanel1, BorderLayout.SOUTH);

        groupPanel2 = new JPanel(new BorderLayout());
        groupPanel2.add(groupPanel, BorderLayout.NORTH);
        groupPanel2.add(sliderPanel, BorderLayout.SOUTH);

        mainPanel.add(groupPanel1, BorderLayout.NORTH);
        mainPanel.add(groupPanel2, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFormV4 msw = 
            new AthleteFormV4("Athlete Form V4");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
    }
    public void setFrameFeatures(){
        super.setFrameFeatures();
    }
}
