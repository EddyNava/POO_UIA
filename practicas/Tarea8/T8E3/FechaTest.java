public class FechaTest {
	
	public static void main (String[] args) {
		
		Fecha fecha = new Fecha( 24 , 8 , 1988);

		
		fecha.pimpFecha();

		fecha = null;

		System.gc();

	}	
}