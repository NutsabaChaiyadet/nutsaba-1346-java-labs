/**
 * Implement the program called AthleteFormV15  which extends from AthleteFormV14.
 * In this problem, when the user chooses menu Save,  the program not only saves hobbies
 * but also saves the number of experience years in another binary file.  Then when the user chooses menu Open, 
 * the program not only reads hobbies from the text file but also reads another binary file and 
 * displays both the hobbies and the experience years in the text area.
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
/**
 * AthleteFormV15 class is a subclass of AthleteFormV14 that adds functionality for saving and opening files.
 */
public class AthleteFormV15 extends AthleteFormV14{
    /**
     * check3 stores a string for later use in displaying the number of years of experience.
     */
    protected String check3;
    /**
     * Constructor for AthleteFormV15. Calls the constructor of AthleteFormV14 and passes a title for the frame.
     * @param title The title to display in the frame.
     */
    public AthleteFormV15(String title) {
        super(title);
    }
    /**
     * Overrides the actionPerformed method in AthleteFormV14 to add functionality for saving and opening files.
     * @param event The event that occurred.
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
                    DataOutputStream dataOutput1 = new DataOutputStream(fileOutput);
                    dataOutput1.writeUTF(nameTxtField.getText());
                    dataOutput1.writeInt(slider1.getValue());
                    dataOutput1.close();
                    fileOutput.close();
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
                    FileInputStream fileInput = new FileInputStream(file);
                    DataInputStream dataInput1 = new DataInputStream(fileInput);
                    String line = dataInput1.readUTF();
                    int yearSlider1 = dataInput1.readInt();
                    
                    fileInput.close();
                    dataInput1.close();
                    bioTextArea.append(line + " has " + yearSlider1 + check2() + "of experiences" + "\n");
                } catch (IOException ex) {
                    System.err.println("Error in reading file");
                    ex.printStackTrace(System.err);
                }
            }
        } else {
            super.actionPerformed(event);
        }
    }
    /**
     * check2 checks the value of slider1 and returns a string to display the correct number of years of experience.
     * @return A string with "year" or "years" depending on the value of slider1.
     */
    protected String check2() {
         // Code for checking slider1 value and returning "year" or "years"... 
        if (slider1.getValue() <= 1) {
            check3 = " year ";
            return check3;
        } else  {
            check3 = " years ";
            return check3;
        }
    }
    /**
     * The main method for running the program. Creates a new AthleteFormV15 object and shows the GUI.
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    /**
     * Creates and shows the GUI for the program.
     */
    public static void createAndShowGUI() {
        // Code for creating and showing the GUI...
        AthleteFormV15 msw = new AthleteFormV15("Athlete Form V15");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
    }
    /**
     * Overrides the setFrameFeatures method in AthleteFormV14.
     */
    public void setFrameFeatures() {
        super.setFrameFeatures();
    }
}