package br.unip.team.emissopassagem.view;

import java.awt.EventQueue;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.unip.team.emissopassagem.view.tela.TelaIniciar;

public class Apresentacao extends JFrame {
	
	private static final long serialVersionUID = -8691656276980851401L;
	private static final Logger LOGGER = Logger.getLogger(Apresentacao.class.getName());
	
	private JPanel basePane;
	
	public Apresentacao() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 640, 480);
		basePane = new JPanel();
		basePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		basePane.setLayout(null);
		setContentPane(basePane);
		setResizable(false);
		setTitle("Sistema Emissor de Passagens");
		new TelaIniciar(basePane);
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(() ->{
				try {
					Apresentacao frame = new Apresentacao();
					frame.setVisible(true);
				} catch (Exception e) {
					LOGGER.info(e.getMessage());
				}
		});
	}
		
}
