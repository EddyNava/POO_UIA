import java.util.Scanner;

public class Tarea4ejercicio4 {
	public static void main (String [] args) {

		int number = 0, value1 = 0, value2 = 0, value3 = 0, value4 = 0, value5 = 0, minimum = 0, maximum = 0;
		int range = 0, sum = 0;

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


		// Count

		// Mean 

		// Median

		// Mode

		// Standard Deviation

		// Variance

		// Midrange

	}
}