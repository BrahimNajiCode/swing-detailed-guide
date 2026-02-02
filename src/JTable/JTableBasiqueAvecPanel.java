package JTable;

import javax.swing.*;
import java.awt.*;

public class JTableBasiqueAvecPanel extends JFrame {

    public JTableBasiqueAvecPanel(){
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

        // On utilise donc le constructeur JTable(Object[][] data,Object[] entetes)
        // pour gérer nos données et nos en-têtes.
        // new JTable(final Object[][] rowData, final Object[] columnNames)
        // Pour ajouter le JTable dans un JPanel,
        // il faut ajouter séparément le header du tableau et le tableau en lui-même.

        getContentPane().add(tableau.getTableHeader(),BorderLayout.NORTH);
        getContentPane().add(tableau,BorderLayout.CENTER);


        pack(); // Choisis la taille de la fenretre approprie
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
