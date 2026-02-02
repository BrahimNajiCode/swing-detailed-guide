package JOptionPane;

import javax.swing.*;
// ======================================================================
// Une boîte de confirmation offre à l'utilisateur un choix de type
// oui/non. Elle est construite à l'aide de la méthode de classe
// showConfirmDialog de la classe JOptionPane.
// ======================================================================
public class ConfirmDialog {
    public static void main(String[] args) {
        Window win = new Window();
        // ================================= SIMPLE CONFIRM DIALOG =====================================================
        int choix = JOptionPane.showConfirmDialog(win,"Are you Booga Booga ?");
        if (JOptionPane.YES_OPTION == choix){win.setLabel("You're Booga Booga!");}
        if (JOptionPane.NO_OPTION == choix){win.setLabel("You're Human");}
        if (JOptionPane.CANCEL_OPTION == choix){System.out.println("Cancel was clicked !");}
        if (JOptionPane.CLOSED_OPTION == choix){JOptionPane.showMessageDialog(win, "The window  was closed !");}
        // =============================================================================================================

        // ================================= Autres Types de Boites ====================================================
        // JOptionPane.DEFAULT_OPTION (-1) - Erreur (It gives just OK)
        // JOptionPane.YES_NO_OPTION (0) - boutons YES et NO
        // JOptionPane.YES_NO_CANCEL_OPTION (1) - boutons YES, NO et CANCEL
        // JOptionPane.OK_CANCEL_OPTION (2) - boutons OK et CANCEL
        // =============================================================================================================

        // ======================================= YES_NO_OPTION ====================================================
        // Note: Il faut toujours traiter le cas de CLOSED_OPTION
        int choice = JOptionPane.showConfirmDialog(win, "Are You a male?","SEX DEFINITON",0);
        if(choice == JOptionPane.YES_OPTION){win.setLabel("Hello Sir !");}
        if(choice == JOptionPane.NO_OPTION){win.setLabel("Hello Maam!");}
        if(choice == JOptionPane.CLOSED_OPTION){JOptionPane.showMessageDialog(win,"Window was closed !");}
        // =============================================================================================================
    }
}
