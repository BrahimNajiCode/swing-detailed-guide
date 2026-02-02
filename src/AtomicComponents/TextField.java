package AtomicComponents;

import javax.swing.*;
import java.awt.*;

// Important Methods : getText(), setText(String).
public class TextField extends JFrame {
    private JTextField champ1 ;
    private JTextField champ2 ;
    public TextField()
    {
        super("Une fenetre avec deux champs de texte");
        setBounds(10,40,300,200);
        setLayout(new FlowLayout());


        champ1 = new JTextField("Texte Initial 1",20);
        champ2 = new JTextField("Texte Initial 2",10);


        System.out.println(champ1.getText());
        add(champ1);
        add(champ2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
