package login;

import javax.swing.*;
import java.awt.*;

public class LoginExtendido {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Extendido");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 350);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        frame.add(mainPanel);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Logo
        JLabel logo = new JLabel("BlocNotas Extended");
        logo.setFont(new Font("Arial", Font.BOLD, 26));
        logo.setForeground(Color.MAGENTA);
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(logo, gbc);

        // Usuario y contraseña
        gbc.gridwidth = 1;
        gbc.gridy++;
        mainPanel.add(new JLabel("Usuario:"), gbc);
        gbc.gridx = 1;
        JTextField userField = new JTextField();
        mainPanel.add(userField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        mainPanel.add(new JLabel("Contraseña:"), gbc);
        gbc.gridx = 1;
        JPasswordField passField = new JPasswordField();
        mainPanel.add(passField, gbc);

        // Recordar usuario
        gbc.gridx = 0;
        gbc.gridy++;
        JRadioButton remember = new JRadioButton("Recordar usuario");
        mainPanel.add(remember, gbc);

        // Idioma
        gbc.gridx = 1;
        JComboBox<String> language = new JComboBox<>(new String[]{"Español", "Inglés", "Francés"});
        mainPanel.add(language, gbc);

        // Checkbox
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JCheckBox terms = new JCheckBox("Aceptar términos y condiciones");
        mainPanel.add(terms, gbc);

        // Botón
        gbc.gridy++;
        JButton loginBtn = new JButton("Acceder");
        loginBtn.setBackground(Color.GREEN);
        loginBtn.setForeground(Color.BLACK);
        loginBtn.setToolTipText("Haz clic para iniciar sesión");
        mainPanel.add(loginBtn, gbc);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
