package JTable.tableModelStatic;

import javax.swing.*;
import java.awt.*;

public class JTableBasiqueAvecModeleStatique extends JFrame {
    public JTableBasiqueAvecModeleStatique(){
        super("JTable avec modèle statique");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JTable tableau = new JTable(new ModeleStatique());

        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        pack();
    }

    public static void main(String[] args) {
        new JTableBasiqueAvecModeleStatique().setVisible(true);
    }
}
