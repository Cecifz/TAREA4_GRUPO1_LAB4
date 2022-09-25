package TAREA4_GRUPO1_LAB4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.LinkedBlockingDeque;

public class PantallaPrincipal extends JFrame {

    private JLabel lblTitulo;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;

    public PantallaPrincipal(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocation(350, 150);
        setLayout(null);

        lblTitulo = new JLabel("GRUPO NRO: 1");
        lblTitulo.setBounds(20, 15, 120, 40);

        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton1.setText("Ejercicio 1");
        boton2.setText("Ejercicio 2");
        boton3.setText("Ejercicio 3");
        boton1.setBounds(100, 80, 120, 20);
        boton2.setBounds(100, 120, 120, 20);
        boton3.setBounds(100, 160, 120, 20);

        boton1.addActionListener(new abrirEjercicioUno() );
        
        getContentPane().add(lblTitulo);
        getContentPane().add(boton1);
        getContentPane().add(boton2);
        getContentPane().add(boton3);

    }

    public void cambiarVisibilidad(boolean estado){
        setVisible(true);
    }

}

class eventoBoton implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Esta presionando el botón Aceptar");
    }
}


class abrirEjercicioUno implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		EjercicioUno ejerUno = new EjercicioUno();
		ejerUno.cambiarVisibilidad(true);
	}

}





