import java.util.Scanner;

    public class Tarea3ejercicio3 {

        public static void main(String[] args) {

    	   int month = 0;

    	   Scanner scanner = new Scanner(System.in);
    	   System.out.println(" Give a number between 1 and 12 to choose a month");
    	   month = scanner.nextInt();

    	   if (1 <= month && month <= 12) {

    		  if (month == 1) {

    			System.out.println("The number you entered " + month + ", corresponds to January");

    		  } else if (month == 2) {

    			System.out.println("The number you entered " + month + ", corresponds to February");

    		  } else if (month == 3) {

    			System.out.println("The number you entered " + month + ", corresponds to March");

    		  } else if (month == 4) {

    			System.out.println("The number you entered " + month + ", corresponds to April");

    		  } else if (month == 5) {

    			System.out.println("The number you entered " + month + ", corresponds to May");

    		  } else if (month == 6) {

    			System.out.println("The number you entered " + month + ", corresponds to June");

    		  } else if (month == 7) {

    			System.out.println("The number you entered " + month + ", corresponds to July");

    		  } else if (month == 8) {

    			System.out.println("The number you entered " + month + ", corresponds to August");

    		  } else if (month == 9) {

    			System.out.println("The number you entered " + month + ", corresponds to September");

    		  } else if (month == 10) {

    			System.out.println("The number you entered " + month + ", corresponds to October");

    		  } else if (month == 11) {

    			System.out.println("The number you entered " + month + ", corresponds to December");

    		  } else {

    			System.out.println("The number you entered " + month + ", corresponds to December");

    		  }

    	   } else {
    		

    		  System.out.println("The number you entered " + month + ", does not belong to a month");
    	   }
        }
    }