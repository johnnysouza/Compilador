package br.com.furb.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class CompilerInterface extends JFrame {

	private JButton btnNovo;
	private JButton btnAbrir;
	private JButton btnSalvar;
	private JButton btnCopiar;
	private JButton btnColar;
	private JButton btnRecortar;
	private JButton btnCompilar;
	private JButton btnGerarCod;
	private JButton btnEquipe;
	private JLabel lblStatus;
	private JTextArea textEditor;
	private JTextArea textMsg;
	private JPanel contentPane;
	
	public static final String caminhoIcones = "././././././Images/";

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

		btnNovo = new JButton("novo [ctrl-n]");
		btnNovo.setIcon(new ImageIcon(caminhoIcones + "newFile.png"));
		btnNovo.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNovo.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnNovo);

		btnAbrir = new JButton("abrir [ctrl-a]");
		btnAbrir.setIcon(new ImageIcon(caminhoIcones + "openFile.png"));
		btnAbrir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAbrir.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnAbrir);

		btnSalvar = new JButton("salvar [ctrl-s]");
		btnSalvar.setIcon(new ImageIcon(
				"././././././Images/saveFile.png"));
		btnSalvar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalvar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnSalvar);

		btnCopiar = new JButton("copiar [ctrl-c]");
		btnCopiar.setIcon(new ImageIcon(caminhoIcones + "copy.png"));
		btnCopiar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCopiar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnCopiar);

		btnColar = new JButton("colar [ctrl-v]");
		btnColar.setIcon(new ImageIcon(caminhoIcones + "paste.png"));
		btnColar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnColar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnColar);

		btnRecortar = new JButton("recortar [ctrl-x]");
		btnRecortar.setIcon(new ImageIcon(caminhoIcones + "cut.png"));
		btnRecortar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRecortar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnRecortar);

		btnCompilar = new JButton("compilar [F8]");
		btnCompilar.setIcon(new ImageIcon(caminhoIcones + "compile.png"));
		btnCompilar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCompilar.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnCompilar);

		btnGerarCod = new JButton("gerar c\u00F3digo [F9]");
		btnGerarCod.setIcon(new ImageIcon(caminhoIcones + "geradorCod.png"));
		btnGerarCod.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGerarCod.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnGerarCod);

		btnEquipe = new JButton("equipe [F1]");
		btnEquipe.setIcon(new ImageIcon(caminhoIcones + "group.png"));
		btnEquipe.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEquipe.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFerramentas.add(btnEquipe);

		lblStatus = new JLabel("N\u00E3o modificado");
		panelCompilador.add(lblStatus, BorderLayout.SOUTH);

		JPanel panelCentral = new JPanel();
		panelCompilador.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(2, 1, 0, 0));

		textEditor = new JTextArea();
		panelCentral.add(textEditor);
		textEditor.setBorder(new NumberedBorder());

		textMsg = new JTextArea();
		textMsg.setEditable(false);
		textMsg.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCentral.add(textMsg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	}

	public JButton getBtnNovo() {
		return btnNovo;
	}

	public void setBtnNovo(JButton btnNovo) {
		this.btnNovo = btnNovo;
	}

	public JButton getBtnAbrir() {
		return btnAbrir;
	}

	public void setBtnAbrir(JButton btnAbrir) {
		this.btnAbrir = btnAbrir;
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}

	public JButton getBtnCopiar() {
		return btnCopiar;
	}

	public void setBtnCopiar(JButton btnCopiar) {
		this.btnCopiar = btnCopiar;
	}

	public JButton getBtnColar() {
		return btnColar;
	}

	public void setBtnColar(JButton btnColar) {
		this.btnColar = btnColar;
	}

	public JButton getBtnRecortar() {
		return btnRecortar;
	}

	public void setBtnRecortar(JButton btnRecortar) {
		this.btnRecortar = btnRecortar;
	}

	public JButton getBtnCompilar() {
		return btnCompilar;
	}

	public void setBtnCompilar(JButton btnCompilar) {
		this.btnCompilar = btnCompilar;
	}

	public JButton getBtnGerarCod() {
		return btnGerarCod;
	}

	public void setBtnGerarCod(JButton btnGerarCod) {
		this.btnGerarCod = btnGerarCod;
	}

	public JButton getBtnEquipe() {
		return btnEquipe;
	}

	public void setBtnEquipe(JButton btnEquipe) {
		this.btnEquipe = btnEquipe;
	}

	public JLabel getLblStatus() {
		return lblStatus;
	}

	public void setLblStatus(JLabel lblStatus) {
		this.lblStatus = lblStatus;
	}

	public JTextArea getTextEditor() {
		return textEditor;
	}

	public void setTextEditor(JTextArea textEditor) {
		this.textEditor = textEditor;
	}

	public JTextArea getTextMsg() {
		return textMsg;
	}

	public void setTextMsg(JTextArea textMsg) {
		this.textMsg = textMsg;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

}
