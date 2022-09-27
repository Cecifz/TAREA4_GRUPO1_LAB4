package TAREA4_GRUPO1_LAB4;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Choice;
import java.awt.Checkbox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JCheckBox;

public class EjercicioTres extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	
	public EjercicioTres() 
	    {
			setTitle("Seleccion multiple");
			setSize(512, 403);
			setLocation(350, 150);
			getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel.setBounds(35, 29, 429, 55);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(10, 10, 166, 33);
			panel.add(lblNewLabel);
			
			rdbtnNewRadioButton = new JRadioButton("Windows");
			rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			});
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			rdbtnNewRadioButton.setBounds(182, 11, 80, 33);
			panel.add(rdbtnNewRadioButton);
			
			rdbtnNewRadioButton_1 = new JRadioButton("Linux");
			rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			});
			rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			rdbtnNewRadioButton_1.setBounds(348, 11, 69, 33);
			panel.add(rdbtnNewRadioButton_1);
			
			rdbtnNewRadioButton_2 = new JRadioButton("Mac");
			rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton.setSelected(false);
				}
			});
			rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			rdbtnNewRadioButton_2.setBounds(277, 11, 69, 33);
			panel.add(rdbtnNewRadioButton_2);
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setBounds(35, 108, 429, 131);
			getContentPane().add(panel_1);
			
			JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
			lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblElijeUnaEspecialidad.setBounds(22, 48, 166, 33);
			panel_1.add(lblElijeUnaEspecialidad);
			
			 chckbxNewCheckBox = new JCheckBox("Dise\u00F1o grafico");
			chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
			chckbxNewCheckBox.setBounds(264, 92, 121, 23);
			panel_1.add(chckbxNewCheckBox);
			
			 chckbxNewCheckBox_1 = new JCheckBox("Programacion");
			chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			chckbxNewCheckBox_1.setBounds(264, 18, 121, 23);
			panel_1.add(chckbxNewCheckBox_1);
			
			 chckbxNewCheckBox_2 = new JCheckBox("Administracion");
			chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			chckbxNewCheckBox_2.setBounds(264, 54, 121, 23);
			panel_1.add(chckbxNewCheckBox_2);
			
			JLabel lblNewLabel_1 = new JLabel("Cantidad de horas del computador: ");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1.setBounds(52, 279, 225, 14);
			getContentPane().add(lblNewLabel_1);
			
			textField = new JTextField();
			textField.setBounds(316, 276, 118, 22);
			getContentPane().add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton = new JButton("Aceptar");
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					boolean seleccion = false;
					boolean seleccion2 = false;
					String So="";
					String[] Gustos = new String[3];
					String cadena="";
					int cont=0;
					try{
						
						if (rdbtnNewRadioButton.isSelected()) 
							{
							 	So= rdbtnNewRadioButton.getText();
							 	seleccion=true;
							}
						if (rdbtnNewRadioButton_1.isSelected()) 
							{
						 		So= rdbtnNewRadioButton_1.getText();
						 		seleccion=true;
							}
						if (rdbtnNewRadioButton_2.isSelected()) 
							{
						 		So= rdbtnNewRadioButton_2.getText();
						 		seleccion=true;
							}
						JCheckBox chb[] = new JCheckBox[3];
						chb[0]= chckbxNewCheckBox;
						chb[1]= chckbxNewCheckBox_1;
						chb[2]= chckbxNewCheckBox_2;
						
						for(int i=0;i<chb.length;i++) 
							{
								if (chb[i].isSelected()) 
									{
										seleccion2=true;
										Gustos[cont]=chb[i].getText();
										cont++;
									}
							}
							if (seleccion && seleccion2) 
								{
									if (textField.getText()!="") {
								for (int j=0;j<cont;j++)
					 				cadena+="-"+Gustos[j];
								Integer.parseInt(textField.getText());
								MostrarMensaje.mostrarMensaje(So+cadena+"-"+textField.getText()+" hs","Mensaje");
									}
								}
							else
								MostrarMensaje.mostrarMensaje("Rellene los campos correspondientes","Error");
							 	
						}
					catch(NumberFormatException  e) 
					{
						e.printStackTrace();
						MostrarMensaje.mostrarMensaje("Error al colocar las horas en el computador","Error en formulario");
					}
					catch(Exception e) 
					{
						e.printStackTrace();
					    MostrarMensaje.mostrarMensaje("Hubo un error en el programa","Error");
					}
					
				}
			});
			
			btnNewButton.setBounds(367, 324, 97, 29);
			getContentPane().add(btnNewButton);
		
	    }
	
	public void cambiarVisibilidad(boolean estado){
        setVisible(true);
}
}
