package mueblesypiezasExamenJPA.controladores;

import mueblesypiezasExamenJPA.model.Tipomueble;

public class ControladorTipomueble extends Controlador {


	private static ControladorTipomueble instance = null;
	
	/**
	 * 
	 */
	public ControladorTipomueble() {
		super(Tipomueble.class, "20240510-mueblesypiezasJPA");
	}
	
	/**
	 * Singleton.
	 * @return
	 */
	public static ControladorTipomueble getInstance() {
		if (instance == null) {
			instance = new ControladorTipomueble();
		}
		return instance;
	}
	


}
	

