public class TicketPension extends Ticket {

	protected Fecha fecha = new Fecha();
	private int[] ret_fechaSalida = new int[3];
	private int[] ret_fechaEntrada = new int[3];
	
	public TicketPension() {
		super();
	}

	public void setFechaEntrada () {
		fecha.setFecha();
	}

	public void getFechaEntrada () {
		fecha.getFecha (ret_fechaEntrada);
	}

	public void setFechaSalida () {
		fecha.setFecha ();
	}

	public void getFechaSalida () {
		fecha.getFecha (ret_fechaSalida);
	}

	public void imprimeFechaEntrada() {
		fecha.getFecha (ret_fechaEntrada);
	}

	public void imprimeFechaSalida() {
		fecha.getFecha (ret_fechaSalida);
	}

	public void imprimeTicketPension() {
		imprimeTicket();
		imprimeFechaEntrada();
		imprimeFechaSalida();
	}

}