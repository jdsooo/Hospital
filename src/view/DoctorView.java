package view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class DoctorView {

    private int[] pantally = {1300, 800};

    // Constructor que recibe un HashMap
    public DoctorView(HashMap<String, String> doctorInfo) {
        JFrame frame = new JFrame("Perfil del doctor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(pantally[0], pantally[1]);
        frame.setLayout(new BorderLayout());

        agregarBarraSuperior(frame, doctorInfo);
        frame.setVisible(true);
    }

    private void agregarBarraSuperior(JFrame frame, HashMap<String, String> doctorInfo) {
        JPanel barraSuperior = new JPanel();
        barraSuperior.setLayout(new BorderLayout());
        barraSuperior.setBackground(new Color(51, 51, 51));

        JLabel tituloLabel = new JLabel("Hospital Santa Catalina");
        tituloLabel.setForeground(Color.WHITE);
        tituloLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tituloLabel.setHorizontalAlignment(SwingConstants.LEFT);

        JPanel panelIzquierdo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelIzquierdo.setOpaque(false);
        panelIzquierdo.add(tituloLabel);

        JPanel panelDerecho = new JPanel();
        panelDerecho.setPreferredSize(new Dimension(150, 60));
        panelDerecho.setBackground(new Color(51, 51, 51));
        panelDerecho.setLayout(new GridBagLayout());

        // Usar el HashMap para obtener información del doctor
        JLabel nombreLabel = new JLabel(doctorInfo.get("nombre"));
        nombreLabel.setForeground(Color.WHITE);

        JLabel rolLabel = new JLabel(doctorInfo.get("rol"));
        rolLabel.setForeground(Color.LIGHT_GRAY);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 0, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panelDerecho.add(nombreLabel, gbc);

        gbc.gridy = 1;
        panelDerecho.add(rolLabel, gbc);

        barraSuperior.add(panelIzquierdo, BorderLayout.WEST);
        barraSuperior.add(panelDerecho, BorderLayout.EAST);

        frame.add(barraSuperior, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DoctorView(new HashMap<>())); // Solo para pruebas
    }
}
