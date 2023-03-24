/**
 * This class extends AthleteFormV13 and adds save and open functionality to the form.
 * 
 * @author Nutsaba Chaiyadet
 * ID: 653040134-6
 * Sec: 1
 * @version March,24 2023
 */
package chaiyadet.nutsaba.lab11;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import chaiyadet.nutsaba.lab10.AthleteFormV13;

public class AthleteFormV14 extends AthleteFormV13 {
    JFileChooser fc;
    protected String check1;
    protected String[] hobbylist;
    protected String checkhobby;
    protected String checkhobbies;
    public AthleteFormV14(String title) {
        super(title);
    }
    /**
     * This method creates a string of the selected hobbies and splits it into an array. 
     */
    public void hobbbiescheckbox1() {
        hobbiesText = "";
        JCheckBox [] hobbiescheck = {readingCheckBox, gardeningCheckBox, watchingmovivesCheckBox, shoppingCheckBox, othersCheckBox};
        for (int i = 0 ; i < hobbiescheck.length; i++){
            if (hobbiescheck[i].isSelected()){
                hobbiesText += hobbiescheck[i].getActionCommand() + ", ";
            } 
        }
        hobbylist = hobbiesText.split(", ");
        checkhobby = String.join(", ",hobbylist);
    }
    /**
     * This method handles the action events of the save and open menu items.
     * @param event the event that triggered this method.
     */
    public void actionPerformed(ActionEvent event) {
        Object clickObject = event.getSource();
        if (clickObject == saveMI) {

            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try {
                    hobbbiescheckbox1();
                    PrintWriter printWrite = new PrintWriter(file);
                    printWrite.println(nameTxtField.getText() + "\n" + hobbiesText);
                    printWrite.close();
                    JOptionPane.showMessageDialog(this, " Saving " + file.getName() + " in file" + file);
                } catch (IOException ex) {
                    System.err.println("Error in writing file");
                    ex.printStackTrace(System.err);
                }
            }
        } else if (clickObject == openMI) {
            int returnVal = fc.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try {
                    FileReader filereader = new FileReader(file);
                    BufferedReader reader = new BufferedReader(filereader);
                    String line1 = reader.readLine();
                    String line2 = reader.readLine();
                    if (line2.contains(",")) {
                        checkhobbies = line2.substring(0, line2.length()-2);
                        if (checkhobbies.contains(",")) {
                            check1 = " has hobbies as ";
                        } else {
                            check1 = " has a hobby as ";
                        }
                        bioTextArea.setText(line1 + check1 + checkhobbies + "\n");
                    } else {
                        check1 = " does not have any hobby ";
                        bioTextArea.setText(line1 + check1 + line2 + "\n");
                    }
                    reader.close();
                    filereader.close();
                   
                } catch (IOException ex) {
                    System.err.println("Error in reading file");
                    ex.printStackTrace(System.err);
                }
            }
        } else {
            super.actionPerformed(event);
        }
    }

    public void addComponents() {
        super.addComponents();
        fc = new JFileChooser();
    }
    public void addListeners() {
        super.addListeners();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI() {
        AthleteFormV14 msw = new AthleteFormV14("Athlete Form V14");
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
