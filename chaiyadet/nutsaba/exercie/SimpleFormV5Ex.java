package chaiyadet.nutsaba.exercie;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SimpleFormV5Ex extends SimpleFormV4 implements ChangeListener {
    JSlider slider;
    JPanel sliderPanel;

    public SimpleFormV5Ex(String title) {
        super(title);
        //TODO Auto-generated constructor stub
    }

    public void setFrameFeatures() {
        super.setFrameFeatures();
    }

    public static void createAndShowGUI() {
        SimpleFormV5Ex window = new SimpleFormV5Ex("SimpleFormV5Ex");
        window.addComponents();
        window.addMenus();
        window.setFrameFeatures();
        window.addListeners();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public void addComponents() {
        super.addComponents();
        slider = new JSlider(0,10,5);

        slider.setMajorTickSpacing(2);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        contentBottomPanel.add(slider, BorderLayout.CENTER);
    }

    protected void addListeners() {
        slider.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {
            int value = source.getValue();
            JOptionPane.showMessageDialog(this, value);
        }
    }
}

