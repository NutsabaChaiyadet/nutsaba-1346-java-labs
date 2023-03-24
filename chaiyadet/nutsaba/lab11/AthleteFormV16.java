/**
* Implement the program called AthleteFormV16  which extends from AthleteFormV15.
* In this problem, when the user chooses menu Save, the program not only saves hobbies 
* in the first text file and experience years in the second binary file, but also the
* object athlete in the Java type AthleteV2 in the third binary file. 
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
import chaiyadet.nutsaba.lab5.Athlete.Gender;
import chaiyadet.nutsaba.lab6.AthleteV2;
/**
 * Constructor for AthleteFormV16.
 * @param title the title of the JFrame.
 */
public class AthleteFormV16 extends AthleteFormV15{
    String strobject;
    public AthleteFormV16(String title) {
        super(title);
    }
/**
 * Overrides actionPerformed in AthleteFormV15 to add the functionality of saving
 * AthleteV2 objects to a file using serialization and opening a file to display the
 * contents of the saved AthleteV2 object.
 * @param event the ActionEvent object that represents the event triggered by the user.
 */
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object clickObject = event.getSource();
        if (clickObject == saveMI) {
            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try {
                    FileOutputStream fileOutput = new FileOutputStream(file);
                    ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
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
                    System.out.println(athleteV2);
                    JOptionPane.showMessageDialog(this, athleteV2.toString());
                    JOptionPane.showMessageDialog(this, " Saving " + file.getName() + " in file" + file);
                    objectOutput.writeObject(athleteV2.toString());
                    objectOutput.close();
                    fileOutput.close();
                } catch (IOException ex) {
                    System.err.println("Error in writing file");
                    ex.printStackTrace(System.err);
                }
            }
        } else if (clickObject == openMI) {
            fc = new JFileChooser();

            int returnVal = fc.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try {
                    FileInputStream fileInput = new FileInputStream(file);
                    ObjectInputStream ObjectInput1 = new ObjectInputStream(fileInput);
                    Object objecString = ObjectInput1.readObject();
                    bioTextArea.append(objecString.toString() );
                    fileInput.close();
                    ObjectInput1.close();
                
                } catch (IOException ex) {
                    System.err.println("Error in reading file");
                    ex.printStackTrace(System.err);
                } catch (ClassNotFoundException exc) {
                    exc.printStackTrace(System.err);
                }
            }
        } else {
            super.actionPerformed(event);
        }
    }
    /**
    * Main method to create and show the AthleteFormV16 JFrame.
    * @param args command line arguments.
    */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    /**
    * Creates and shows the AthleteFormV16 JFrame.
    */
    public static void createAndShowGUI() {
        AthleteFormV16 msw = new AthleteFormV16("Athlete Form V16");
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
