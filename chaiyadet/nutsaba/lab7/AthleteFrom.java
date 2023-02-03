package chaiyadet.nutsaba.lab7;

import javax.swing.SwingUtilities;

public class AthleteFrom extends MySimpleWindow{
    public AthleteFrom(String string) {
        super(string);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFrom msw = 
            new AthleteFrom("Athlete Form");
        msw.addComponents();
        msw.setFrameFeatures();
    }
}
