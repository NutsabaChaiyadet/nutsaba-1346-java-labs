/**
 * This program is to extend from Athlete.  What's added is nationality, sports and bio.
 * 
 * 
 */
package chaiyadet.nutsaba.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV2 extends AthleteForm {
    protected JPanel nationalityPanel, sportPanel, bioPanel,groupPanel;
    protected JLabel nationalityLabel, sportLabel, bioLabel;
    protected JComboBox<String> nationalityComboBox;
    protected JList<String> sport;
    protected String[] nationalityStrings = {"American","Chinese","Indonesian","Japanese","Thai","Vietnamese"};
    protected String[] sportStrings = {"Badminton","Boxing","Football","Running"};
    protected JTextArea bioTextArea;
    protected JScrollPane biScrollPane;


    public AthleteFormV2(String string) {
        super(string);
    }
    public void addComponents(){
        super.addComponents();
        //Label variable declaration
        nationalityLabel = new JLabel("Nationality :");
        sportLabel = new JLabel("Sport");
        bioLabel = new JLabel("Bio");

        nationalityComboBox = new JComboBox<String>(nationalityStrings);
        sport = new JList<String>(sportStrings);
        
        //Let the nationality have items: Americans, Chinese, Indonesians, Vietnamese, Japanese and Thais.
        nationalityComboBox.addItem("American");
        nationalityComboBox.addItem("Chinese");
        nationalityComboBox.addItem("Indonesian");
        nationalityComboBox.addItem("Japanese");
        nationalityComboBox.addItem("Thai");
        nationalityComboBox.addItem("Vietnames");
        nationalityComboBox.setSelectedItem("Thai");
        nationalityComboBox.setEditable(true);

        //bio to fill text area
        bioTextArea = new JTextArea(4,2);
        bioTextArea.setLineWrap(true);
        bioTextArea.setWrapStyleWord(true);
        biScrollPane = new JScrollPane(bioTextArea);
        
        
        nationalityPanel = new JPanel(new GridLayout(1,2));
        nationalityPanel.add(nationalityLabel);
        nationalityPanel.add(nationalityComboBox);

        sportPanel = new JPanel(new GridLayout(1,2));
        sportPanel.add(sportLabel);
        sportPanel.add(sport);
        sport.setSelectedIndex(2);//Set the option of sport to index 2.

        bioPanel = new JPanel(new GridLayout(2,1));
        bioPanel.add(bioLabel);
        bioPanel.add(biScrollPane);

        groupPanel = new JPanel(new BorderLayout());
        groupPanel.add(nationalityPanel, BorderLayout.NORTH);//set the nationality panel to the north.
        groupPanel.add(sportPanel, BorderLayout.CENTER);//set sport panel to the center.
        groupPanel.add(bioPanel, BorderLayout.SOUTH);//set bio panel to the south.

        mainPanel.add(groupPanel, BorderLayout.CENTER);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFormV2 msw = 
            new AthleteFormV2("Athlete Form V2");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    public void setFrameFeatures(){
        super.setFrameFeatures();
    }

}
