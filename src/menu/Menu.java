package menu;
/**
 * Clase para ejecutar menu de aplicacion
 * Mostramos menu y esperamos entrada de opcion por teclado para ejecutarla.
 *@param Leer.datoInt  leer entrada teclado.
 *@param continuar se establece en false o true para posterior uso.
 *@author Jose Luis Alfosea
 *@see aplcacion.Aplicacion   y   leer.Leer
 *@version 1.0
 *@sice :04/02/2024
 */
import app.Aplicacion;
import leer.Leer;

public class Menu {
/**
 * Este Manin hace uso de los metodos de Aplicacion y Leer.
 * @param args
 */
	public static void main(String[] args) {
		Aplicacion.Mensaje_Inicial();

		boolean continuar = true;

		do {

			Aplicacion.Opciones_Menu();

		switch (Leer.datoInt()) {
			case 1:

				break;
			case 2:
		

				break;
			case 3:

				break;
	
			default:
				// Se sale del programa
				continuar = false;
		}

		} 
		while (continuar);

			Aplicacion.Mensaje_Fin(); 
			}
	}

