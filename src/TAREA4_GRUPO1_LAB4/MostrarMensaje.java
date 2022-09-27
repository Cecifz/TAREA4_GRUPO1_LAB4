package TAREA4_GRUPO1_LAB4;

import javax.swing.JOptionPane;

public class MostrarMensaje {



	public static void mostrarMensaje(String titulo, String mensaje) {
	 
	JOptionPane.showMessageDialog(null,
             titulo,
             mensaje,
             JOptionPane.INFORMATION_MESSAGE);
	}
}
