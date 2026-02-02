package JOptionPane.CustomDialog;


import javax.swing.*;
import java.awt.*;

public class CustomDialog extends Dialog {
    private JButton b;
    private JTextField c;
    public CustomDialog(JFrame win){
        super(win, "My Dialogue", true);
        setSize(200,100);
        b = new JButton("a Button");
        c = new JTextField(10);
        setLayout(new FlowLayout());
        add(b); add(c);
    }
}
