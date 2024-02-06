package leer;
/**
 * 
 * Clase para convertir cadenas String en tipo de dato Int , Float , Long ,Char.
 * Y recoger la entrada de teclado en una varible.
 * @param Sdato recoge entrada del teclado.
 * @param datoInt recoge string
 * @param datoFloat recoge string 
 * @param datoLong recoge string
 * @return sdato devuelve el valor sdato
 * @return devuelve dato convertido a tipo Int
 * @return devuelve dato convertido a tipo Float
 * @return devuelve dato convertido a tipo Long
 * @throws error en la entrada de datos
 * @author Pedro
 * @version 1.0
 * @sice :04/02/2024
 * 
 * Importamos la clases necessaria para poder leer entrada y salida de datos desde el teclado
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {
/* 
 Este Metodo es estatico con lo que podremos llamarlo sin necesidad de instanciar la clase , 
 luego declaramos la variable dato del tipo String , creamos una variable par almacenar la entrada
 de teclado  y le pasamos el valor a otra que lo almacena en buffer (flujoE) , luego damos ese 
 valor a sdato y utilizamos la contruccion try y catch para "intentar ejecutar  y sini "atrapar errores
 en tiempo de ejecucion.Y devuelve el valor de la variable sdato.
 *
 *
 *
 *@return sdato devuelve el valor sdato
 *@throws error en la entrada de datos
 */
	
	public static String dato() {
		String sdato = " ";
		try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader flujoE = new BufferedReader(isr);
				sdato = flujoE.readLine();
		} catch (IOException e) {
				System.out.println("Error " + e.getMessage());
		}
				return sdato;

	}
/*
 * @return devuelve dato tipo Int
 * @param datoInt recoge string
 * Metodo para leer una cadena de texto (string) y la convierte en entero con el Integer.parseInt y 
la devuelve.
 */
	public static int datoInt() {
		return Integer.parseInt(dato());
	}
/*
 * Metodo para leer una cadena texto y la convierte en Float y la devuelve
 */
	public static float datoFloat() {
		return Float.parseFloat(dato());
	}

	// Leer un char por teclado
/*
 * Metodo estatico que se puede llamar desde el programa sin necesidad de instanciar la clase,
 * comienza declarado una variable que inicializa con un espacio y luego usa el bloque try para manejar 
 * los errores , en try coge el valor de un caracter introducido por teclado y lo almacena en "b" y luego
 * luego se iguala "c" pero utilizando el metodo read para leer un solo byte que lle un entero de 0 a 255
 * que representa el byte leido y lo convierte a char como ascii valido y si da un error lo maneja con 
 *  IOException dando un mensaje en consola. 
 */
	public static char datoChar() {
		char c = ' ';
		try {
				java.io.BufferedInputStream b = new BufferedInputStream(System.in);
				c = (char) b.read();
		} 
		catch (IOException e) {
				System.out.println("Error al leer");
				e.printStackTrace();
		}
			return c;
	}
/*
 * Metodo que lle un string y la convierte en long y la devuelve  , y i no pyuede da una excepcion
 * "NumberFormatException".
 */
	public static long datoLong() {
		return Long.parseLong(dato());
	}

}
