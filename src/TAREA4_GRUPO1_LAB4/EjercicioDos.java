package TAREA4_GRUPO1_LAB4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.JComboBox;

import javax.swing.SwingConstants;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjercicioDos extends JFrame{

	private static final long serialVersionUID = 1L;

	public EjercicioDos() {
		setTitle("Promedio");
		setSize(450, 350);
		setLocation(350, 150);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Notas del estudiante", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBounds(10, 11, 252, 175);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nota 1:");
		lblNewLabel.setBounds(10, 21, 61, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		
		JLabel lblNota = new JLabel("Nota 2:");
		lblNota.setBounds(10, 58, 61, 14);
		lblNota.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNota);
		
		JLabel lblNota_2 = new JLabel("Nota 3:");
		lblNota_2.setBounds(10, 95, 61, 14);
		lblNota_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNota_2);
		
		TextField txt_nota1 = new TextField();
		txt_nota1.setBounds(77, 21, 130, 22);
		panel.add(txt_nota1);
		
		TextField txt_nota2 = new TextField();
		txt_nota2.setBounds(77, 58, 130, 22);
		panel.add(txt_nota2);
		
		TextField txt_nota3 = new TextField();
		txt_nota3.setBounds(77, 95, 130, 22);
		panel.add(txt_nota3);
		
		JLabel lblNota_2_1 = new JLabel("TPS");
		lblNota_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNota_2_1.setBounds(10, 127, 36, 14);
		panel.add(lblNota_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		comboBox.setBounds(77, 123, 130, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 197, 252, 103);
		getContentPane().add(panel_1);
		panel_1.setToolTipText("");
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Notas del estudiante", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setLayout(null);
		
		TextField txt_cond = new TextField();
		txt_cond.setEditable(false);
		txt_cond.setBounds(84, 60, 130, 22);
		panel_1.add(txt_cond);
		
		JLabel lblCondicin = new JLabel("Condición:");
		lblCondicin.setHorizontalAlignment(SwingConstants.LEFT);
		lblCondicin.setBounds(10, 60, 68, 14);
		panel_1.add(lblCondicin);
		
		TextField txt_prom = new TextField();
		txt_prom.setEditable(false);
		txt_prom.setBounds(84, 23, 130, 22);
		panel_1.add(txt_prom);
		
		JLabel lblPr = new JLabel("Promedio:");
		lblPr.setHorizontalAlignment(SwingConstants.LEFT);
		lblPr.setBounds(10, 23, 68, 14);
		panel_1.add(lblPr);
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt_nota1.getText()==""||txt_nota2.getText()==""||txt_nota3.getText()=="")
					MostrarMensaje.mostrarMensaje("Debe completar todos los campos","Error");
				
				try
				{
					Float Nota1=Float.parseFloat(txt_nota1.getText());
					Float Nota2=Float.parseFloat(txt_nota2.getText());
					Float Nota3=Float.parseFloat(txt_nota3.getText());
					Float Prom=(Nota1+Nota2+Nota3)/3;
					if(comboBox.getSelectedItem().toString().equals("Desaprobado") || Nota1<6 || Nota2<6 || Nota3<6 )
						txt_cond.setText("Libre");
					else
					{
					 if(Prom>7 && Nota1>7 && Nota2>7 && Nota3>7)
						 txt_cond.setText("Promocionado");
					 else 
						 txt_cond.setText("Regular");
					}

					txt_prom.setText(Prom.toString());
				}
				catch(NumberFormatException  a) 
				{
					a.printStackTrace();
					MostrarMensaje.mostrarMensaje("Error al colocar las notas","Error en formulario");
				}
				catch(Exception a) 
				{
					a.printStackTrace();
				
				
				    MostrarMensaje.mostrarMensaje("Hubo un error en el programa","Error");
				}
	
			}
		});
		btnNewButton.setBounds(286, 68, 124, 33);
		getContentPane().add(btnNewButton);
		
		JButton btnNuevo = new JButton("Nuevo");
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_nota1.setText("");
				txt_nota2.setText("");
				txt_nota3.setText("");
				txt_prom.setText("");
				txt_cond.setText("");
				comboBox.setSelectedIndex(0);
			}
		});
		btnNuevo.setBounds(286, 111, 124, 33);
		getContentPane().add(btnNuevo);
		
		JButton btnNewButton_1_1 = new JButton("Salir");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose ();
			}
		});
		btnNewButton_1_1.setBounds(286, 153, 124, 33);
		getContentPane().add(btnNewButton_1_1);

			}
	
	public void cambiarVisibilidad(boolean estado){
	        setVisible(true);
	}
}