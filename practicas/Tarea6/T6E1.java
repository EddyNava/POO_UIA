import java.io.*;



public class T6E1 {

	public static void Menu () {

		System.out.println (" 1.- Sumar");
		System.out.println (" 2.- Restar");
		System.out.println (" 3.- Multiplicar");
		System.out.println (" 4.- Dividir");
		System.out.println (" 5.- Salir");
		System.out.println ("Seleccione la opción deseada");
		

		return;

	}

	public static float Suma ( float val1 , float val2 ) {

		float sum;

		sum = val1 + val2;

		return sum;
	}

	public static float Resta ( float val1 , float val2 ) {

		float rest;

		rest = val1 - val2;

		return rest;
	}

	public static float Multiplica ( float val1 , float val2 ) {

		float mult;

		mult = val1 * val2;

		return mult;
	}	

	public static float Divide ( float val1 , float val2 ) {

		float div;

		if (val2 <= 0 ){

			System.out.println ("Cannot divide by zero");
			return 0;

		} else {

			div = val1 / val2;

			return div;
		}
	}


	public static void Suitche (int opc , float val1 , float val2) {

		switch (opc) {

			case 1:

			System.out.println ( "Resultado: " + T6E1.Suma( val1 , val2 ));

			break;

			case 2:

			System.out.println ("Resultado: " + T6E1.Resta( val1 , val2 ));

			break;

			case 3:

			System.out.println ("Resultado: " + T6E1.Multiplica( val1 , val2 ));

			break;

			case 4:

			System.out.println ("Resultado: " + T6E1.Divide( val1 , val2 ));

			break;

			default:

			System.out.println("Esa no es una opción valida");

			break;


		}
	}	

	public static void main (String [] args ) {

		int opc = 0;
		int val1 = 0, val2 = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));

		T6E1.Menu ();

		try{

			opc = Integer.parseInt (entrada.readLine());
			if ( opc == 5 ) {
				System.out.println("Hasta luego");
				return;
			}		

			System.out.println ("Dame el 1er operando");
			val1 = Integer.parseInt (entrada.readLine());
			System.out.println ("Dame el 2do operando");
			val2 = Integer.parseInt (entrada.readLine());

		}catch ( Exception e) {}

		T6E1.Suitche( opc , val1 , val2 );

	}

}