package Layouts;

// Le gestionnaire de mise en forme CardLayout permet de
// disposer les composants suivant une pile(Stack), de telle façon que seul
// le composant supérieur soit visible à un moment donné

import javax.swing.*;
import java.awt.*;

public class CardL extends JFrame {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    public CardL(){
        super("CardLayout Demo");
        setSize(500,400);
        CardLayout cardLayout = new CardLayout(10,10);
        setLayout(cardLayout);


        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b1.addActionListener(e->{cardLayout.next(getContentPane());});
        b2.addActionListener(e->{cardLayout.next(getContentPane());});
        b3.addActionListener(e->{cardLayout.next(getContentPane());});
        add(b1);
        add(b2);
        add(b3);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}
