package JOptionPane;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JLabel label;
    public Window(){
        super("JOptionPane METHODS");
        setSize(400,300);
        setLayout(new FlowLayout());
        label = new JLabel();
        label.setPreferredSize(new Dimension(100,50));
        add(label);
//        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void setLabel(String st){
        label.setText(st);
    }
}
