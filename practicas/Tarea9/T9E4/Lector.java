import java.io.*;

public class Lector {

	private String dato = " ";
	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));


	public String leeString() {
		try{
			this.dato = entrada.readLine();

		} catch(IOException e) {}

		return this.dato;
	}


}