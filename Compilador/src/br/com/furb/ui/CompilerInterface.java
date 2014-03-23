package br.com.furb.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class CompilerInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompilerInterface frame = new CompilerInterface();
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
	public CompilerInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 9, 0, 0));
		
		JButton btnNovo = new JButton("novo [ctrl-n]");
		btnNovo.setIcon(new ImageIcon(".\\.\\.\\.\\.\\.\\Images\\newFile.png"));
		btnNovo.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNovo.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(btnNovo);
		
		JButton btnAbrir = new JButton("abrir [ctrl-a]");
		btnAbrir.setIcon(new ImageIcon(".\\.\\.\\.\\.\\.\\Images\\openFile.png"));
		btnAbrir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAbrir.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(btnAbrir);
		
		JButton btnSalvar = new JButton("salvar [ctrl-s]");
		btnSalvar.setIcon(new ImageIcon(".\\.\\.\\.\\.\\.\\Images\\saveFile.png"));
		btnSalvar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalvar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(btnSalvar);
		
		JButton btnCopiar = new JButton("copiar [ctrl-c]");
		btnCopiar.setIcon(new ImageIcon(".\\.\\.\\.\\.\\.\\Images\\copy.png"));
		btnCopiar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCopiar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(btnCopiar);
		
		JButton btnColar = new JButton("colar [ctrl-v]");
		btnColar.setIcon(new ImageIcon(".\\.\\.\\.\\.\\.\\Images\\paste.png"));
		btnColar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnColar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(btnColar);
		
		JButton btnRecortar = new JButton("recortar [ctrl-x]");
		btnRecortar.setIcon(new ImageIcon(".\\.\\.\\.\\.\\.\\Images\\cut.png"));
		btnRecortar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRecortar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(btnRecortar);
		
		JButton btnCompilar = new JButton("compilar [F8]");
		btnCompilar.setIcon(new ImageIcon(".\\.\\.\\.\\.\\.\\Images\\compile.png"));
		btnCompilar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCompilar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(btnCompilar);
		
		JButton btnGerarCod = new JButton("gerar c\u00F3digo [F9]");
//		btnGerarCod.setIcon(new ImageIcon(".\\.\\.\\.\\.\\.\\Images\\.png")); //TODO achar icone para gerar código
		btnGerarCod.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGerarCod.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(btnGerarCod);
		
		JButton btnEquipe = new JButton("equipe [F1]");
		btnEquipe.setIcon(new ImageIcon(".\\.\\.\\.\\.\\.\\Images\\group.png"));
		btnEquipe.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEquipe.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(btnEquipe);
	}

}
