package mueblesypiezasExamenJPA.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JToolBar;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.event.ChangeListener;

import javax.swing.event.ChangeEvent;

public class PanelPieza extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfNombre;
	private JTable table;
	private JTextField jtfId;
	JScrollPane scrollPane; // piezas
	JScrollPane scrollPane_1; // muebles
	JSlider jslider;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public PanelPieza() {
		setLayout(new BorderLayout(0, 0));

		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);

		/// ------------- BOTONES --------------////

////////////////////PRIMERO        /////////////////////////	
		JButton btnPrimero = new JButton("");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				cargarPrimero();
			}
		});
		btnPrimero.setIcon(new ImageIcon(PanelPieza.class.getResource("/res/gotostart.png")));
		toolBar.add(btnPrimero);

////////////////////ANTERIOR        /////////////////////////	
		JButton btnAnterior = new JButton("");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				cargarAnterior();

//System.out.println("Curso id seleccionado: " +				//ESTO CAMBIA POR EL JCOMBO D LAS.
//((Curso) jcbCurso.getSelectedItem()).getId());				// REVISAR EL RESTO.
			}

		});
		btnAnterior.setIcon(new ImageIcon(PanelPieza.class.getResource("/res/previous.png")));
		toolBar.add(btnAnterior);

////////////////////SIGUIENTE        /////////////////////////	
		JButton btnSiguiente = new JButton("");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				cargarSiguiente();
			}
		});
		btnSiguiente.setIcon(new ImageIcon(PanelPieza.class.getResource("/res/next.png")));
		toolBar.add(btnSiguiente);

////////////////////ULTIMO        /////////////////////////	
		JButton btnUltimo = new JButton("");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				cargarUltimo();
			}
		});
		btnUltimo.setIcon(new ImageIcon(PanelPieza.class.getResource("/res/gotoend.png")));
		toolBar.add(btnUltimo);

////////////////////NUEVO        /////////////////////////			
		JButton btnNuevo = new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				nuevo();
			}
		});
		btnNuevo.setIcon(new ImageIcon(PanelPieza.class.getResource("/res/nuevo.png")));
		toolBar.add(btnNuevo);

////////////////////GUARDAR       /////////////////////////		
		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				guardar();
			}
		});
		btnGuardar.setIcon(new ImageIcon(PanelPieza.class.getResource("/res/guardar.png")));
		toolBar.add(btnGuardar);

////////////////////BORRAR       /////////////////////////		
		JButton btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				borrar();
			}
		});
		btnBorrar.setIcon(new ImageIcon(PanelPieza.class.getResource("/res/eliminar.png")));
		toolBar.add(btnBorrar);

//////////////////-------       FIN DE LOS  BOTONES     ------//////////////////

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Gestión de Piezas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(5, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(5, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(5, 0, 5, 5);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		panel.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 2;
		panel.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Cantidad: ");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

		jslider = new JSlider();
		jslider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

			}
		});
		jslider.setMinorTickSpacing(1);
		jslider.setMajorTickSpacing(1);
		jslider.setValue(0);
		jslider.setMaximum(5);
		jslider.setPaintLabels(false);// al final no uso esto, no aparece en el dibujo.
		jslider.setSnapToTicks(true);// hace que no se quede el indicador en medio de los ticks.
		jslider.setPaintTicks(true);

		GridBagConstraints gbc_jslider = new GridBagConstraints();
		gbc_jslider.fill = GridBagConstraints.HORIZONTAL;
		gbc_jslider.insets = new Insets(0, 0, 5, 5);
		gbc_jslider.gridx = 1;
		gbc_jslider.gridy = 3;
		panel.add(jslider, gbc_jslider);

		JLabel jlblCantidadMuebles = new JLabel("New label");
		GridBagConstraints gbc_jlblCantidadMuebles = new GridBagConstraints();
		gbc_jlblCantidadMuebles.insets = new Insets(0, 0, 5, 0);
		gbc_jlblCantidadMuebles.gridx = 2;
		gbc_jlblCantidadMuebles.gridy = 3;
		panel.add(jlblCantidadMuebles, gbc_jlblCantidadMuebles);

		JLabel lblNewLabel_4 = new JLabel("Pieza:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(550, 150)); ////// tamaño FIJO SCROLLPANE
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		panel.add(scrollPane, gbc_scrollPane);

		// Inicializamos la tabla con los datos.
		table = new JTable(DatosTabla.getDatosDeTabla(), DatosTabla.getTitulosColumnas());
		scrollPane.setViewportView(table);

		JLabel lblNewLabel_6 = new JLabel("Listado Muebles");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridwidth = 3;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 5;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);

		JLabel lblNewLabel_5 = new JLabel("Mueble");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 6;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);

		JButton jbtVerMueble = new JButton("Ver Mueble");
		jbtVerMueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		GridBagConstraints gbc_jbtVerMueble = new GridBagConstraints();
		gbc_jbtVerMueble.gridx = 2;
		gbc_jbtVerMueble.gridy = 6;
		panel.add(jbtVerMueble, gbc_jbtVerMueble);
		
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(250, 80)); ////// tamaño FIJO SCROLLPANE
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 6;
		panel.add(scrollPane_1, gbc_scrollPane_1);

		
		// Inicializamos la tabla con los datos.
		table_1 = new JTable(DatosTabla.getDatosDeTablaMuebles(), DatosTabla.getTitulosColumnasMuebles());
		scrollPane_1.setViewportView(table_1);
		


	}

}
