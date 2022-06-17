package AtividadeDOJO.ComTela;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarAluno extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfNome;
	private JLabel lblNewLabel_1;
	private JTextField tfEmail;
	private JTextField tfCurso;
	private JLabel lblNewLabel_1_2;
	private ManterAluno ma = new ManterAluno();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CadastrarAluno dialog = new CadastrarAluno();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CadastrarAluno() {
		setBounds(100, 100, 450, 487);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		SpringLayout sl_contentPanel = new SpringLayout();
		contentPanel.setLayout(sl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("Cadastrar Aluno");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel, 144, SpringLayout.WEST, contentPanel);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Nome");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 62, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 42, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_1);
		}
		{
			tfNome = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.EAST, tfNome, 249, SpringLayout.EAST, lblNewLabel_1);
			tfNome.setText("");
			sl_contentPanel.putConstraint(SpringLayout.WEST, tfNome, 64, SpringLayout.EAST, lblNewLabel_1);
			sl_contentPanel.putConstraint(SpringLayout.SOUTH, tfNome, 0, SpringLayout.SOUTH, lblNewLabel_1);
			contentPanel.add(tfNome);
			tfNome.setColumns(10);
		}
		{
			tfEmail = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.EAST, tfEmail, 0, SpringLayout.EAST, tfNome);
			tfEmail.setText("");
			tfEmail.setColumns(10);
			contentPanel.add(tfEmail);
		}
		{
			lblNewLabel_1_2 = new JLabel("E-mail");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, tfEmail, 0, SpringLayout.NORTH, lblNewLabel_1_2);
			sl_contentPanel.putConstraint(SpringLayout.WEST, tfEmail, 61, SpringLayout.EAST, lblNewLabel_1_2);
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_2, 12, SpringLayout.SOUTH, lblNewLabel_1);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1_2, 0, SpringLayout.WEST, lblNewLabel_1);
			contentPanel.add(lblNewLabel_1_2);
		}
		{
			tfCurso = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.EAST, tfCurso, 0, SpringLayout.EAST, tfNome);
			tfCurso.setText("");
			tfCurso.setColumns(10);
			contentPanel.add(tfCurso);
		}
		{
			JLabel lblNewLabel_1_1 = new JLabel("Curso");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, tfCurso, 0, SpringLayout.NORTH, lblNewLabel_1_1);
			sl_contentPanel.putConstraint(SpringLayout.WEST, tfCurso, 64, SpringLayout.EAST, lblNewLabel_1_1);
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 18, SpringLayout.SOUTH, lblNewLabel_1_2);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1_1, 0, SpringLayout.WEST, lblNewLabel_1);
			contentPanel.add(lblNewLabel_1_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Aluno aluno = new Aluno();
						aluno.setNome(tfNome.getText());
						aluno.setEmail(tfEmail.getText());
						aluno.setCurso(tfCurso.getText());
						ma.cadastrarAluno(aluno);
						limparTela();
						ma.listaAluno();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Voltar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	private void limparTela() {
		tfNome.setText("");
		tfEmail.setText("");
		tfCurso.setText("");
	}

}
