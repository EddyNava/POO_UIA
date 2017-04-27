
public class Lector {
	
	private String dato;
	private int opcion;
	private float numero;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public float leeFloat() {
		numero = 0;
		try{
			dato = br.readLine();
			numero = Float.parseFloat(dato);
		}catch(NumberFormatException e){
			System.out.println("Carácter inválido");
			return numero;
		}catch(IOException e){}
		return numero;
	}

	public int leeInt() {
		opcion = 0;
		try{
			dato = br.readLine();
			opcion = Integer.parseInt(dato);
		}catch(NumberFormatException e){
			System.out.println("Carácter inválido");
			return opcion;
		}catch(IOException e){}
		return opcion;
	}	

	public String leeString() {
		try{
			dato = br.readLine();
		}catch(IOException e) {}
		return dato;
	}
}