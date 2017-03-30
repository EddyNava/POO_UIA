
//Nombre
public class Coche { 

	//Atributos
	private String tamanio;
	private String placa;

	//Constructores
	public Coche (){
		this.tamanio = null;
		this.placa = null;
	}

	public Coche (String tamanio_param , String placa_param) {
		this.tamanio = tamanio_param;
		this.placa = placa_param;
	}

	//Metodos

	public void setTamanio (String tamanio_param) {
		this.tamanio = tamanio_param;
	}

	public String getTamanio () {
		return this.tamanio;
	}

	public void setPlaca (String placa_param) {
		this.placa = placa_param;
	}

	public String getPlaca () {
		return this.placa;
	}

	public void printCoche () {

		System.out.println("Placa: "+ this.placa);
		System.out.println("Tamaño: "+ this.tamanio);
	}

}