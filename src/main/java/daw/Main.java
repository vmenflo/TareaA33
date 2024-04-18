/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author victor
 */
public class Main {
    public static void main(String[] args) {
        //Modifica el layout de esta ventana, a FlowLayout, en el constructor de la ventana.
        // Construimos la ventana
    	JFrame frame = new JFrame("Víctor Mena Flores");
	
        //LLamar a la ventana
        frame.add(new Ventana(frame));
        
        // Hacemos visible la ventana
    	frame.setVisible(true);
        // La ventana no se puede redimensionar
        frame.setResizable(false);
        // Ajusta el frame al contenido
        frame.pack();
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
