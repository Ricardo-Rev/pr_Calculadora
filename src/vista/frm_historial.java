/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import javax.swing.*;
import java.io.*;
import java.awt.*;

public class frm_historial extends javax.swing.JFrame {

    private JTextArea ta_historial;

    public frm_historial() {
        initComponents();
        loadHistorial();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historial de Operaciones");
        setSize(400, 300);
        setLocationRelativeTo(null);
        ta_historial = new JTextArea();
        ta_historial.setEditable(false);
        add(new JScrollPane(ta_historial), BorderLayout.CENTER);
    }

    private void loadHistorial() {
        try (BufferedReader br = new BufferedReader(new FileReader("bitacoraCalculadora.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                ta_historial.append(line + "\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo de bitácora", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

