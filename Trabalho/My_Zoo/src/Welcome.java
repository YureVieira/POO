import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Welcome {

	private JFrame frmBoasVindas;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frmBoasVindas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBoasVindas = new JFrame();
		frmBoasVindas.setTitle("Boas Vindas");
		frmBoasVindas.setBounds(100, 100, 450, 247);
		frmBoasVindas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBoasVindas.getContentPane().setLayout(null);
		
		JButton btnVisitante = new JButton("Visitante");
		btnVisitante.setBounds(24, 119, 116, 78);
		frmBoasVindas.getContentPane().add(btnVisitante);
		
		JButton btnNovoVisitante = new JButton("Novo Visitante");
		btnNovoVisitante.setBounds(150, 119, 133, 78);
		frmBoasVindas.getContentPane().add(btnNovoVisitante);
		
		JButton btnFuncionario = new JButton("Funcionario");
		btnFuncionario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FirstLogin loginForm = new FirstLogin();
				frmBoasVindas.add(loginForm);
				loginForm.setVisible(true);
			}
		});
		btnFuncionario.setBounds(293, 119, 120, 78);
		frmBoasVindas.getContentPane().add(btnFuncionario);
		
		JLabel lblBemVindoAo = new JLabel("Bem vindo ao Zoologico");
		lblBemVindoAo.setFont(new Font("Arial", Font.BOLD, 18));
		lblBemVindoAo.setBounds(111, 25, 211, 22);
		frmBoasVindas.getContentPane().add(lblBemVindoAo);
	}
}
