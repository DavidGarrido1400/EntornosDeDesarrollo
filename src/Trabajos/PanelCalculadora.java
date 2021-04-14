package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class PanelCalculadora {

	private JFrame frame;
	private JTextField jtfNumUno;
	private JTextField jtfNumDos;
	private JTextField jtfResultado;

	static {
		setApariencia();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelCalculadora window = new PanelCalculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PanelCalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 450, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 40, 0, 0, 0, 50, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel_3 = new JLabel("Sumador");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel = new JLabel("Número 1:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		jtfNumUno = new JTextField();
		GridBagConstraints gbc_jtfNumUno = new GridBagConstraints();
		gbc_jtfNumUno.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNumUno.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNumUno.gridx = 1;
		gbc_jtfNumUno.gridy = 1;
		frame.getContentPane().add(jtfNumUno, gbc_jtfNumUno);
		jtfNumUno.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Número 2:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);

		jtfNumDos = new JTextField();
		GridBagConstraints gbc_jtfNumDos = new GridBagConstraints();
		gbc_jtfNumDos.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNumDos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNumDos.gridx = 1;
		gbc_jtfNumDos.gridy = 2;
		frame.getContentPane().add(jtfNumDos, gbc_jtfNumDos);
		jtfNumDos.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);

		jtfResultado = new JTextField();
		jtfResultado.setEnabled(false); 
		jtfResultado.setEditable(false); 
		GridBagConstraints gbc_jtfResultado = new GridBagConstraints();
		gbc_jtfResultado.insets = new Insets(0, 0, 5, 0);
		gbc_jtfResultado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfResultado.gridx = 1;
		gbc_jtfResultado.gridy = 3;
		frame.getContentPane().add(jtfResultado, gbc_jtfResultado);
		jtfResultado.setColumns(10);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sumar();
			}
		});
		panel.add(btnSumar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrarAplicacion();
			}
		});
		panel.add(btnSalir);

		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
	}

	/**
	 * Método que se ocupa de la suma gestionando los JTextField
	 */
	public void sumar() {
		// Obtener los números de cada JTextField
		int num1 = Integer.parseInt(jtfNumUno.getText());
		int num2 = Integer.parseInt(jtfNumDos.getText());
		// Realiza la suma
		int resultado = num1 + num2;
		// Mostrar resultado en la etiqueta
		jtfResultado.setText("" + resultado);
	}

	/**
	 * Método encargado de gestionar cuando la ventana se cierre
	 */
	private void cerrarAplicacion() {
		String[] opciones = { "Aceptar", "Cancelar" };
		int eleccion = JOptionPane.showOptionDialog(frame, "¿Desea cerrar la aplicación?", "Salir de la aplicación",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}

	/**
	 * Método que incorpora la apariencia de las interfaces gráficas de Windows
	 */
	public static void setApariencia() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
