package AtomicComponents;
import javax.swing.*;
import java.awt.*;
// Important Methods : isSelected(), setSelected() [ se trouvent dans AbstractButton.java]
public class CheckBox extends JFrame {
    JCheckBox b ;
    public CheckBox(){
        super("JCheckBox");
        setBounds(10,40,300,200);
        b = new JCheckBox("Hello World!");
        b.setPreferredSize(new Dimension(50,50));
        add(b);
        b.setSelected(true);
        System.out.println(b.isSelected());
        setVisible(true);
    }
}
