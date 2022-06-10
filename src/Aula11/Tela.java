package Aula11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Tela extends JFrame {

	private JPanel contentPane;
	Teste teste = new Teste();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.RED);
		btn0.setBackground(Color.ORANGE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teste.setNum1(0);
			}
		});
		btn0.setBounds(90, 46, 51, 47);
		contentPane.add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teste.imprimeNum1();
			}
		});
		btn2.setBounds(139, 46, 51, 47);
		contentPane.add(btn2);
	}
}
