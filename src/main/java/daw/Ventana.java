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
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author victor
 */
public class Ventana extends JPanel implements ActionListener,MouseListener {
    //Constantes para el tamaño
    private final int ANCHO = 400;
    private final int ALTO = 200;
    
    //Atributos
    // Componentes gráficos: un botón y un área de texto
    // Incluye dos JLabel y dos JButton como atributos, en la clase del JFrame.
    
    private JButton botonUno;
    private JButton botonDos;
    private JLabel etiquetaUno;
    private JLabel etiquetaDos;

    //Constructor
    public Ventana(JFrame jframe) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        inicialicar();
        initComponents();
        modificarTamaño(jframe);
    }

    private void initComponents() {

        // Borde del panel
        this.setBorder(new TitledBorder("Datos"));
        
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
    
//    Crea un método privado que inicialice los JLabel con los textos "etiqueta1"
//    y "etiqueta2". Los botones deben ser inicializados con los textos, "Aleatorio"
//    y "Raton". El método también añade los cuatro componentes al JFrame, de forma 
//    que aparezcan en el siguiente orden: boton1, etiqueta1, boton2, etiqueta2.
    
    private void inicialicar(){
        this.etiquetaUno = new JLabel("etiqueta1");
        this.etiquetaDos = new JLabel("etiqueta2");
        this.botonUno = new JButton("Aleatorio");
        this.botonDos = new JButton("Raton");
        
        //Inicializamos los botones con el actionlistener y el mouselistener
        this.botonUno.addActionListener(this);
        this.botonDos.addActionListener(this);
        this.botonDos.addMouseListener(this);
        
        this.add(this.botonUno);
        this.add(this.etiquetaUno);
        this.add(this.botonDos);
        this.add(this.etiquetaDos);
        
        
    }
//    Crea un método privado y añade al botón "Aleatorio" un controlador de eventos, 
//    usando clases internas anónimas, de forma que al pulsar sobre él, se genere 
//    un número aleatorio entre 0 y 10 y se modifique el texto en la etiqueta1.
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonUno) {
            etiquetaUno.setText("Numero Aleatorio " + numeroAleatorio());
        }
        if(e.getSource() == botonDos){
            preguntarTexto();
        }
    }
    
    private int numeroAleatorio(){
        Random r = new Random();
        return r.nextInt(0, 11);
    } 
    
//    Crea un método privado y añade al botón "Raton" un controlador de eventos
//    del tipo MouseListener, implementado solamente los métodos mouseEntered y 
//    mouseExited, de forma que cuando el ratón se sitúe sobre el botón cambie de
//    color (elige uno que te guste) y cuando el ratón salga de la zona del botón,
//    vuelva al color gris. Esta interfaz  MouseListener obliga a implementar más
//    métodos que dejaremos sin código en su interior.

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
            this.botonDos.setBackground(Color.green);
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.botonDos.setBackground(Color.LIGHT_GRAY);
    }
    
//En un método privado, abre un JOption y solicita cualquier dato de tipo texto. 
//Modifica, en este método, el texto mostrado en el label2 para que sea el texto 
//introducido en el JOptionPane.
//Añade un controlador de eventos de tipo ActionListener sobre el botón "Ratón",
//para que al pulsar sobre él, se llame al método que abre el JOption y se 
//modifique el texto de la etiqueta2.
    
    private void preguntarTexto(){
        String texto = 
                JOptionPane.showInputDialog("¿Qué texto quieres mostrar?");
        this.etiquetaDos.setText(texto);
    }
}
