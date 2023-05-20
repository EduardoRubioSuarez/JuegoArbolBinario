import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;


public class pr1 extends JFrame{
	
	public pr1() {
		this.setTitle("Juego");
		this.setSize(600,600);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		JPanel panel = new JPanel();
		panel.setSize(600, 600);
		panel.setLocation(0, 0);
		panel.setBackground(Color.LIGHT_GRAY);
		
		JLabel imagen = new JLabel("IMAGEN");
		imagen.setFont(new Font("Comic Sans", Font.BOLD,20));
		imagen.setSize(450, 150);
		imagen.setLocation(50, 50);
		imagen.setOpaque(true);
		imagen.setForeground(Color.white);
		imagen.setBackground(Color.decode("#0B4488"));
		panel.add(imagen);
		
		
		// SITUACIONES OPCIONES
		
		JLabel situacion1 = new JLabel("1) Caminar por el bosque oscuro donde no se ninguna alma");
		situacion1.setFont(new Font("Comic Sans", Font.BOLD,12));
		situacion1.setSize(450, 50);
		situacion1.setLocation(50, 250);
		situacion1.setOpaque(true);
		situacion1.setForeground(Color.white);
		situacion1.setBackground(Color.decode("#0B4488"));
		panel.add(situacion1);
		
		JLabel situacion2 = new JLabel("2) Caminar por la ciudad llena de luz");
		situacion2.setFont(new Font("Comic Sans", Font.BOLD,12));
		situacion2.setSize(450, 50);
		situacion2.setLocation(50, 300);
		situacion2.setOpaque(true);
		situacion2.setForeground(Color.white);
		situacion2.setBackground(Color.decode("#0B4488"));
		panel.add(situacion2);
		
		JLabel situacion3 = new JLabel("3) Caminar por el barrio donde se que me respaldan");
		situacion3.setFont(new Font("Comic Sans", Font.BOLD,12));
		situacion3.setSize(450, 50);
		situacion3.setLocation(50, 350);
		situacion3.setOpaque(true);
		situacion3.setForeground(Color.white);
		situacion3.setBackground(Color.decode("#0B4488"));
		panel.add(situacion3);
		
		JLabel situacion4 = new JLabel("4) No caminar y quedarme en mi casa jugando 😎");
		situacion4.setFont(new Font("Comic Sans", Font.BOLD,12));
		situacion4.setSize(450, 50);
		situacion4.setLocation(50, 400);
		situacion4.setOpaque(true);
		situacion4.setForeground(Color.white);
		situacion4.setBackground(Color.decode("#0B4488"));
		panel.add(situacion4);
		
		
		
		/// BOTONES DEOPCIONES
		JButton opcion1 = new JButton("Opcion 1");
		opcion1.setName("1");
		opcion1.setSize(100, 40);
		opcion1.setLocation(60, 500);
		opcion1.setOpaque(true);
		opcion1.setBackground(Color.decode("#BAC210"));
		panel.add(opcion1);
		
		JButton opcion2 = new JButton("Opcion 2");
		opcion2.setName("2");
		opcion2.setSize(100, 40);
		opcion2.setLocation(170, 500);
		opcion2.setOpaque(true);
		opcion2.setBackground(Color.decode("#BAC210"));
		panel.add(opcion2);
		
		JButton opcion3 = new JButton("Opcion 3");
		opcion3.setName("3");
		opcion3.setSize(100, 40);
		opcion3.setLocation(280, 500);
		opcion3.setOpaque(true);
		opcion3.setBackground(Color.decode("#BAC210"));
		panel.add(opcion3);
		
		JButton opcion4 = new JButton("Opcion 4");
		opcion4.setName("4");
		opcion4.setSize(100, 40);
		opcion4.setLocation(390, 500);
		opcion4.setOpaque(true);
		opcion4.setBackground(Color.decode("#BAC210"));
		panel.add(opcion4);
		
		
		this.add(panel);
		
		
		
	}
	

}