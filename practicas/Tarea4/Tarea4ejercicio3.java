public class Tarea4ejercicio3 {

	public static void main(String[] args) {

		String sentence = "Hello, my good friend!"; 
		int whitespace = sentence.indexOf(" "); 
		System.out.println("First word is: " + sentence.substring(0, whitespace));
		int firstWhitespace = sentence.indexOf(" "); 
		int secondWhitespace = sentence.indexOf(" ", firstWhitespace + 1); 
		System.out.println("Second word is: " + sentence.substring(firstWhitespace + 1, secondWhitespace));

	}
}