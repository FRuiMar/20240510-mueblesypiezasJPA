package mueblesypiezasExamenJPA;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mueblesypiezasExamenJPA.controladores.ControladorPieza;
import mueblesypiezasExamenJPA.model.Pieza;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		List<Pieza> lista = (List<Pieza>) ControladorPieza.getInstance().findAll();
		
//		for(int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i).getNombre());
//		}
//		
		
		for (Pieza pieza : lista) {
			System.out.println(pieza.getNombre());
		}
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
