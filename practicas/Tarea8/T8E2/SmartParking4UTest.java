
public class SmartParking4UTest {
	

	public static void main (String[] args ){

		Tiempo tiempo = new Tiempo ();
		int ret_tiempo[] = new int[3];
		tiempo.getTiempo(ret_tiempo);

		Coche coche = new Coche ("chico" , "NAV0824");

		Tiempo.printTiempo (ret_tiempo);

		coche.printCoche();


	}

}