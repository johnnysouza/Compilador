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
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class CompilerInterface extends JFrame {
	
	public static final String caminhoIcones = "././././././Images/";

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

		JPanel panelCompilador = new JPanel();
		contentPane.add(panelCompilador, BorderLayout.CENTER);
		panelCompilador.setLayout(new BorderLayout(0, 0));

		JPanel panelFerramentas = new JPanel();
		panelCompilador.add(panelFerramentas, BorderLayout.NORTH);
		panelFerramentas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFerramentas.setLayout(new GridLayout(0, 9, 0, 0));

		JButton btnNovo = new JButton("novo [ctrl-n]");
		btnNovo.setIcon(new ImageIcon(caminhoIcones + "newFile.png"));
		btnNovo.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNovo.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnNovo);

		JButton btnAbrir = new JButton("abrir [ctrl-a]");
		btnAbrir.setIcon(new ImageIcon(caminhoIcones + "openFile.png"));
		btnAbrir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAbrir.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnAbrir);

		JButton btnSalvar = new JButton("salvar [ctrl-s]");
		btnSalvar.setIcon(new ImageIcon(
				"././././././Images/saveFile.png"));
		btnSalvar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalvar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnSalvar);

		JButton btnCopiar = new JButton("copiar [ctrl-c]");
		btnCopiar.setIcon(new ImageIcon(caminhoIcones + "copy.png"));
		btnCopiar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCopiar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnCopiar);

		JButton btnColar = new JButton("colar [ctrl-v]");
		btnColar.setIcon(new ImageIcon(caminhoIcones + "paste.png"));
		btnColar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnColar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnColar);

		JButton btnRecortar = new JButton("recortar [ctrl-x]");
		btnRecortar.setIcon(new ImageIcon(caminhoIcones + "cut.png"));
		btnRecortar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRecortar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnRecortar);

		JButton btnCompilar = new JButton("compilar [F8]");
		btnCompilar.setIcon(new ImageIcon(caminhoIcones + "compile.png"));
		btnCompilar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCompilar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnCompilar);

		JButton btnGerarCod = new JButton("gerar c\u00F3digo [F9]");
		btnGerarCod.setIcon(new ImageIcon(caminhoIcones + "geradorCod.png"));
		btnGerarCod.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGerarCod.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnGerarCod);

		JButton btnEquipe = new JButton("equipe [F1]");
		btnEquipe.setIcon(new ImageIcon(caminhoIcones + "group.png"));
		btnEquipe.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEquipe.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnEquipe);

		JLabel lblStatus = new JLabel("N\u00E3o modificado");
		panelCompilador.add(lblStatus, BorderLayout.SOUTH);

		JPanel panelCentral = new JPanel();
		panelCompilador.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(2, 1, 0, 0));

		JTextArea textEditor = new JTextArea();
		panelCentral.add(textEditor);
		textEditor.setBorder(new NumberedBorder());

		JTextArea textMsg = new JTextArea();
		textMsg.setEditable(false);
		textMsg.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCentral.add(textMsg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	}

}
