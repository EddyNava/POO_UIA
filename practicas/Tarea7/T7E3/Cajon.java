import java.io.*;

public class Cajon {
	
	private int numcajon;
	private String tipocajon;

	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public void setNumCajon (int pimpLeeInt()) {
		this.numcajon = pimpLeeInt;
	}

	public int getNumCajon () {
		return numcajon;
	}

	public void setTipoCajon (String pimpLeeString()) {
		this.tipocajon = pimpLeeString();
	}

	public String getTipoCajon () {
		return tipocajon;
	}


	private int leeInt() {
		int int_in = 0;
		try{
			dato = entrada.readLine();
			int_in = Integer.parseInt(dato);
		}catch(IOException e){}

		return int_in;
	}

	private String leeString() {
		
		try{

			dato = entrada.readLine();
			
		}catch(IOException e){}

		return dato;
	}

	private String pimpLeeInt() {
		System.out.println("Introduce el numero de cajon");
		return leeInt();
	}

	private String pimpLeeString() {
		System.out.println("Introduce tipo de cajon");
		return leeString();
	}
}