/**
 * This program is to check that  information of weight  or the height is correct or not 
 *  is prohibited as letters  weight must be 0,200  and height must be in the range of 0,300  Must be an integer only
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version March,17 2023
 */
package chaiyadet.nutsaba.lab10;

import javax.swing.*;
import java.awt.event.*;

public class AthleteFormV13 extends AthleteFormV12{
    private static final Double MAX_WEIGHT = 200.0;
    private static final Double MAX_HEIGHT = 300.0;
    public AthleteFormV13(String title) {
        super(title);
    }
    // //Creating a condition if clicking a menu item displays a method.
    public void actionPerformed(ActionEvent event) {
        Object clickObject = event.getSource();
        if (clickObject == weightTxtField && getValidNumber(weightTxtField, "Weight", MAX_WEIGHT ) == -1) {
            
        } else if (clickObject == heightTxtField &&  getValidNumber(heightTxtField, "Height", MAX_HEIGHT)== -1) {
            
        } else {
            super.actionPerformed(event);
        }
    }
    //Creating a condition when pressing add items
    protected void addAthlete() {
        getValues();
        weight = getValidNumber(weightTxtField, "Weight", MAX_WEIGHT);
        if (weight == -1)
            return;
        height = getValidNumber(heightTxtField, "Height", MAX_HEIGHT);
        if (height == -1)
            return;
        else {
            super.addAthlete();
        }
    }
    //Creating conditions for input data
    private double getValidNumber(JTextField numberTxt, String name, Double maxWeight) {
        try {
            double weightInput = Double.parseDouble(numberTxt.getText());
            if (weightInput > MAX_WEIGHT) {
                JOptionPane.showMessageDialog(this, name + " should be less than " + maxWeight);
                return -1;
            } else if (weightInput < 0) {
                JOptionPane.showMessageDialog(this, name + " should be greater than 0 " );
                return -1;
            } else {
                return weightInput;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Plese enter a valid number for " + name);
            return -1;
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI() {
        AthleteFormV13 msw = new AthleteFormV13("Athlete Form V13");
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
