package AtomicComponents;

import javax.swing.*;
import java.awt.*;

// Important Methods : setText(String), getText(), setFont(Font), setForeground(Color.[...])
// setEnabled(false); label.setText("<html><b>Important</b><br><font color='red'>Erreur</font></html>");
public class label extends JFrame {
    private JLabel l1;
    public label(){
        super("Les étiquettes");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBounds(10,40,300,200);

        l1 = new JLabel("User");
        l1.setOpaque(true);
        // Sans setOpaque(true) → background invisible
        l1.setBackground(Color.YELLOW);
        l1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l1.setEnabled(true);
        // On FOCUS this text will Show
        l1.setToolTipText("Ceci est une info");


        add(l1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println(l1.getText());
        setVisible(true);
    }
}
