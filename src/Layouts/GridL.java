package Layouts;


import javax.swing.*;
import java.awt.*;

// Le gestionnaire de mise en forme GridLayout permet de
// disposer les composants les uns à la suite des autres sur une
// grille régulière, chaque composant occupant une cellule de la
// grille.
public class GridL extends JFrame {
    private JButton[] buttons;
    public GridL(){
        super("GridLayout Demo");
        setSize(500,400);
        // public GridLayout(int rows, int cols) ;
        // public GridLayout(int rows, int cols, int hgap, int vgap) ;
        setLayout(new GridLayout(3,3,5,5));
        buttons = new JButton[9];
        for (int i=0;i<buttons.length;++i){
            buttons[i]= new JButton("Button "+(i+1));
            add(buttons[i]);
        }
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
