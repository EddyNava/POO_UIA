public class EstacionamientoTest {

	private Lector reader = new Lector();
	private TicketPension ticketP = new TicketPension();
	private TicketHoras ticketH = new TicketHoras();
	private int opc;
	
	public static void main(String[] args) {
		
		System.out.println("*  Sm4rtParking4U  *");
		System.out.println("1.- Estacionamiento ");
		System.out.println("2.- Pensión");

		switch(opc = reader.leeInt()) {

			case 1:
			System.out.println("Estacionamiento");
			ticketH.imprimeTicketHoras ();

			break;

			case 2:
			System.out.println("Pensión");
			ticketP.imprimeTicketPension();

			break;

			default:
			System.out.println("Opción inválida");


			break;

		}

	}
}