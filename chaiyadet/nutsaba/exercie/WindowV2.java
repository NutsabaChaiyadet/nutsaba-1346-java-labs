package chaiyadet.nutsaba.exercie;

import javax.swing.*;
import javax.swing.event.*;

public class WindowV2 extends JPanel  {
    protected JColorChooser color1;
    protected JButton openButton, saveBuutton;
    protected JPanel buttonPanel, mainPanel;
    
    public WindowV2(String string) {
    }
    public void addComponents() {
        openButton = new JButton("OPEN");
        saveBuutton = new JButton("SAVE");

        buttonPanel.add(openButton);
        buttonPanel.add(saveBuutton);
        add(mainPanel); 
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        WindowV2 msw = 
            new WindowV2("WindowV2");
        msw.addComponents();
 
       
    }
}


