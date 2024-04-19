/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author victor
 */
public class Ventana extends JPanel {
    //Constantes
    private final int ANCHO = 400;
    private final int ALTO = 200;

    // Componentes gráficos: un botón y un área de texto
    // Incluye dos JLabel y dos JButton como atributos, en la clase del JFrame.
    
    private JButton botonUno;
    private JButton botonDos;

    public Ventana(JFrame jframe) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        initComponents();
        modificarTamaño(jframe);
    }

    private void initComponents() {

        // Borde del panel
        this.setBorder(new TitledBorder("Datos"));

        // Creamos el botón, con un texto a mostrar
        botonUno = new JButton("Botón 1");
        botonDos = new JButton("Botón 2");

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        this.add(botonUno);
        this.add(botonDos);

    }

    public void modificarTamaño(JFrame jframe) {
        // Tamaño del panel
        this.setPreferredSize(new Dimension(ANCHO, ALTO));

        // Borde del panel
        this.setBorder(new TitledBorder("Datos"));

        // Obtenemos el tamaño de la pantalla.
        Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamañoFrame = jframe.getSize();

        int xPos = tamañoPantalla.width / 2 - (ANCHO / 2);
        int yPos = tamañoPantalla.height / 2 - (ALTO / 2);

        jframe.setLocation(xPos, yPos);
    }

}
