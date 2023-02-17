/**
 * This program is to draw 5 circles of different colors on top.
 * 
 * @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,17 2023
 */
package chaiyadet.nutsaba.lab8;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AthleteFormV6 extends AthleteFormV5{
    OlympicSymbol circleOlimpic;
    protected JPanel olympicPanel;
    public AthleteFormV6(String title) {
        super(title);
    }

    @Override
    public void addComponents(){
        super.addComponents();
        circleOlimpic = new OlympicSymbol();
        circleOlimpic.setPreferredSize(new Dimension(200,100));//Let the circle be 200 wide and 100 high.
        olympicPanel = new JPanel( new GridLayout(1,1));
        olympicPanel.setBackground(Color.WHITE);//Let the panel have a white background.
        olympicPanel.add(circleOlimpic);
        //rearrange panel
        groupPanel1.removeAll();

        groupPanel1 = new JPanel(new BorderLayout());
        groupPanel1.add(olympicPanel, BorderLayout.NORTH);
        groupPanel1.add(keepMainPanel, BorderLayout.CENTER);
        groupPanel1.add(hobbiPanel1, BorderLayout.SOUTH);

        mainPanel.add(groupPanel1, BorderLayout.NORTH);
        mainPanel.add(groupPanel2, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
            createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFormV6 msw = 
            new AthleteFormV6("Athlete Form V6");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
    }
    public void setFrameFeatures(){
        super.setFrameFeatures();
    }
}
class OlympicSymbol extends JPanel{
    //Declaring a circular variable  position for size
    protected Ellipse2D.Double circle1 = new Ellipse2D.Double(10,10,50,50);
    protected Ellipse2D.Double circle2 = new Ellipse2D.Double(60,10,50,50);
    protected Ellipse2D.Double circle3 = new Ellipse2D.Double(110,10,50,50);
    protected Ellipse2D.Double circle4 = new Ellipse2D.Double(35,35,50,50);
    protected Ellipse2D.Double circle5 = new Ellipse2D.Double(85,35,50,50);
    
    //draw a circle
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D circle2D = (Graphics2D)g;
        circle2D.setStroke(new BasicStroke(5));
        circle2D.setColor(Color.BLUE);
        circle2D.draw(circle1);

        circle2D.setColor(Color.RED);
        circle2D.draw(circle2);

        circle2D.setColor(Color.YELLOW);
        circle2D.draw(circle3);

        circle2D.setColor(Color.GREEN);
        circle2D.draw(circle4);

        circle2D.setColor(Color.BLACK);
        circle2D.draw(circle5);
    }
}