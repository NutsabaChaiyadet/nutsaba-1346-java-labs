/**
 * This program is when ENTER is pressed.  to show a message window  and when selecting c
 * heckbox or gender  Shows a window with a message saying whether to select that or not blood.
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

public class AthleteFormV9 extends AthleteFormV8{

    public AthleteFormV9(String title) {
        super(title);
    }
    public void addListeners(){
        super.addListeners();
        nameTxtField.addActionListener(this);
        weightTxtField.addActionListener(this);
        heightTxtField.addActionListener(this);
        dateTxtField.addActionListener(this);
        maleButton.addActionListener(this);
        femaleButton.addActionListener(this);
        readingCheckBox.addActionListener(this);
        gardeningCheckBox.addActionListener(this);
        watchingmovivesCheckBox.addActionListener(this);
        shoppingCheckBox.addActionListener(this);
        othersCheckBox.addActionListener(this);
        newMI.addActionListener(this);
        openMI.addActionListener(this);
        saveMI.addActionListener(this);
        exitMI.addActionListener(this);
        nationalityComboBox.addActionListener(this);
    }
    //When pressing that button, the display window shows a message.
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object enterObject = e.getSource();
        if (enterObject == nameTxtField) {
            JOptionPane.showMessageDialog(this, "Name is changed to " + nameTxtField.getText());
        } else if (enterObject == weightTxtField) {
             JOptionPane.showMessageDialog(this, "Weight is changed to " + weightTxtField.getText());
        } else if (enterObject == heightTxtField) {
             JOptionPane.showMessageDialog(this, "Height is changed to " + heightTxtField.getText());
        } else if (enterObject == dateTxtField) {
             JOptionPane.showMessageDialog(this, "Date of birth changed to " + dateTxtField.getText());
        } else if (enterObject == maleButton) {
             JOptionPane.showMessageDialog(this, "Male of Seleced");
        } else if (enterObject == femaleButton) {
             JOptionPane.showMessageDialog(this, "Female of Seleced");
        } else if (enterObject == newMI) {
             JOptionPane.showMessageDialog(this, "You click menu New");
        } else if (enterObject == openMI) {
             JOptionPane.showMessageDialog(this, "You click menu Opew");
        } else if (enterObject == saveMI) {
             JOptionPane.showMessageDialog(this, "You click menu Save");
        } else if (enterObject == exitMI) {
            System.exit(0);
        } else if (enterObject == nationalityComboBox){
            JOptionPane.showMessageDialog(this, "Nationality is changed to " + nationalityComboBox.getSelectedItem());
        }
    } 
    //Set data when making a selection in the menu.
    public void addMenus(){
        super.addMenus();
        newMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        openMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        saveMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        exitMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));

        newMI.setMnemonic('n');
        openMI.setMnemonic('o');
        saveMI.setMnemonic('s');
        exitMI.setMnemonic('x');
    }
    //Set the combo box to display a window of each type.
    public void addComponents(){
        super.addComponents();
        readingCheckBox.addItemListener( new ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if(evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Reading is also your hobby");
                        }else {
                            JOptionPane.showMessageDialog(null, "Reading is no longer your hobby");
                        }
                    }
                });
            }
        });
        gardeningCheckBox.addItemListener( new ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if(evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Gardening is also your hobby");
                        }else {
                            JOptionPane.showMessageDialog(null, "Gardening is no longer your hobby");
                        }
                    }
                });
            }
        });
        watchingmovivesCheckBox.addItemListener( new ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if(evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Watching movies is also your hobby");
                        }else {
                            JOptionPane.showMessageDialog(null, "Watching movies is no longer your hobby");
                        }
                    }
                });
            }
        });
        shoppingCheckBox.addItemListener( new ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if(evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Shopping is also your hobby");
                        }else {
                            JOptionPane.showMessageDialog(null, "Shopping is no longer your hobby");
                        }
                    }
                });
            }
        });
        othersCheckBox.addItemListener( new ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if(evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Others is also your hobby");
                        }else {
                            JOptionPane.showMessageDialog(null, "Others is no longer your hobby");
                        }
                    }
                });
            }
        });
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
            createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFormV9 msw = 
            new AthleteFormV9("Athlete Form V9");
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
