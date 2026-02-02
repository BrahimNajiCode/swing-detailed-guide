package JOptionPane;

import javax.swing.*;

public class InputDialog {
    public static void main(String[] args) {
        Window win = new Window();
        // ================================= SIMPLE INPUT DIALOG =====================================================
        String name1 = JOptionPane.showInputDialog("Enter Your Name ");
        win.setLabel("Hello! "+name1);
        // =============================================================================================================

        // ================================= INPUT DIALOG WITH ICON =====================================================
        String name2 = JOptionPane.showInputDialog(win,"Enter Your Name ","Identity Control", JOptionPane.QUESTION_MESSAGE);
        win.setLabel("Hello! "+name2);
        // =============================================================================================================
    }
}
