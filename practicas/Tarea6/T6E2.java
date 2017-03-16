import java.io.*;

public class T6E2 {

	public static String[] palabras = new String [100];  
	public static String[] traductor = new String [100];
	public static String traduce ;
	public static int contador , i ;
	public static int opc;




	public static void CrearDiccionario(BufferedReader entrada , int i , String palabras[] , String traductor []) {

		try {

			System.out.println("Escribe la palabra en español: "); 
			palabras[i] = entrada.readLine();

			System.out.println("Escribe la palabra en ingles: ");
			traductor[i] = entrada.readLine();

		} catch (Exception e) { }
	}

	public static void Traducir(BufferedReader entrada , int i , String traduce , String palabras[] , String traductor[] ) {
		try {
			System.out.print("Introducir la palabra que desea traducir (ingles o espanol): ");
			traduce = entrada.readLine();




			for(i = 0; i< palabras.length; i++){
				if(traduce.equalsIgnoreCase(palabras[i])){ 
					System.out.println("Traduccion: " + traductor[i]);
				}

			}
			for(i = 0; i< traductor.length; i++){
				if(traduce.equalsIgnoreCase(traductor[i])){
					System.out.println("Traduccion: " + palabras[i]);

				}

			}

		}  catch	(Exception e) { }
	}







	public static void main (String [] args ){
		boolean again = true;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		while (again == true && contador < 100) {

			try {

				System.out.println  ("Deseas agregar una palabra? 1 si / 2 no ");
				opc = Integer.parseInt (entrada.readLine());

				if (opc == 1) {

					contador ++;
					again = true;

				} else if (opc == 2) {
					
					break;
				}
			}catch (Exception e) { }

			T6E2.CrearDiccionario (entrada , i , palabras , traductor );
			i++;
		}

		while (again == true) {

			try {

				System.out.println  ("Deseas traducir una palabra? 1 si / 2 no ");
				opc = Integer.parseInt(entrada.readLine());



				if (opc == 1) {

					
					T6E2.Traducir(entrada , i , traduce , palabras , traductor );
					again = true;
					
				} else if (opc == 2) {

					break;
				}
			} catch (Exception e) { }

		} 
	}
}

