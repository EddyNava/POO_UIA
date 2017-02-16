import java.util.Scanner;

	public class Tarea3ejercicio2 {
	
		public static void main(String[] args) {

			int num = 0;

			Scanner scanner = new Scanner(System.in);
			System.out.println("Type a number between 1 and 1000");
			num = scanner.nextInt();

			if (1 <= num && num <= 1000) {
			 	if (num % 2 == 0){
			 
			 	System.out.println("The number you entered " + num + ", is Even");	
			 
			 	} else {
			 	System.out.println("The number you entered " + num + ", is Odd");
			   		}
			} else {

				System.out.println("The number you entered is not between 1 and 1000");
		}
	}
