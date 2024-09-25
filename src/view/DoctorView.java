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

        agregarBarraSuperior(frame, doctorInfo); // Barra superior con nombre y especialidad
        agregarBarraLateral(frame); // Barra lateral con botones
        frame.setVisible(true);
    }

    private void agregarBarraSuperior(JFrame frame, HashMap<String, String> doctorInfo) {
        JPanel barraSuperior = new JPanel();
        barraSuperior.setLayout(new BorderLayout());
        barraSuperior.setBackground(new Color(51, 51, 51));

        // Panel izquierdo para el título
        JLabel tituloLabel = new JLabel("Hospital Santa Catalina");
        tituloLabel.setForeground(Color.WHITE);
        tituloLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tituloLabel.setHorizontalAlignment(SwingConstants.LEFT);

        JPanel panelIzquierdo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelIzquierdo.setOpaque(false);
        panelIzquierdo.add(tituloLabel);

        barraSuperior.add(panelIzquierdo, BorderLayout.WEST);

        // Panel derecho para mostrar el nombre y la especialidad del doctor
        JPanel panelDerecho = new JPanel();
        panelDerecho.setOpaque(false); // Para que el fondo sea transparente
        panelDerecho.setLayout(new GridBagLayout()); // Usamos GridBagLayout para alinear verticalmente
        barraSuperior.add(panelDerecho, BorderLayout.EAST);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Espaciado entre componentes
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.WEST;

        // Mostrar el nombre del doctor
        if (doctorInfo.containsKey("nombre")) {
            JLabel nameDoctor = new JLabel(doctorInfo.get("nombre"));
            nameDoctor.setForeground(Color.WHITE);
            panelDerecho.add(nameDoctor, gbc);
        }

        // Mostrar la especialidad del doctor
        if (doctorInfo.containsKey("especialidad")) {
            JLabel specialtyLabel = new JLabel(doctorInfo.get("especialidad"));
            specialtyLabel.setForeground(Color.LIGHT_GRAY);
            gbc.gridy = 1; // Colocar la especialidad debajo del nombre
            panelDerecho.add(specialtyLabel, gbc);
        }

        // Añadir la barra superior al frame
        frame.add(barraSuperior, BorderLayout.NORTH);
    }

    private void agregarBarraLateral(JFrame frame) {
        // Crear la barra lateral que ocupa todo el lado izquierdo
        JPanel barraLateral = new JPanel(new GridBagLayout());
        barraLateral.setBackground(new Color(51, 51, 51));
        barraLateral.setPreferredSize(new Dimension(200, frame.getHeight())); // Ancho de la barra lateral

        // Constraints para centrar los botones
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre botones
        gbc.gridx = 0; // Todos los botones en la columna 0
        gbc.gridy = GridBagConstraints.RELATIVE; // Colocar los botones uno debajo del otro
        gbc.anchor = GridBagConstraints.CENTER; // Centrar los botones vertical y horizontalmente

        // Crear y agregar los botones, con un tamaño más pequeño
        for (int i = 1; i <= 5; i++) {
            JButton boton = new JButton("Opción " + i);
            boton.setPreferredSize(new Dimension(120, 30)); // Tamaño pequeño de los botones
            barraLateral.add(boton, gbc);
        }

        frame.add(barraLateral, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        HashMap<String, String> doctorInfo = new HashMap<>();


        SwingUtilities.invokeLater(() -> new DoctorView(doctorInfo));
    }
 }
