import java.util.*;


public class Fecha {

	private int dia;
	private int mes;
	private int anio;


	public Fecha () {
		setFecha();
	}

	
	public void setFecha() {
		Calendar fecha = new GregorianCalendar();
		this.dia = fecha.get(Calendar.DAY_OF_MONTH);
		this.mes = fecha.get(Calendar.MONTH);
		this.anio = fecha.get(Calendar.YEAR);

	}

	public void getFecha(int[] retorno_fecha) {
		retorno_fecha[0] = dia;
		retorno_fecha[1] = mes;
		retorno_fecha[2] = anio;

	}

	public void imprimeFecha (int [] retorno_fecha) {
		System.out.println (retorno_fecha[0]+":"+retorno_fecha[1]+":"+retorno_fecha[2]);
	}
	

}