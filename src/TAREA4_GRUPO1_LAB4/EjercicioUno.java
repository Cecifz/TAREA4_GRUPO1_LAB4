package TAREA4_GRUPO1_LAB4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EjercicioUno extends JFrame{
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldTel;
	private JTextField textFieldFecha;
	public EjercicioUno() {
		setTitle("Contactos");
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(50, 23, 46, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(50, 61, 46, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(50, 96, 46, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setBounds(50, 137, 61, 14);
		getContentPane().add(lblFechaNac);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(169, 20, 171, 20);
		getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(169, 58, 171, 20);
		getContentPane().add(textFieldApellido);
		
		textFieldTel = new JTextField();
		textFieldTel.setColumns(10);
		textFieldTel.setBounds(169, 93, 171, 20);
		getContentPane().add(textFieldTel);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(169, 134, 171, 20);
		getContentPane().add(textFieldFecha);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(251, 165, 89, 23);
		getContentPane().add(btnMostrar);
	}
	
	public void cambiarVisibilidad(boolean estado){
	        setVisible(true);
	    }
}
