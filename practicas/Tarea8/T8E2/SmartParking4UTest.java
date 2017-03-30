
public class SmartParking4UTest {
	
	private String tamanio;
	private String placa;

	public static void main (String[] args ){

		Tiempo tiempo = new Tiempo ();
		int ret_tiempo[] = new int[3];
		tiempo.getTiempo(ret_tiempo);

		Coche coche = new Coche ();
		String ret_tamanio = new String ();
		String ret_placa = new String ();
		coche.setTamanio("Chico");
		coche.getTamanio (ret_tamanio);
		coche.setPlaca("NAV0824");
		coche.getPlaca (ret_placa);


		Tiempo.printTiempo (ret_tiempo);
		Coche.printTamanio(ret_tamanio);
		Coche.printPlaca(ret_placa);


	}

}