/**
 * This program is to change the color of Textfield.  
 * and changing the font of the label  and change the text color and size of the menu
 * and show a message when using the mouse over the button  and filemenu and configmenu
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,17 2023
 */
package chaiyadet.nutsaba.lab8;

import java.awt.*;
import javax.swing.SwingUtilities;

public class AthleteFormV5 extends AthleteFormV4 {

    public AthleteFormV5(String title) {
        super(title);
    }
    public void addComponents(){
        super.addComponents();
        //set the background color of a text file
        Color mycolor = new Color(167,59,36);
        nameTxtField.setBackground(mycolor);
        weightTxtField.setBackground(mycolor);
        heightTxtField.setBackground(mycolor);
        dateTxtField.setBackground(mycolor);

        //Change font name Serif bold and size14
        nameLabel.setFont(new Font("Serif",Font.BOLD,14));
        weightLabel.setFont(new Font("Serif",Font.BOLD,14));
        heightLabel.setFont(new Font("Serif",Font.BOLD,14));
        dateLabel.setFont(new Font("Serif",Font.BOLD,14));
        genderJLabel.setFont(new Font("Serif",Font.BOLD,14));
        hobbiesLabel.setFont(new Font("Serif",Font.BOLD,14));
        nationalityLabel.setFont(new Font("Serif",Font.BOLD,14));
        sportLabel.setFont(new Font("Serif",Font.BOLD,14));
        bioLabel.setFont(new Font("Serif",Font.BOLD,14));
        sliderLabel.setFont(new Font("Serif",Font.BOLD,14));

        //Change the color of the book.
        sport.setForeground(new Color(35,45,222));

        //set The body button has a font, name, serif, bold, tilt, size 16
        cancelButton.setFont(new Font("Serif",Font.BOLD + Font.ITALIC,16));
        resetButton.setFont(new Font("Serif",Font.BOLD + Font.ITALIC,16));
        submitButton.setFont(new Font("Serif",Font.BOLD + Font.ITALIC,16));

        //set bio background color.
        bioTextArea.setBackground(new Color(200,200,200));

        //set so that when the mouse is hovering over the button, a message will pop up
        cancelButton.setToolTipText("Press the cancel button to cancel this form");
        resetButton.setToolTipText("Press the reset button to reset this form");
        submitButton.setToolTipText("Press the submit button to submit this form");

    }
    public void addMenus(){
        super.addMenus();

        //Change font name Serif bold and size14
        fileMenu.setFont(new Font("SanSerif",Font.BOLD,14));
        configJMenu.setFont(new Font("SanSerif",Font.BOLD,14));
        colorMenu.setFont(new Font("SanSerif",Font.BOLD,14));
        sizeMenu.setFont(new Font("SanSerif",Font.BOLD,14));
        newMI.setFont(new Font("SanSerif",Font.BOLD,14));
        openMI.setFont(new Font("SanSerif",Font.BOLD,14));
        saveMI.setFont(new Font("SanSerif",Font.BOLD,14));
        exitMI.setFont(new Font("SanSerif",Font.BOLD,14));
        redMI.setFont(new Font("SanSerif",Font.BOLD,14));
        greenMI.setFont(new Font("SanSerif",Font.BOLD,14));
        blueMI.setFont(new Font("SanSerif",Font.BOLD,14));
        size16MI.setFont(new Font("SanSerif",Font.BOLD,14));
        size20MI.setFont(new Font("SanSerif",Font.BOLD,14));
        size24MI.setFont(new Font("SanSerif",Font.BOLD,14));

        //change font color
        fileMenu.setForeground(new Color(6,57,112));
        configJMenu.setForeground(new Color(6,57,112));
        colorMenu.setForeground(new Color(6,57,112));
        sizeMenu.setForeground(new Color(6,57,112));
        newMI.setForeground(new Color(6,57,112));
        openMI.setForeground(new Color(6,57,112));
        saveMI.setForeground(new Color(6,57,112));
        exitMI.setForeground(new Color(6,57,112));
        redMI.setForeground(new Color(6,57,112));
        greenMI.setForeground(new Color(6,57,112));
        blueMI.setForeground(new Color(6,57,112));
        size16MI.setForeground(new Color(6,57,112));
        size20MI.setForeground(new Color(6,57,112));
        size24MI.setForeground(new Color(6,57,112));

         //set so that when the mouse is hovering over the button, a message will pop up
        fileMenu.setToolTipText("To create new, open, save form or exit");
        configJMenu.setToolTipText("To configure size and color of a component");
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFormV5 msw = 
            new AthleteFormV5("Athlete Form V5");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
    }
    public void setFrameFeatures(){
        super.setFrameFeatures();
    }
}
