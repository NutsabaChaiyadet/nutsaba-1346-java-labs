/**
 * This program is to show slider settings window.  When scrolling to that value and when selecting a sport,
 * it displays a window that shows what kind of sport is selected.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version March,10 2023
 */
package chaiyadet.nutsaba.lab9;

import javax.swing.*;
import javax.swing.event.*;

public class AthleteFormV10 extends AthleteFormV9 implements ChangeListener,ListSelectionListener{
    protected String sport1 = " ";
    public AthleteFormV10(String title) {
        super(title);
    }
    //Set the value of the slider to be in the display window.
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {
            int slider1 = source.getValue();
            JOptionPane.showMessageDialog(AthleteFormV10.this, " # of experience years is  " + slider1);
        }
    }
    public void addListeners(){
        super.addListeners();
        slider1.addChangeListener(this);
        ListSelectionModel addliListSelectionModel = sport.getSelectionModel();
        addliListSelectionModel.addListSelectionListener(this);
        addliListSelectionModel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
    //Multiple sports selection settings to choose from
    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel selectsport = (ListSelectionModel)e.getSource();
        if (!e.getValueIsAdjusting()){
            for (int i = 0; i < sportStrings.length; i++) {
                if (selectsport.isSelectedIndex(i)){
                    sport1 += sportStrings[i] + " ";
                } 
            }
            JOptionPane.showMessageDialog(this,"Selected sports are " + sport1);
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
        AthleteFormV10 msw = 
            new AthleteFormV10("Athlete Form V10");
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
