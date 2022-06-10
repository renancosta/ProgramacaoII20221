package Aula11;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private JTextField txtEntrada;
	private JTextField txtEntrada2;

	public static void main(String[] args) {
		Calculadora tela = new Calculadora();
		tela.criaTela();
	}

	private void criaTela() {
		Container janela = getContentPane();
		setLayout(null);
		txtEntrada = new JTextField();
		txtEntrada2 = new JTextField();
		txtEntrada.setBounds(100, 40, 100, 20);
		txtEntrada2.setBounds(100, 70, 100, 20);
		janela.add(txtEntrada);
		janela.add(txtEntrada2);
		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.setBounds(100, 100, 100, 20);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(txtEntrada.getText());
					int b = Integer.parseInt(txtEntrada2.getText());
					System.out.println(a+b);
				}catch(Exception ex) {
					System.out.print("Valor informado não é um número");
				}
			}
		});
		janela.add(btnNewButton);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
