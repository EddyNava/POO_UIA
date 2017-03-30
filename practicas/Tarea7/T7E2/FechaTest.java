public class FechaTest {

	public static void main( String[] agrs ) {
		
		Fecha fecha = new Fecha();
		int ret_fecha[] = new int[3];
		fecha.setFecha( );
		fecha.getFecha(ret_fecha);

		Fecha fecha_dia = new Fecha();
		int ret_fecha_dia[] = new int[3];
		fecha_dia.setFecha( 24 );
		fecha_dia.getFecha(ret_fecha_dia);

		Fecha fecha_dia_mes = new Fecha();
		int ret_fecha_dia_mes[] = new int[3];
		fecha_dia_mes.setFecha( 24 , 8 );
		fecha_dia_mes.getFecha(ret_fecha_dia_mes);

		Fecha fecha_dia_mes_anio = new Fecha();
		int ret_fecha_dia_mes_anio[] = new int[3];
		fecha_dia_mes_anio.setFecha( 24 , 8 , 1988 );
		fecha_dia_mes_anio.getFecha(ret_fecha_dia_mes_anio);


		Fecha.amdFecha(ret_fecha);
		Fecha.amdFecha(ret_fecha_dia);
		Fecha.amdFecha(ret_fecha_dia_mes);
		Fecha.amdFecha(ret_fecha_dia_mes_anio);	

		Fecha.dmaFecha(ret_fecha);
		Fecha.dmaFecha(ret_fecha_dia);
		Fecha.dmaFecha(ret_fecha_dia_mes);
		Fecha.dmaFecha(ret_fecha_dia_mes_anio);	


	}
}