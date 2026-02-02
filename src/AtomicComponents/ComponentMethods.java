package AtomicComponents;

import javax.swing.*;
import java.awt.*;

public class ComponentMethods extends JFrame {
    JButton b;
    public ComponentMethods(){
        super("Click me");
        setSize(new Dimension(500,400));
        setLayout(null); // Pour setSize works, if not null, u should work with setPreferredSize(DIMENSION)
        b = new JButton("Click me");
        add(b);
        // ============== 1. Montrer et cacher un composant ======================
        b.setVisible(true);
        // =======================================================================

        // ============== 2. Activer et désactiver un composant ==================
        b.setEnabled(true);
        // =======================================================================

        // ============= 3. Connaître l’état (activé ou non) d’un composant ======
        System.out.println(b.isEnabled());
        // =======================================================================

        // ============= 4. Modifier la couleur de fond d'un composant ===========
        b.setBackground(new Color(104, 104, 170));
        // =======================================================================

        // ============ 5. Modifier la taille d'un composant =====================
        b.setSize(new Dimension(100,50));
        // =======================================================================

        setVisible(true);
    }
}
