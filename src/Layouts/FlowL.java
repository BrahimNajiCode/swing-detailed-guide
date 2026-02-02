package Layouts;

// Le gestionnaire de mise en forme FlowLayout permet de
// disposer les composants les uns à la suite des autres, de gauche à droite.
//La classe FlowLayout dispose de trois constructeurs :
    // + public FlowLayout() ;
    // + public FlowLayout(int align): align est un paramètre d'alignement d'une ligne de composants
        // par rapport aux bords verticaux de la fenêtre. Ce paramètre peut prendre ses valeurs parmi les
        // constantes entières suivantes (on peut utiliser indifféremment le nom de la constante ou sa valeur) :
        // FlowLayout.LEFT("Left"), FlowLayout.RIGHT("Right") ou FlowLayout.CENTER("Center"). Par défaut les
        // composants sont alignés à gauche.
    // + public FlowLayout(int align, int hgap, int vgap) ;
        //hgap et vgap définissent les espaces entre les composants.

import javax.swing.*;
import java.awt.*;

public class FlowL extends JFrame{
    private JButton b1;
    private JButton b2;
    private JButton b3;
    public FlowL(){
        super("Flow Layout Demo");
        setSize(500,400);
        // =============================================================================================================
        // FlowLayout.LEFT → tout commence à gauche
        // FlowLayout.RIGHT → tout commence à droite
        // FlowLayout.CENTER → centré (par défaut)
        // FlowLayout.LEADING → commence selon la langue (gauche pour français, droite pour arabe)
        // FlowLayout.TRAILING → l’inverse de LEADING
        // =============================================================================================================
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");

        add(b1);
        add(b2);
        add(b3);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
