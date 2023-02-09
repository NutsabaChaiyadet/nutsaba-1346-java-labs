/**
 * This program is a window display program Athlete form has a JLabel 
 * name, weight, height, birth date and gender to enter data as a textfield 
 * on the right side and a button like program mysimplewindow.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,9 2023
 */
package chaiyadet.nutsaba.lab7;

import java.awt.*;

import javax.swing.*;

public class AthleteForm extends MySimpleWindow{
    //variable declaration
    protected JTextField nameTxtField, weightTxtField, heightTxtField, dateTxtField;
    protected JLabel nameLabel, weightLabel, heightLabel, dateLabel, genderJLabel;
    protected JPanel namePanel, buttons;
    protected JPanel weightPanel, buttonweight;
    protected JPanel heightPanel, buttonheight;
    protected JPanel datePanel, buttondate;
    protected JPanel genderJPanel , buttongender,keepMainPanel;
    protected JRadioButton maleButton, femaleButton;
    protected ButtonGroup groupButton;

    public AthleteForm(String string) {
        super(string);
    }
    
    public void addComponents(){
        super.addComponents();

        nameTxtField = new JTextField(15);
        weightTxtField = new JTextField(15);
        heightTxtField = new JTextField(15);
        dateTxtField = new JTextField(15);
        
        //Defines the display name of the JLabel.
        groupButton = new ButtonGroup();
        nameLabel = new JLabel("Name :");
        weightLabel = new JLabel("Weight :");
        heightLabel = new JLabel("Height :");
        dateLabel = new JLabel("Date of birth(dd-mm-yyyy) :");
        genderJLabel = new JLabel("Gender :");

        genderJPanel = new JPanel();
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");

        //Combining the make and female buttons together
        keepMainPanel=new JPanel(new GridLayout(5,2));
        groupButton.add(maleButton);
        groupButton.add(femaleButton);
        genderJPanel.add(maleButton);
        genderJPanel.add(femaleButton);

        keepMainPanel.add(nameLabel);
        keepMainPanel.add(nameTxtField);
        keepMainPanel.add(weightLabel);
        keepMainPanel.add(weightTxtField);
        keepMainPanel.add(heightLabel);
        keepMainPanel.add(heightTxtField);
        keepMainPanel.add(dateLabel);
        keepMainPanel.add(dateTxtField);
        keepMainPanel.add(genderJLabel);
        keepMainPanel.add(genderJPanel);


        mainPanel.add(keepMainPanel, BorderLayout.NORTH);
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
        AthleteForm msw = 
            new AthleteForm("Athlete Form");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    public void setFrameFeatures(){
        super.setFrameFeatures();
    }
}
