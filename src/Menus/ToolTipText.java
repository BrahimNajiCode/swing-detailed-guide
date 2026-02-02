package Menus;

import javax.swing.*;
import java.awt.*;

public class ToolTipText extends JFrame {
    private JMenuBar menuBar;
    private JMenu colors ;
    private JMenuItem red ;
    private JMenuItem green ;

    public ToolTipText(){
        super("");
        setBounds(10,40,300,200);
        setLayout(new FlowLayout());


        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        colors = new JMenu("Colors");
        menuBar.add(colors);
        red =new JMenuItem("Red");
        red.setToolTipText("Fond Red"); // Show Text on Hover

        green =new JMenuItem("Green");
        green.setToolTipText("Fond Green"); // Show Text on Hover

        colors.add(red); colors.add(green);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
}
