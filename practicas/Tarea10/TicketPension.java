public class TicketPension extends Ticket {

	private Fecha fecha;
	private int[] ret_fechaSalida = new int[3];
	private int[] ret_fechaEntrada = new int[3];
	private Cliente cliente;
	
	public TicketPension() {
		super();
		fecha = new Fecha();
		cliente = new Cliente ();
	}

	public void setFechaEntrada () {
		fecha.setfecha();
	}

	public void getFechaEntrada () {
		fecha.getFecha(ret_fechaEntrada);
	}

	public void setFechaSalida () {
		fecha.setfecha ();
	}

	public void getFechaSalida () {
		fecha.getFecha(ret_fechaSalida);
	}

	public int imprimeFechaEntrada() {
		System.out.println ( fecha.getFecha(ret_fechaEntrada));
	}

	public int imprimeFechaSalida() {
		System.out.println ( fecha.getFecha(ret_fechaSalida) );
	}

	public static void imprimeTicketPension() {
		Ticket.imprimeFolio();
		Cliente.imprimeCliente();
		imprimeFechaEntrada(ret_fechaEntrada);
		imprimeFechaSalida(ret_fechaSalida);
	}

}