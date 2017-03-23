import java.util.*;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	

	public void setFecha() {
		Calendar fecha = new GregorianCalendar();
		this.dia = fecha.get(Calendar.DAY_OF_MONTH);
		this.mes = fecha.get(Calendar.MONTH) + 1;
		this.anio = fecha.get(Calendar.YEAR);
	}

	public void setFecha(int dia_param ) {
		this.setFecha();
		this.dia = dia_param;

	}	

	public void setFecha(int dia_param , int mes_param) {
		this.setFecha();
		this.dia = dia_param;
		this.mes = mes_param;
	}

	public void setFecha(int dia_param, int mes_param, int anio_param) {
		this.dia = dia_param;
		this.mes = mes_param;
		this.anio = anio_param;
	}

	public void getFecha(int[] retorno_fecha) {
		retorno_fecha[0] = dia;
		retorno_fecha[1] = mes;
		retorno_fecha[2] = anio;

	}

	public static void dmaFecha(int[] fecha) {
		System.out.println(fecha[0]+"/"+fecha[1]+"/"+fecha[2]);
	}
	public static void amdFecha(int[] fecha) {
		System.out.println(fecha[2]+"/"+fecha[1]+"/"+fecha[0]);
	}
}