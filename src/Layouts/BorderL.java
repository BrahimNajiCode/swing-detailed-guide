package Layouts;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BorderL extends JFrame {
    private JButton[] buttons;
    public BorderL(){
        super("Border Layout Demo");
        setSize(500,400);
        setLayout(new BorderLayout(10,10));
        buttons = new JButton[5];
        for(int i=0; i<buttons.length;++i){
            buttons[i] = new JButton("Button "+(i+1));
        }
        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.CENTER);
        add(buttons[2], BorderLayout.SOUTH);
        add(buttons[3], BorderLayout.EAST);
        add(buttons[4], BorderLayout.WEST);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
