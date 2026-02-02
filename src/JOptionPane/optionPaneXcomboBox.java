package JOptionPane;

import javax.swing.*;

public class optionPaneXcomboBox {
    public static void main(String[] args) {
        Window win = new Window();
        String[] couleurs = {"rouge", "bleu", "gris", "vert", "jaune", "noir"};
        String choix =(String) JOptionPane.showInputDialog (win, "Choisissez une couleur",
                "Boite d'options", //titre de la boîte
                JOptionPane.QUESTION_MESSAGE,
                //type d'icône suivant les valeurs du paragraphe I.7.1.
                null,
                //icône supplémentaire (ici aucune)
                couleurs,
                //liste de valeurs représentée dans la boîte combo
                couleurs[0]) ;
        win.setLabel(choix);

    }
}
