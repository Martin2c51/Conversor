package proceso_aplicacion;
import javax.swing.JOptionPane;

import conversiones.conversor_moneda.conversor_moneda;


public class desarrollo {
	
	public   void iniciar()  {
	
	
		// menú de opciones
		
		Object [] opciones ={"Conversor de Moneda"}; 
		Object opcion_elegir = JOptionPane.showInputDialog(null,"Seleccione un opción de conversión", "Menú",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
		String opcion_elegida =(String)opcion_elegir;
		
	
		if (opcion_elegida!=null) {
			
			switch (opcion_elegida){
			
			case "Conversor de Moneda" :
				
				conversor_moneda conversorMoneda = new conversor_moneda();
				conversorMoneda.obtener_datos();
				break;
				
				
			
			default:
				break;
				
			}
			
		}
		
	       
	}
		
		
}

