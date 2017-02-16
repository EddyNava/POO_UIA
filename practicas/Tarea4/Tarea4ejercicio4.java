import java.util.Scanner;
import java.lang.Math;

public class Tarea4ejercicio4 {
	public static void main (String [] args) {

		int number = 0, value1 = 0, value2 = 0, value3 = 0, value4 = 0, value5 = 0, minimum = 0, maximum = 0;
		int range = 0, sum = 0, mean = 0, count = 0;
		double variance = 0, StdDev = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Eddy's calculator");
		

		int i = 1;

		System.out.println("Give me the 1st number: ");
		value1 = scanner.nextInt();
		System.out.println("Give me the 2nd number: ");
		value2 = scanner.nextInt();
		System.out.println("Give me the 3rd number: ");
		value3 = scanner.nextInt();
		System.out.println("Give me the 4th number: ");
		value4 = scanner.nextInt();
		System.out.println("Give me the 5th number: ");
		value5 = scanner.nextInt();
		

		// Minimum

		if (value1 < value2 && value1 < value3 && value1 < value4 && value1 < value5 ) {

			System.out.println("The Minimum is: " + value1 );
			minimum = value1;

		} else if (value2 < value1 && value2 < value3 && value2 < value4 && value2 < value5 ) {

			System.out.println("The Minimum is: " + value2 );
			minimum = value2;

		} else if (value3 < value1 && value3 < value2 && value3 < value4 && value3 < value5 ) {

			System.out.println("The Minimum is: " + value3 );
			minimum = value3;

		} else if (value4 < value3 && value4 < value5 && value4 < value1 && value4 < value2 ) {

			System.out.println("The Minimum is: " + value4 );
			minimum = value4;

		} else {

			System.out.println("The Minimum is: " + value5 );
			minimum = value5;

		}

		// Maximum

		if (value1 > value2 && value1 > value3 && value1 > value4 && value1 > value5 ) {

			System.out.println("The Maximum is: " + value1 );
			maximum = value1;

		} else if (value2 > value1 && value2 > value3 && value2 > value4 && value2 > value5 ) {

			System.out.println("The Maximum is: " + value2 );
			maximum = value2;

		} else if (value3 > value1 && value3 > value2 && value3 > value4 && value3 > value5 ) {

			System.out.println("The Maximum is: " + value3 );
			maximum = value3;

		} else if (value4 > value3 && value4 > value5 && value4 > value1 && value4 > value2 ) {

			System.out.println("The Maximum is: " + value4 );
			maximum = value4;

		} else {

			System.out.println("The Maximum is: " + value5 );
			maximum = value5;

		}

		// Range

		range = maximum - minimum;
		System.out.println("The Range is: " + range );

		// Sum
		sum = value1 + value2 + value3 + value4 + value5;
		System.out.println("The Sum is: " + sum );


		/* Count
		* Count es para contar el numero de valores ingresados.
		* en este caso no varia ya que esta definido el numero de valores a ingresar
		*/ 
		count = 5;
		System.out.println( "The count is: " + count );

		// Mean 

		mean = sum / 5;
		System.out.println("The Mean is: " + mean );


		/* Median
		* Median es el valor que se encuentra en medio de los valores recibidos, por ejemplo
		* si se reciben 5 numeros el Median serìa el 3er valor una vez acomodados los numeros de
		* menor a mayor, si se reciben 8 numeros, median sería el promedio de la suma entre el
		* 4to valor y el 5to
		*/
		System.out.println( "The Median is:" );

		/* Mode
		*El valor que se repite más veces
		*/
		
		//Variance

		variance = (((value1 - mean)*(value1 - mean)) + ((value2 - mean)*(value2 - mean)) + ((value3 - mean)*(value3 - mean)) + ((value4 - mean)*(value4 - mean)) + ((value5 - mean)*(value5 - mean))) / (count - 1);
		System.out.println("The Variance is: " + variance );

		// Standard Deviation

		StdDev = Math.sqrt(variance);
		System.out.printf("The Standard Deviation is: " + StdDev );

		// Midrange

	}
}