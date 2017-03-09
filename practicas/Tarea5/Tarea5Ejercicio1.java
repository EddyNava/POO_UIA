import java.io.*;
import java.util.Arrays;

public class Tarea5Ejercicio1 {
	
	public static void main(String [ ] args) {

		int size = 0, mediana = 0;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {

			while (size % 2 == 0){

				System.out.println("Vamos a calcular la mediana");
				System.out.println("¿De cuantos numeros quieres obtener la mediana?");
				size = Integer.parseInt(entrada.readLine());

				if (size % 2 == 0) {
					System.out.println("Intenta nuevamente");
					System.out.println("Debes ingresar un numero impar");

				}
			}

			int [] numeros = new int [size];

			for (int val = 0 ; val < size ; val++ ){

				System.out.println("Dame el número de la posición " + (val+1) + " : ");
				numeros [val] = Integer.parseInt(entrada.readLine());

			}
			Arrays.sort(numeros);
			mediana = (size / 2);
			

			//System.out.println("La mediana es: " + numeros[mediana]);
			for (int i = mediana ; i = mediana ; i++);

				System.out.println("La mediana es: " + numeros[i]);
			
		}
		catch(Exception e) { }

	}
} 
