package mueblesypiezasExamenJPA.controladores;

import mueblesypiezasExamenJPA.model.Distribuidor;

public class ControladorDistribuidor extends Controlador {

	
	
	private static ControladorDistribuidor instance = null;
	
	/**
	 * 
	 */
	public ControladorDistribuidor() {
		super(Distribuidor.class, "20240510-mueblesypiezasJPA");
	}
	
	/**
	 * Singleton.
	 * @return
	 */
	public static ControladorDistribuidor getInstance() {
		if (instance == null) {
			instance = new ControladorDistribuidor();
		}
		return instance;
	}
	
	
	
	
}
