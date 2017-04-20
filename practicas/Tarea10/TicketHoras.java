public class TicketHoras extends Ticket {

	private Tiempo hora = new Tiempo();
	private int[] ret_horaEntrada = new int[3];
	private int[] ret_horaSalida = new int[3];

	
	public TicketHoras() {
		super();
	}

	public void setHoraEntrada () {
		hora.setTiempo ();
	}

	public void getHoraEntrada () {
		hora.getTiempo (ret_horaEntrada);
	}

	public void setHoraSalida () {
		hora.setTiempo ();
	}

	public void getHoraSalida () {
		hora.getTiempo (ret_horaSalida);
	}

	public void imprimeHoraEntrada() {
		hora.imprimeHora (ret_horaEntrada);
	}

	public void imprimeHoraSalida() {
		hora.imprimeHora(ret_horaSalida);
	}

	public void imprimeTicketHoras() {
		imprimeFolio();
		imprimeHoraEntrada();
		imprimeHoraSalida();

	}

}