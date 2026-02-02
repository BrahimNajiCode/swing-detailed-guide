package Layouts;

import javax.swing.*;
import java.awt.*;

public class GridBagL extends JFrame {
    private JButton b;
    public GridBagL(){
        super("GridBagLayout Demo");
        setSize(500,400);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        // Premier bouton
        JButton button1 = new JButton("Button 1");
        gbc.gridx = 0; // colonne 0
        gbc.gridy = 0; // ligne 0
        add(button1, gbc);

        // Deuxième bouton
        JButton button2 = new JButton("Button 2");
        gbc.gridx = 1; // colonne 1
        gbc.gridy = 0; // ligne 0
        add(button2, gbc);

        // Troisième bouton sur toute la largeur
        JButton button3 = new JButton("Button 3");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // occupe 2 colonnes
        gbc.fill = GridBagConstraints.HORIZONTAL; // s’étire horizontalement
        add(button3, gbc);





        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
