package JTable;

import javax.swing.*;
import java.awt.*;

public class JTableBasiqueAvecScrollPane extends JFrame {
    public JTableBasiqueAvecScrollPane() {
        super("JTable basique dans un JPanel");
        Object[][] donnees = {
                {"Johnathan", "Sykes", Color.red, true, Sport.TENNIS},
                {"Nicolas", "Van de Kampf", Color.black, true, Sport.FOOTBALL},
                {"Damien", "Cuthbert", Color.cyan, true, Sport.RIEN},
                {"Corinne", "Valance", Color.blue, false, Sport.NATATION},
                {"Emilie", "Schrödinger", Color.magenta, false, Sport.FOOTBALL},
                {"Delphine", "Duke", Color.yellow, false, Sport.TENNIS},
                {"Eric", "Trump", Color.pink, true, Sport.FOOTBALL},
        };
        String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme", "Sport"};
        JTable tableau = new JTable(donnees, entetes);

        // Cette fois, on ajoute directement le JTable dans le JScrollPane.
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);


        pack(); // Choisis la taille de la fenretre approprie
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
