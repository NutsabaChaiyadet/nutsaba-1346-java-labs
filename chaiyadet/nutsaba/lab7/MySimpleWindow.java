package chaiyadet.nutsaba.lab7;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
    public void addComponents() {
        cancelButton = new JButton("cancel");
        resetButton = new JButton("reset");
        submitButton = new JButton("submit");
        buttonPanel = new JPanel();
        mainPanel = new JPanel();
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

