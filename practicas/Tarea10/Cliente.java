public class Cliente {
	Lector reader = new Lector();


	private String nombre;

	public Cliente () {
		this.nombre = "Edgardo";
	}

	public void setNombre(String nombre_p) {
		this.nombre = nombre_p;
	}

	public String getNombre() {
		return this.nombre;
	}
	public void pimpNombre () {
		System.out.println ("Dame el nombre del cliente: ");
		this.setNombre(reader.leeString());
	}

	public void imprimeCliente () {
		System.out.println( "Nombre: " + this.nombre );
	}
}