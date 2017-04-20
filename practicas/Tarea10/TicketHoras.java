public class TicketHoras extends Ticket {

	private Tiempo hora;
	private int[] ret_horaEntrada = new int[3];
	private int[] ret_horaSalida = new int[3];

	
	public TicketHoras() {
		super();
		hora = new Tiempo();
	}

	public void setHoraEntrada () {
		hora.setTiempo ();
	}

	public void getHoraEntrada () {
		hora.getTiempo (ret_horaEntrada[3]);
	}

	public void setHoraSalida () {
		hora.setTiempo ();
	}

	public void getHoraSalida () {
		hora.getTiempo (ret_horaSalida[3]);
	}

	public void imprimeHoraEntrada() {
		System.out.println ( "Entrada: " + hora.imprimeHora (ret_horaEntrada) );
	}

	public void imprimeHoraSalida() {
		System.out.println ( "Salida: " + hora.imprimeHora(ret_horaSalida) );
	}

	public void imprimeTicketHoras() {
		imprimeFolio();
		imprimeHoraEntrada();
		imprimeHoraSalida();

	}

}