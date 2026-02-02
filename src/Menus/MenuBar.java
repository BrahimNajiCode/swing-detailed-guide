package Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class MenuBar extends JFrame {
    private JMenuBar menuBar;
    private JMenuItem[] items;

    // ======================= Functions ===============================
    void exitApp() {
        System.exit(0);
    }

    void setLightMode(){

        getContentPane().setBackground(Color.WHITE);
    }
    void setDarkMode(){
        getContentPane().setBackground(Color.DARK_GRAY);
    }

    public MenuBar(){
        super("");
        setBounds(10,40,300,200);
        setLayout(new FlowLayout());
        menuBar = new  JMenuBar();
        // Ajout de la barre de menu dans la fenêtre
        setJMenuBar(menuBar);


        JMenu fileMenu = new JMenu("File");

        menuBar.add(fileMenu);


        JMenu newItem  = new JMenu("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.setMnemonic(KeyEvent.VK_F);   // Alt + F
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();   // separator line --> Ajout d'une barre séparatrice avant l'option suivante
        fileMenu.add(exitItem);
        exitItem.addActionListener(e -> exitApp());
        // ==================== Other Options Of Item ===========================
        // JRadioButtonMenuItem + JCheckBoxMenuItem
        // ==================== JCheckBoxMenuItem ===============================
            JMenu formesMenu = new JMenu("Fomres");
            menuBar.add(formesMenu);
            JCheckBoxMenuItem rectangle = new JCheckBoxMenuItem("Rectangle");
            JCheckBoxMenuItem oval = new JCheckBoxMenuItem("Oval");
            formesMenu.add(rectangle); formesMenu.add(oval);
        // ==================== JRadioButtonMenuItem ============================
            JMenu ModeMenu = new JMenu("Modes");
            menuBar.add(ModeMenu);
            JRadioButtonMenuItem light = new JRadioButtonMenuItem("Light");
            JRadioButtonMenuItem dark = new JRadioButtonMenuItem("Dark");
            // les options boutons radio sont placées dans un groupe de
            // type ButtonGroup afin d'assurer l'unicité de la sélection à
            // l'intérieur du groupe (cf paragraphe I.5.2.)
            ButtonGroup modes = new ButtonGroup();
            modes.add(light); modes.add(dark);
            ModeMenu.add(light); ModeMenu.add(dark);
            light.setSelected(true);
            light.addActionListener(e -> setLightMode());
            dark.addActionListener(e -> setDarkMode());
        // ======================================================================

        // ==================== Composition des options =========================
        // Example: file(new) ---> 1. module / 2. Project / 3. package
        // Il faut declare newItem comme JMenu et Non JMenuItem
        JMenuItem moduleItem = new JMenuItem("Module");
        JMenuItem projectItem = new JMenuItem("Project");
        JMenuItem packageItem = new JMenuItem("Package");
        newItem.add(moduleItem); newItem.add(projectItem); newItem.add(packageItem);
        // ======================================================================



        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
