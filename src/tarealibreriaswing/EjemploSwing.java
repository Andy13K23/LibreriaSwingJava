import javax.swing.*;
import java.awt.*;

public class EjemploSwing {
    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Ejemplo Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Etiqueta Andy Aquino");
        JButton button = new JButton("Boton");
        JTextField textField = new JTextField(10);
        JTextArea textArea = new JTextArea(10, 20);
        JCheckBox checkBox = new JCheckBox("Casilla de verificación");
        JRadioButton radioButton1 = new JRadioButton("Opción 1");
        JRadioButton radioButton2 = new JRadioButton("Opción 2");
        JRadioButton radioButton3 = new JRadioButton("Opción 3");

        JComboBox<String> comboBox = new JComboBox<>(new String[]{"ROJO", "AMARILLO", "AZUL"});
        JSlider slider = new JSlider(50, 100, 50);

        frame.add(label);
        frame.add(button);
        frame.add(textField);
        frame.add(textArea);
        frame.add(checkBox);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(comboBox);
        frame.add(slider);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
