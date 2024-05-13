package mueblesypiezasExamenJPA.controladores;

import mueblesypiezasExamenJPA.model.Mueble;

public class ControladorMueble extends Controlador {

	
	
	private static ControladorMueble instance = null;
	
	/**
	 * 
	 */
	public ControladorMueble() {
		super(Mueble.class, "20240510-mueblesypiezasJPA");
	}
	
	/**
	 * Singleton.
	 * @return
	 */
	public static ControladorMueble getInstance() {
		if (instance == null) {
			instance = new ControladorMueble();
		}
		return instance;
	}
	


}
