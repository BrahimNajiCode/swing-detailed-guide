package Menus;

import javax.swing.*;
import java.awt.*;

// Important Methods:  setFloatable(boolean);
public class ToolBar extends JFrame {
    private JToolBar barreOutils ;
    JButton b1, b2, b3;
    public ToolBar(){
        super("");
        setBounds(10,40,300,200);
        setLayout(new FlowLayout());

        barreOutils = new JToolBar();
        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        barreOutils.add(b1);
        barreOutils.add(b2);
        barreOutils.add(b3);
        add(barreOutils);

        // ==============================================================================
        // Par défaut, une barre d'outils est flottante, c'est à dire qu'on
        // peut la déplacer d'un bord à un autre de la fenêtre, ou à
        // l'intérieur de la fenêtre. On peut interdire à une barre d'outils de
        // flotter grâce à la méthode setFloatable.
        // ==============================================================================
        barreOutils.setFloatable(false);


        // Un bouton peut être créé avec une icône de type ImageIcon
        // (classe du paquetage javax.swing dérivée de la classe Object)
        // au lieu d'un texte.
        // ==================================================================
        // ImageIcon iconeVert = new ImageIcon("vert.gif") ;
        // Création d'une icône à partir d'un fichier "vert.gif"
        // contenant un dessin d'un carré de couleur vert
        // JButton boutonVert = new JButton(iconeVert) ;
        // barreOutils.add(boutonVert) ;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
