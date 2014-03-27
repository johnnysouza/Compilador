package br.com.furb.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
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
	private JLabel lbStatus;
	private JTextArea textEditor;
	private JTextArea textMsg;
	private JPanel contentPane;

	public static final String caminhoIcones = "././././././Images/";
	private JPanel panelFooter;
	private JLabel lbFilePath;
	private JScrollPane scrollPaneEditor;
	private JPanel panelEditor;
	private JPanel panelMsg;
	private JScrollPane scrollPaneMsg;
	private OpenFile openFile;

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
		Font fonte = new Font("Dialog", Font.BOLD, 11);
		KeyListener keyListener = new ShortCutListener(this);
		addKeyListener(keyListener);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 650);
		setTitle("Compilador");
		setMinimumSize(new Dimension(800, 650));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.addKeyListener(keyListener);
		setContentPane(contentPane);

		JPanel panelCompilador = new JPanel();
		contentPane.add(panelCompilador, BorderLayout.CENTER);
		panelCompilador.setLayout(new BorderLayout(0, 0));
		panelCompilador.addKeyListener(keyListener);

		JPanel panelFerramentas = new JPanel();
		panelCompilador.add(panelFerramentas, BorderLayout.NORTH);
		panelFerramentas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFerramentas.setLayout(new GridLayout(0, 9, 0, 0));
		panelFerramentas.addKeyListener(keyListener);

		btnNovo = new JButton("novo [ctrl-n]");
		btnNovo.setIcon(new ImageIcon(caminhoIcones + "newFile.png"));
		btnNovo.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNovo.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNovo.addKeyListener(keyListener);
		btnNovo.setFont(fonte);
		panelFerramentas.add(btnNovo);

		btnAbrir = new JButton("abrir [ctrl-a]");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openFile = new OpenFile();
				String caminho = openFile.OpenFilePanel();
				String texto = "";
				if (!caminho.equalsIgnoreCase("")
						&& caminho.toLowerCase().endsWith(".cfj")) {
					texto = openFile.textFileRead(caminho);
					lbFilePath.setText(caminho);
					textEditor.setText(texto);
					lbStatus.setText("N�o modificado");

				} else {
					textMsg.setText("Arquivo inv�lido!");
				}
			}
		});
		btnAbrir.setIcon(new ImageIcon(caminhoIcones + "openFile.png"));
		btnAbrir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAbrir.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAbrir.addKeyListener(keyListener);
		btnAbrir.setFont(fonte);
		panelFerramentas.add(btnAbrir);

		btnSalvar = new JButton("salvar [ctrl-s]");
		btnSalvar.setIcon(new ImageIcon(caminhoIcones + "saveFile.png"));
		btnSalvar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalvar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSalvar.addKeyListener(keyListener);
		btnSalvar.setFont(fonte);
		panelFerramentas.add(btnSalvar);

		btnCopiar = new JButton("copiar [ctrl-c]");
		btnCopiar.setIcon(new ImageIcon(caminhoIcones + "copy.png"));
		btnCopiar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCopiar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCopiar.addKeyListener(keyListener);
		btnCopiar.setFont(fonte);
		panelFerramentas.add(btnCopiar);

		btnColar = new JButton("colar [ctrl-v]");
		btnColar.setIcon(new ImageIcon(caminhoIcones + "paste.png"));
		btnColar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnColar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnColar.addKeyListener(keyListener);
		btnColar.setFont(fonte);
		panelFerramentas.add(btnColar);

		btnRecortar = new JButton("recortar [ctrl-x]");
		btnRecortar.setIcon(new ImageIcon(caminhoIcones + "cut.png"));
		btnRecortar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRecortar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRecortar.addKeyListener(keyListener);
		btnRecortar.setFont(fonte);
		panelFerramentas.add(btnRecortar);

		btnCompilar = new JButton("compilar [F8]");
		btnCompilar.setIcon(new ImageIcon(caminhoIcones + "compile.png"));
		btnCompilar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCompilar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCompilar.addKeyListener(keyListener);
		btnCompilar.setFont(fonte);
		panelFerramentas.add(btnCompilar);

		btnGerarCod = new JButton("gerar c\u00F3digo [F9]");
		btnGerarCod.setIcon(new ImageIcon(caminhoIcones + "geradorCod.png"));
		btnGerarCod.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGerarCod.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnGerarCod.addKeyListener(keyListener);
		btnGerarCod.setFont(fonte);
		panelFerramentas.add(btnGerarCod);

		btnEquipe = new JButton("equipe [F1]");
		btnEquipe.setIcon(new ImageIcon(caminhoIcones + "group.png"));
		btnEquipe.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEquipe.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnEquipe.addKeyListener(keyListener);
		btnEquipe.setFont(fonte);
		panelFerramentas.add(btnEquipe);

		JPanel panelCentral = new JPanel();
		panelCentral.addKeyListener(keyListener);
		panelCompilador.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));

		panelEditor = new JPanel();
		panelEditor.addKeyListener(keyListener);

		scrollPaneEditor = new JScrollPane(panelEditor);
		scrollPaneEditor.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneEditor.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneEditor.addKeyListener(keyListener);

		textEditor = new JTextArea();
		textEditor.setBorder(new NumberedBorder());
		textEditor.addKeyListener(keyListener);
		panelEditor.setLayout(new BoxLayout(panelEditor, BoxLayout.X_AXIS));
		panelEditor.add(textEditor);
		panelCentral.add(scrollPaneEditor, BorderLayout.CENTER);

		panelMsg = new JPanel();
		panelMsg.addKeyListener(keyListener);
		panelMsg.setLayout(new BoxLayout(panelMsg, BoxLayout.X_AXIS));
		panelMsg.setSize(panelMsg.getSize().width, 100);

		scrollPaneMsg = new JScrollPane(panelMsg);
		scrollPaneMsg
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneMsg
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneMsg.addKeyListener(keyListener);
		scrollPaneMsg.setPreferredSize(new Dimension(0, 100));

		textMsg = new JTextArea();
		panelMsg.add(textMsg);
		textMsg.setEditable(false);
		textMsg.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCentral.add(scrollPaneMsg, BorderLayout.SOUTH);
		textMsg.addKeyListener(keyListener);

		panelFooter = new JPanel();
		panelCompilador.add(panelFooter, BorderLayout.SOUTH);
		panelFooter.setLayout(new GridLayout(1, 2, 0, 0));
		panelFooter.addKeyListener(keyListener);
		panelFooter.addKeyListener(keyListener);

		lbStatus = new JLabel("N\u00E3o modificado");
		lbStatus.addKeyListener(keyListener);
		panelFooter.add(lbStatus);

		lbFilePath = new JLabel("");
		lbFilePath.addKeyListener(keyListener);
		panelFooter.add(lbFilePath);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	}

	public JButton getBtnNovo() {
		return btnNovo;
	}

	public JButton getBtnAbrir() {
		return btnAbrir;
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public JButton getBtnCopiar() {
		return btnCopiar;
	}

	public JButton getBtnColar() {
		return btnColar;
	}

	public JButton getBtnRecortar() {
		return btnRecortar;
	}

	public JButton getBtnCompilar() {
		return btnCompilar;
	}

	public JButton getBtnGerarCod() {
		return btnGerarCod;
	}

	public JButton getBtnEquipe() {
		return btnEquipe;
	}

	public JLabel getLblStatus() {
		return lbStatus;
	}

	public JTextArea getTextEditor() {
		return textEditor;
	}

	public JTextArea getTextMsg() {
		return textMsg;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getLbStatus() {
		return lbStatus;
	}

	public static String getCaminhoicones() {
		return caminhoIcones;
	}

	public JLabel getLbFilePath() {
		return lbFilePath;
	}

}
