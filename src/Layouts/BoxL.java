package Layouts;

import javax.swing.*;
import java.awt.*;

public class BoxL extends JFrame {
    private JPanel p1, p2;
    private JButton[] buttons;
    public BoxL(){
        super("BoxLayout Demo");
        setSize(500,400);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
        buttons = new JButton[6];
        // ================ PANEL P1 =============================
        p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        for(int i =0;i<3;++i){
            buttons[i]= new JButton("Button "+(i+1));
            p1.add(buttons[i]);
            p1.add(Box.createRigidArea(new Dimension(10,0))); // espace horizontal
            // Or Use p1.add(Box.createHorizontalStrut(10))));
        }
        // ================ PANEL P2 =============================
        p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));

        for(int i =3;i<6;++i){
            buttons[i]= new JButton("Button "+(i+1));
            p2.add(buttons[i]);
            p2.add(Box.createRigidArea(new Dimension(0,10))); // espace vertical
            // Or Use p1.add(Box.createVerticalStrut(10))));
        }
        // ================ ADD PANELS =============================
        add(p1);
        add(p2);
        // =========================================================
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
