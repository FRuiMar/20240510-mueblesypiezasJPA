package mueblesypiezasExamenJPA.view;

import java.util.List;

import mueblesypiezasExamenJPA.controladores.ControladorMueble;
import mueblesypiezasExamenJPA.controladores.ControladorPieza;
import mueblesypiezasExamenJPA.model.Mueble;
import mueblesypiezasExamenJPA.model.Pieza;

public class DatosTabla {

	/** 
	 * 
	 * @return
	 */
	public static String[] getTitulosColumnas() {
		return new String[] {"Id", "IdMueble", "Mueble", "Nombre", "Cantidad"};
	}
	

	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Object[][] getDatosDeTabla() {
		// Obtengo todos los piezas.
		List<Pieza> listaPiezas = (List<Pieza>) ControladorPieza
				.getInstance().findAll();
		
		// Obtengo todas los muebles.         // NO SER USA PORQUE TIENE ASOCIACIONES HECHAS, NO VOY A USAR FOREIGN KEY A TRAVES DE LAS IDS.
		@SuppressWarnings("unused")
		List<Mueble> listaMuebles = (List<Mueble>) ControladorMueble
				.getInstance().findAll();
		
		
		
		// Preparo una estructura para pasar al constructor de la JTable
		Object[][] datos = new Object[listaPiezas.size()][5];
		
		// Cargo los datos de la lista de los contratos en la matriz de los datos.
		for (int i = 0; i < listaPiezas.size(); i++) {
			Pieza p = listaPiezas.get(i);
			
			datos[i][0] = p.getId();
			datos[i][1] = p.getMueble().getId();
			
			datos[i][2] = p.getMueble();
//			for (Mueble o : listaMuebles) {							METODO NORMAL A TRAVES DE LA FOREIGN KEY
//				if (o.getId() == p.getIdMueble()) {					SI NO HUBIERA
//					datos[i][2] = o.getDescripcion();				ASOCIACION MANY TO ONE, O ONE TO MANY, ETC.
//				}
//			}

			datos[i][3] = p.getNombre();
			datos[i][4] = p.getCantidad();
	
			
		}
		
		return datos;
	}
	
	


	
	
	
	
	
	
	
	public static String[] getTitulosColumnasMuebles() {
		return new String[] {"Id", "Distribuidor", "TipoMueble", "Carpinter",  "Nombre", "Serie", "Color"};
	}
	

	
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Object[][] getDatosDeTablaMuebles() {


		// Obtengo todas los usuarios.         // NO SER USA PORQUE TIENE ASOCIACIONES HECHAS, NO VOY A USAR FOREIGN KEY A TRAVES DE LAS IDS.
		List<Mueble> listaMuebles = (List<Mueble>) ControladorMueble
				.getInstance().findAll();
		
		
		
		// Preparo una estructura para pasar al constructor de la JTable
		Object[][] datos = new Object[listaMuebles.size()][7];
		
		// Cargo los datos de la lista de los contratos en la matriz de los datos.
		for (int i = 0; i < listaMuebles.size(); i++) {
			Mueble o = listaMuebles.get(i);
			
			datos[i][0] = o.getId();
			datos[i][1] = o.getDistribuidor();
			
			datos[i][2] = o.getTipomueble();
			datos[i][3] = o.getCarpintero();

			datos[i][4] = o.getNombre();
			datos[i][5] = o.getSerie();
			datos[i][6] = o.getColor();
	
			
		}
		
		return datos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
