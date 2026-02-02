package JOptionPane;

import javax.swing.*;

// Important Methods: showMessageDialog(window, String); showMessageDialog(window, Message, Title, Type d'icône)
public class MessageDialog {
    public static void main(String[] args) {
        JFrame win = new Window();
        // ============= Simple Message ===========================
        JOptionPane.showMessageDialog(win, "Bonjour !");
        // ========================================================

        // ========================================= ERROR MESSAGE WINDOW ========================================
        JOptionPane.showMessageDialog(win,"Erreur critique", "Error",JOptionPane.ERROR_MESSAGE);
        // =======================================================================================================

        // =================== Icons that exits outhere ===================================
        // JOptionPane.ERROR_MESSAGE - Erreur
        // JOptionPane.INFORMATION_MESSAGE - Information
        // JOptionPane.WARNING_MESSAGE - Avertissement
        // JOptionPane.QUESTION_MESSAGE - Question
        // JOptionPane.PLAIN_MESSAGE - Aucune icône
        // =================================================================================

        // ========================================= QUESTION MESSAGE WINDOW ========================================
        JOptionPane.showMessageDialog(win,"Are you booga booga ?", "Smell of booga boogas",JOptionPane.QUESTION_MESSAGE);
        // =======================================================================================================
    }
}
