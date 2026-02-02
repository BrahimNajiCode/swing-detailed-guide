package DemoCardLAYOUT;

import javax.swing.*;
import java.awt.*;

public class AppCardLayoutExample {

    public static void main(String[] args) {
        new AppCardLayoutExample().createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Application CardLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        // JPanel principal avec CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // ------------------- Carte 1 : Login -------------------
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        JLabel userLabel = new JLabel("Utilisateur:");
        JTextField userField = new JTextField(15);
        JLabel passLabel = new JLabel("Mot de passe:");
        JPasswordField passField = new JPasswordField(15);
        JButton loginBtn = new JButton("Se connecter");

        gbc.gridx = 0; gbc.gridy = 0; loginPanel.add(userLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0; loginPanel.add(userField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; loginPanel.add(passLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 1; loginPanel.add(passField, gbc);
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2; loginPanel.add(loginBtn, gbc);

        // ------------------- Carte 2 : Dashboard -------------------
        JPanel dashboardPanel = new JPanel(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Bienvenue !", SwingConstants.CENTER);
        JButton toSettingsBtn = new JButton("Paramètres");
        JButton logoutBtn = new JButton("Déconnexion");

        JPanel dashButtons = new JPanel();
        dashButtons.add(toSettingsBtn);
        dashButtons.add(logoutBtn);

        dashboardPanel.add(welcomeLabel, BorderLayout.CENTER);
        dashboardPanel.add(dashButtons, BorderLayout.SOUTH);

        // ------------------- Carte 3 : Paramètres -------------------
        JPanel settingsPanel = new JPanel(new GridBagLayout());
        JLabel pseudoLabel = new JLabel("Pseudo:");
        JTextField pseudoField = new JTextField(15);
        JButton saveBtn = new JButton("Enregistrer");
        JButton backBtn = new JButton("Retour Dashboard");

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 1; settingsPanel.add(pseudoLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0; settingsPanel.add(pseudoField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; settingsPanel.add(saveBtn, gbc);
        gbc.gridx = 1; gbc.gridy = 1; settingsPanel.add(backBtn, gbc);

        // ------------------- Ajouter les cartes au mainPanel -------------------
        mainPanel.add(loginPanel, "Login");
        mainPanel.add(dashboardPanel, "Dashboard");
        mainPanel.add(settingsPanel, "Settings");

        // ------------------- Actions -------------------
        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            // vérification simple (en vrai tu ferais avec base de données)
            if(user.equals("admin") && pass.equals("1234")) {
                welcomeLabel.setText("Bienvenue, " + user + " !");
                cardLayout.show(mainPanel, "Dashboard");
            } else {
                JOptionPane.showMessageDialog(frame, "Utilisateur ou mot de passe incorrect !");
            }
        });

        toSettingsBtn.addActionListener(e -> cardLayout.show(mainPanel, "Settings"));
        backBtn.addActionListener(e -> cardLayout.show(mainPanel, "Dashboard"));
        logoutBtn.addActionListener(e -> cardLayout.show(mainPanel, "Login"));
        saveBtn.addActionListener(e -> {
            String pseudo = pseudoField.getText();
            JOptionPane.showMessageDialog(frame, "Pseudo enregistré : " + pseudo);
        });

        // ------------------- Ajouter mainPanel et afficher -------------------
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
