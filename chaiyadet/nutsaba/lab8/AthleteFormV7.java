/**This program is to add an athlete's figure to the form.
 * 
 *  @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,17 2023
 */

package chaiyadet.nutsaba.lab8;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.BufferedImage;

public class AthleteFormV7 extends AthleteFormV6{
    ReadImage imagesize;
    protected JPanel imagePanel, groupPanel3;

    public AthleteFormV7(String title) {
        super(title);
    }
    @Override
    public void addComponents() {
        super.addComponents();
        imagesize = new ReadImage();
        imagesize.setPreferredSize(new Dimension(400,300));//Let the size of the image be 400 width and 300 height.
        imagePanel = new JPanel(new BorderLayout());
        imagePanel.add(imagesize);//Add image size to panel

        //arrange panel
        groupPanel3  = new JPanel(new BorderLayout());
        groupPanel3.add(buttonPanel, BorderLayout.SOUTH);
        groupPanel3.add(imagePanel, BorderLayout.NORTH);

        mainPanel.add(groupPanel3, BorderLayout.SOUTH);

    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
            createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFormV7 msw = 
            new AthleteFormV7("Athlete Form V7");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
    }
    public void setFrameFeatures(){
        super.setFrameFeatures();
    }
}
class ReadImage extends JPanel{
    BufferedImage image1;
    // image files
    String filenameIMG = "/Users/nutsaba/Documents/Testgit/nutsaba-1346-java-labs/chaiyadet/nutsaba/lab8/Ahleteimage/Athlete.png";
    @Override
    //image display
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image1,0,0,null);
    } 
    public ReadImage(){
        try {
            image1 = ImageIO.read(new File(filenameIMG));
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
}
