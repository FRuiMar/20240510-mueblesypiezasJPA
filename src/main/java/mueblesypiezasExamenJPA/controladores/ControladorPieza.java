package mueblesypiezasExamenJPA.controladores;

import mueblesypiezasExamenJPA.model.Pieza;

public class ControladorPieza extends Controlador {

	

	private static ControladorPieza instance = null;
	
	/**
	 * 
	 */
	public ControladorPieza() {
		super(Pieza.class, "20240510-mueblesypiezasJPA");
	}
	
	/**
	 * Singleton.
	 * @return
	 */
	public static ControladorPieza getInstance() {
		if (instance == null) {
			instance = new ControladorPieza();
		}
		return instance;
	}
	
	
	
	
}
