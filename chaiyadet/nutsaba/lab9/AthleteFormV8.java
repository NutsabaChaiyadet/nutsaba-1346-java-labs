/**
 * This application is to provide a button.  can continue to display  is the submit button 
 *  Click and give up all the information in the bio.  The Cancel button removes all data from the textbox.
 *   and the reset button is  Remove all data including colors in the textbox.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version March,10 2023
 */
package chaiyadet.nutsaba.lab9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import chaiyadet.nutsaba.lab8.AthleteFormV6;

public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {
    String resultText;
    String hobbiesText = " ";
    protected String clickGender;

    public AthleteFormV8(String title) {
        super(title);
    }
    //Creating what to click  To display the results as set by that button.
    public void actionPerformed(ActionEvent event){
        Object srcObject = event.getSource();
        if (srcObject == submitButton) {
            handleSubmitButton();
        } else if (srcObject == cancelButton) {
            handleCancelButton();
        } else if (srcObject == resetButton) {
            handleResetButton();
        }
    }
    //Assigning data to a form.
    public void initValues() {
        nameTxtField.setText("Manee");
        weightTxtField.setText("50");
        heightTxtField.setText("170");
        dateTxtField.setText("01/01/2000");
        femaleButton.setSelected(true);
        slider1.setValue(10);

        nameTxtField.setBackground(Color.PINK);
        weightTxtField.setBackground(Color.PINK);
        heightTxtField.setBackground(Color.PINK);
        dateTxtField.setBackground(Color.PINK);
    }
    //Reading the value of the button to display.
    public void addListeners() {
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);
        resetButton.addActionListener(this);
    }
    //Retrieving the results of the submit button.
    private void handleSubmitButton() {
        getValues();
        bioTextArea.setText(resultText);
    }
    //setting hobbycheckbox to get value
    public String hobbbiescheckbox() {
        JCheckBox [] hobbiescheck = {readingCheckBox, gardeningCheckBox, watchingmovivesCheckBox, shoppingCheckBox, othersCheckBox};
        for (int i = 0 ; i < hobbiescheck.length; i++){
            if (hobbiescheck[i].isSelected()){
                hobbiesText += hobbiescheck[i].getActionCommand() + " ";
            } 
        }
        return hobbiesText;
    }
    //hobbycheckbox settings  to cancel the selection.
    public String hobbbiescheckbox2() {
        JCheckBox [] hobbiescheck = {readingCheckBox, gardeningCheckBox, watchingmovivesCheckBox, shoppingCheckBox, othersCheckBox};
        for (int i = 0 ; i < hobbiescheck.length; i++){
            if (hobbiescheck[i].isSelected()){
                hobbiescheck[i].setSelected(false);
            } 
        }
        return hobbiesText;
    }
    //setting information in the cancel button
    private void handleCancelButton() {
        Color mycolor = new Color(167,59,36);
        nameTxtField.setBackground(mycolor);
        weightTxtField.setBackground(mycolor);
        heightTxtField.setBackground(mycolor);
        dateTxtField.setBackground(mycolor);

        nameTxtField.setText(null);
        weightTxtField.setText(null);
        heightTxtField.setText(null);
        dateTxtField.setText(null);

        bioTextArea.setText("");

        groupButton.clearSelection();
        
        slider1.setValue(0);
    }
    //setting information in the cancel button
    private void handleResetButton() {
        nameTxtField.setBackground(Color.WHITE);
        weightTxtField.setBackground(Color.WHITE);
        heightTxtField.setBackground(Color.WHITE);
        dateTxtField.setBackground(Color.WHITE);

        nameTxtField.setText(null);
        weightTxtField.setText(null);
        heightTxtField.setText(null);
        dateTxtField.setText(null);

        nationalityComboBox.setSelectedItem(null);
        nationalityComboBox.setEditable(true);

        bioTextArea.setText("");

        groupButton.clearSelection();
        sport.clearSelection();
        slider1.setValue(0);
        hobbbiescheckbox2();
    }
    //If female is selected display female, if male is selected display male.
    public String gender() {
        if (femaleButton.isSelected()){
            clickGender = femaleButton.getActionCommand();
        }else if (maleButton.isSelected()){
            clickGender = maleButton.getActionCommand();
        } 
        return clickGender;
    }
    //Giving the impression that something
    public void getValues() {
        resultText = ("Name:" + nameTxtField.getText() + "\nWeight:" + weightTxtField.getText() + "\nHeight:" + heightTxtField.getText()
        + "\nDate of birth:" + dateTxtField.getText() + " \nGender:" + gender() + "\nHobbies:" + hobbbiescheckbox()
        + "\nNationality:" + nationalityComboBox.getSelectedItem() + "\nSport: "+ sport.getSelectedValuesList() + "\nExperience years:" + slider1.getValue());
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
            createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFormV8 msw = 
            new AthleteFormV8("Athlete Form V8");
        msw.addComponents();
        msw.initValues();
        msw.setFrameFeatures();
        msw.addMenus();
        msw.addListeners();
    }
    public void setFrameFeatures(){
        super.setFrameFeatures();
    }
}
