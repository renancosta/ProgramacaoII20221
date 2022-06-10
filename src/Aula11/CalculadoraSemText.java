package Aula11;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculadoraSemText extends JFrame {

	private JTextField txtEntrada;
	private JTextField txtEntrada2;
	String valor="";
	int operacao=0;
	int resultado=0;
	
	public static void main(String[] args) {
		CalculadoraSemText tela = new CalculadoraSemText();
		tela.criaTela();
	}

	private void criaTela() {
		Container janela = getContentPane();
		setLayout(null);
		JButton btn0 = new JButton("0");
		btn0.setBounds(50, 40, 40, 30);
		JButton btn1 = new JButton("1");
		btn1.setBounds(90, 40, 40, 30);
		JButton btn2 = new JButton("2");
		btn2.setBounds(130, 40, 40, 30);
		JButton btn3 = new JButton("3");
		btn3.setBounds(50, 70, 40, 30);
		JButton btn4 = new JButton("4");
		btn4.setBounds(90, 70, 40, 30);
		JButton btn5 = new JButton("5");
		btn5.setBounds(130, 70, 40, 30);
		janela.add(btn0);
		janela.add(btn1);
		janela.add(btn2);
		janela.add(btn3);
		janela.add(btn4);
		janela.add(btn5);
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(100, 100, 100, 20);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					operacao=1;
					resultado += Integer.parseInt(valor);
					valor="";
					System.out.println(resultado);
				}catch(Exception ex) {
					System.out.print("Valor informado não é um número");
				}
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor+="0";
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor+="1";
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor+="2";
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor+="3";
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor+="4";
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor+="5";
			}
		});
		janela.add(btnNewButton);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
