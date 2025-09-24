package login;

import javax.swing.*;
import java.awt.*;

public class LoginClasico {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Clásico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel logo = new JLabel("BlocNotas");
        logo.setFont(new Font("Arial", Font.BOLD, 24));
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        frame.add(logo, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;
        JLabel userLabel = new JLabel("Usuario:");
        frame.add(userLabel, gbc);
        gbc.gridx = 1;
        JTextField userField = new JTextField();
        userField.setToolTipText("Introduce tu usuario");
        frame.add(userField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JLabel passLabel = new JLabel("Contraseña:");
        frame.add(passLabel, gbc);
        gbc.gridx = 1;
        JPasswordField passField = new JPasswordField();
        passField.setToolTipText("Introduce tu contraseña");
        frame.add(passField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JCheckBox terms = new JCheckBox("Aceptar términos y condiciones");
        frame.add(terms, gbc);

        gbc.gridy++;
        JButton loginBtn = new JButton("Acceder");
        loginBtn.setBackground(Color.BLUE);
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setToolTipText("Haz clic para iniciar sesión");
        frame.add(loginBtn, gbc);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
