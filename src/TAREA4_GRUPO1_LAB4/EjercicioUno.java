package TAREA4_GRUPO1_LAB4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;

public class EjercicioUno extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTel;
	private JTextField txtFecha;

	public EjercicioUno() {
		setTitle("Contactos");
		setSize(450, 350);
		setLocation(350, 150);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(50, 23, 120, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(50, 61, 120, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(50, 96, 120, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setBounds(50, 137, 120, 14);
		getContentPane().add(lblFechaNac);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(169, 20, 171, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(169, 58, 171, 20);
		getContentPane().add(txtApellido);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(169, 93, 171, 20);
		getContentPane().add(txtTel);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(169, 134, 171, 20);
		getContentPane().add(txtFecha);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(251, 165, 89, 23);
		getContentPane().add(btnMostrar);

		JLabel lblSubtitulo = new JLabel("Los datos ingresados fueron: ");
		lblSubtitulo.setBounds(50, 225, 220, 14);
		getContentPane().add(lblSubtitulo);
		lblSubtitulo.setVisible(false);

		JLabel lblDatosIngresados = new JLabel();
		lblDatosIngresados.setBounds(50, 230, 400,50);
		getContentPane().add(lblDatosIngresados);
		lblDatosIngresados.setVisible(false);

		btnMostrar.addActionListener(new MostrarDatos(txtNombre, txtApellido, txtTel, txtFecha, lblSubtitulo, lblDatosIngresados));
	}
	
	public void cambiarVisibilidad(boolean estado){
	        setVisible(true);
	}
}

	class MostrarDatos implements ActionListener {

		private JTextField txtNombreIng;
		private JTextField txtApellidoIng;
		private JTextField txtTelIng;
		private JTextField txtFechaIng;
		private JLabel lblSubtitulo;
		private JLabel lblDatosIngresados;

		public MostrarDatos(JTextField txtNom, JTextField txtAp, JTextField txtTel, JTextField txtNac, JLabel lblSub, JLabel lblDatosIng){
			txtNombreIng = txtNom;
			txtApellidoIng = txtAp;
			txtTelIng = txtTel;
			txtFechaIng = txtNac;
			lblSubtitulo = lblSub;
			lblDatosIngresados = lblDatosIng;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String datos = txtNombreIng.getText() + " " + txtApellidoIng.getText() + ", Tel:  " + txtTelIng.getText();
			datos += ", Fecha Nac: " + txtFechaIng.getText();
			if (!(
					txtNombreIng.getText().equals("") ||
					txtApellidoIng.getText().equals("") ||
					txtTelIng.getText().equals("") ||
					txtFechaIng.getText().equals("")
					))
			{
			lblDatosIngresados.setText(datos);
			lblSubtitulo.setVisible(true);
			lblDatosIngresados.setVisible(true);
			}
			if(txtNombreIng.getText().equals(""))
				txtNombreIng.setBackground(Color.red);
			else
				txtNombreIng.setBackground(Color.white);
			if(txtApellidoIng.getText().equals(""))
				txtApellidoIng.setBackground(Color.red);
			else
				txtApellidoIng.setBackground(Color.white);
			if(txtTelIng.getText().equals(""))
				txtTelIng.setBackground(Color.red);
			else
				txtTelIng.setBackground(Color.white);
			if(txtFechaIng.getText().equals(""))
				txtFechaIng.setBackground(Color.red);
			else
				txtFechaIng.setBackground(Color.white);
		
			
			switch (validarDatos()) {
			case 1:
				JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre v�lido!");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Por favor, ingrese un apellido v�lido!");
				break;
			case 3: 
				JOptionPane.showMessageDialog(null, "Por favor, ingrese un tel�fono v�lido!");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Por favor, ingrese una fecha v�lida!");
				break;
			default:
				break;
			}
			
		}
		
		int validarDatos() {
			String nombre = txtNombreIng.getText(); 
			String apellido = txtApellidoIng.getText();
			String tel = txtTelIng.getText();
			String fecha = txtFechaIng.getText();
			for(int x=0; x<nombre.length();x++) {
				if(x==0 && nombre.charAt(x) == ' ')
					return 1;
				if(!Character.isLetter(nombre.charAt(x)))
					return 1;
			}
			for(int x=0; x<apellido.length();x++) {
				if(x==0 && apellido.charAt(x)== ' ')
					return 2;
				if(!Character.isLetter(apellido.charAt(x)))
					return 2;
			}
			for(int x=0; x<tel.length();x++) {
				if(x==0 && tel.charAt(x) == ' ')
					return 3;
				if(Character.isLetter(tel.charAt(x)))
					return 3;
			}			
			for(int x=0; x<fecha.length();x++) {
				if(x==0 && fecha.charAt(x) == ' ')
					return 3;
				if(Character.isLetter(fecha.charAt(x)))
					if(fecha.charAt(x) != '/')
						return 4;
			}			

			return 0;
		}
		
		
	}