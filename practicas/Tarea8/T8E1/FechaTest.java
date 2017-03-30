 public class FechaTest {
	public static void main(String[] agrs) {
		
		


		Fecha fecha_const = new Fecha();
		int ret_fecha_const [] = new int[3];
		fecha_const.getFecha(ret_fecha_const);

		Fecha fecha_const_dia = new Fecha( 5 );
		int ret_fecha_const_dia [] = new int[3];
		fecha_const_dia.getFecha(ret_fecha_const_dia);

		Fecha fecha_const_dia_mes = new Fecha( 5 , 5 );
		int ret_fecha_const_dia_mes [] = new int[3];
		fecha_const_dia_mes.getFecha(ret_fecha_const_dia_mes);

		Fecha fecha_const_dia_mes_anio = new Fecha( 5 , 5 , 1984 );
		int ret_fecha_const_dia_mes_anio [] = new int[3];
		fecha_const_dia_mes_anio.getFecha(ret_fecha_const_dia_mes_anio);



		/* Fecha fecha = new Fecha();
		*  int ret_fecha[] = new int[3];
		*  fecha.setFecha( );
		*  fecha.getFecha(ret_fecha);
		*/

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


		System.out.println (" ");

		Fecha.amdFecha(ret_fecha_const);
		Fecha.amdFecha(ret_fecha_const_dia);
		Fecha.amdFecha(ret_fecha_const_dia_mes);
		Fecha.amdFecha(ret_fecha_const_dia_mes_anio);	

		System.out.println (" ");

		Fecha.dmaFecha(ret_fecha_const);
		Fecha.dmaFecha(ret_fecha_const_dia);
		Fecha.dmaFecha(ret_fecha_const_dia_mes);
		Fecha.dmaFecha(ret_fecha_const_dia_mes_anio);

		System.out.println (" ");

		// Fecha.amdFecha(ret_fecha);
		Fecha.amdFecha(ret_fecha_dia);
		Fecha.amdFecha(ret_fecha_dia_mes);
		Fecha.amdFecha(ret_fecha_dia_mes_anio);

		System.out.println (" ");
		
		// Fecha.dmaFecha(ret_fecha);
		Fecha.dmaFecha(ret_fecha_dia);
		Fecha.dmaFecha(ret_fecha_dia_mes);
		Fecha.dmaFecha(ret_fecha_dia_mes_anio);	



	}
}