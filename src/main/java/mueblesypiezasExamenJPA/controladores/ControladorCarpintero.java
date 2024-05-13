package mueblesypiezasExamenJPA.controladores;

import mueblesypiezasExamenJPA.model.Carpintero;

public class ControladorCarpintero extends Controlador {

	
	private static ControladorCarpintero instance = null;
	
	/**
	 * 
	 */
	public ControladorCarpintero() {
		super(Carpintero.class, "20240510-mueblesypiezasJPA");
	}
	
	/**
	 * Singleton.
	 * @return
	 */
	public static ControladorCarpintero getInstance() {
		if (instance == null) {
			instance = new ControladorCarpintero();
		}
		return instance;
	}
	
}
