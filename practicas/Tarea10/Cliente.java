public class Cliente {

	private String nombre;

	public Cliente () {
		this.nombre = "Edgardo";
	}

	public String getNombre() {
		return this.nombre;
	}

	public static void imprimeNombre () {
		getNombre();
	}
}