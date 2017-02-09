import java.util.Scanner;
public class Tarea3ejercicio4 {
	public static void main (String [] args) {

		String month = null;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the month you want on lowercase");
		month = scanner.nextLine();

switch (month) {

	case "january":
	System.out.println("January has 31 days");
	break;
	case "february":
	System.out.println("February has 28 days and every 4 years on leap-year it has 29 days");
	break;
	case "march":
	System.out.println("March has 31 days");
	break;
	case "april":
	System.out.println("April has 30 days");
	break;
	case "may":
	System.out.println("May has 31 days");
	break;
	case "june":
	System.out.println("June has 30 days");
	break;
	case "july":
	System.out.println("July has 31 days");
	break;
	case "august":
	System.out.println("August has 31 days");
	break;
	case "september":
	System.out.println("September has 30 days");
	break;
	case "october":
	System.out.println("October has 31 days");
	break;
	case "november":
	System.out.println("November has 30 days");
	break;
	case "december":
	System.out.println("December has 31 days");
	break;
	default:
	System.out.println("Invalid option please try again");
	break;

}

	}
}