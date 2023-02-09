/**
 * This program is to create a GUI window from with 3 buttons:
 *  cancel button, reset button and submit button.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,9 2023
 */
package chaiyadet.nutsaba.lab7;

import java.awt.*;
import javax.swing.*;

public class MySimpleWindow extends JFrame{
    protected JButton cancelButton;
    protected JButton resetButton;
    protected JButton submitButton;
    protected JPanel mainPanel, buttonPanel;

    public MySimpleWindow(String string) {
        super(string);
    }
    public static void createAndShowGUI() {
    MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    /*
     * Button declaration and button name
     */
    public void addComponents() {
        cancelButton = new JButton("cancel");
        resetButton = new JButton("reset");
        submitButton = new JButton("submit");
        buttonPanel = new JPanel();
        mainPanel = new JPanel(new BorderLayout());
        

        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);
        mainPanel.add(buttonPanel);

        add(mainPanel);
    }
    public void setFrameFeatures(){
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
             createAndShowGUI();
            }
        });
}

}

