package Menus;

// ==================== Les menus surgissants ===========================
// Les menus usuels, que nous venons d'étudier, sont des menus
// rattachés à une barre de menu et donc affichés en permanence
// dans une fenêtre Java. Java propose aussi des menus
// surgissants de type JPopupMenu qui sont des menus (sans
// nom) dont la liste d'options apparaît suite à une certaine action
// de l'utilisateur.
// ======================================================================

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopUpMenu extends JFrame {
    //création d'un menu surgissant comportant deux options
    private JMenuItem copy;
    private JMenuItem cut;
    private JMenuItem refresh;

    public PopUpMenu(){
        super("PopUpMenu");
        setBounds(10,40,300,200);
        setLayout(new FlowLayout());
        // Menu surgissant
        JPopupMenu couleur = new JPopupMenu("PopUp Menu") ;
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        refresh = new JMenuItem("Refresh");
        couleur.add(refresh);
        couleur.add(copy);
        couleur.add(cut);
        // Quand tu fais clic droit, le menu surgissant apparaît.
        // Déclenchement par clic droit
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                // Est-ce que cette action correspond à un clic droit ?
                if (e.isPopupTrigger())
                    // Afficher le menu
                    couleur.show(e.getComponent(), e.getX(), e.getY());
            }

            public void mouseReleased(MouseEvent e) {
                // Est-ce que cette action correspond à un clic droit ?
                if (e.isPopupTrigger())
                    // Afficher le menu
                    couleur.show(e.getComponent(), e.getX(), e.getY());
            }
        });


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
