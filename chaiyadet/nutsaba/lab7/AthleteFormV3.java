/**
 * This program is to extend AthleteformV2.  Added a menu, namely file and config.
 * 
 *  @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version Febuary,9 2023
 */
package chaiyadet.nutsaba.lab7;

import javax.swing.*;

public class AthleteFormV3 extends AthleteFormV2 {
    protected JMenuBar menuBar;
    protected JMenu fileMenu,configJMenu,colorJMenu,sizeMenu;
    protected JMenuItem newMI,openMI,saveMI,exitMI,redMI,greenMI,blueMI,size16MI,size20MI,size24MI;

    public AthleteFormV3(String title) { 
        super(title);
    }
    public void addMenus(){
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");//Give menu name file
        configJMenu = new JMenu("Config");//give menu name config
        
        //Add an image to the item menu.
        newMI = new JMenuItem("New");
        ImageIcon newIcon = new ImageIcon(getClass().getResource("../lab7/Icon/New-icon.png"));//Add an image to the item menu.
        newMI.setIcon(newIcon);

        openMI = new JMenuItem("Open");
        ImageIcon openIcon = new ImageIcon(getClass().getResource("../lab7/Icon/Open-icon.png"));//Add an image to the item menu.
        openMI.setIcon(openIcon);

        saveMI = new JMenuItem("Save");
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("../lab7/Icon/Save-icon.png"));//Add an image to the item menu.
        saveMI.setIcon(saveIcon);

        exitMI = new JMenuItem("Exit");

        //menu of configmenu
        colorJMenu = new JMenu("Color");
        sizeMenu = new JMenu("Size");
        //Color menu item menu
        redMI = new JMenuItem("Red");
        greenMI = new JMenuItem("Green");
        blueMI = new JMenuItem("Blue");
        //menu item of sizemenu
        size16MI = new JMenuItem("16");
        size20MI = new JMenuItem("20");
        size24MI = new JMenuItem("24");

        // Adding
        fileMenu.add(newMI);
        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        fileMenu.add(exitMI);

        configJMenu.add(colorJMenu);
        configJMenu.add(sizeMenu);

        colorJMenu.add(redMI);
        colorJMenu.add(greenMI);
        colorJMenu.add(blueMI);

        sizeMenu.add(size16MI);
        sizeMenu.add(size20MI);
        sizeMenu.add(size24MI);

        menuBar.add(fileMenu);
        menuBar.add(configJMenu);

        this.setJMenuBar(menuBar);
    }
    public void addComponents(){
        super.addComponents();
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI(){
        AthleteFormV3 msw = 
            new AthleteFormV3("Athlete Form V3");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
    }
    public void setFrameFeatures(){
        super.setFrameFeatures();
    }

    
}
