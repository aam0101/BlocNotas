package login;

import javax.swing.*;
import java.awt.*;

public class LoginCreativo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Creativo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JTabbedPane tabs = new JTabbedPane();

        // Panel Login
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel logo = new JLabel("BlocNotas Creative");
        logo.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        logo.setForeground(Color.ORANGE);
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        loginPanel.add(logo, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;
        loginPanel.add(new JLabel("Usuario:"), gbc);
        gbc.gridx = 1;
        JTextField userField = new JTextField();
        loginPanel.add(userField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        loginPanel.add(new JLabel("Contraseña:"), gbc);
        gbc.gridx = 1;
        JPasswordField passField = new JPasswordField();
        loginPanel.add(passField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JCheckBox terms = new JCheckBox("Aceptar términos y condiciones");
        loginPanel.add(terms, gbc);

        gbc.gridy++;
        JButton loginBtn = new JButton("Acceder");
        loginBtn.setBackground(Color.PINK);
        loginBtn.setToolTipText("Haz clic para iniciar sesión");
        loginPanel.add(loginBtn, gbc);

        // Barra de progreso y slider
        gbc.gridy++;
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        loginPanel.add(progressBar, gbc);

        gbc.gridy++;
        JSlider slider = new JSlider(0, 10, 5);
        slider.setToolTipText("Ajusta tu preferencia");
        loginPanel.add(slider, gbc);

        // Panel Registro
        JPanel registerPanel = new JPanel();
        registerPanel.add(new JLabel("Formulario de registro aquí..."));

        tabs.addTab("Login", loginPanel);
        tabs.addTab("Registro", registerPanel);

        frame.add(tabs);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
