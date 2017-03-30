import Lee.*;

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

	//Metodos
	public void setTamanio (String tamanio_param) {
		this.tamanio = tamanio_param;
	}

	public String getTamanio () {
		return tamanio;
	}

	public void setPlaca (String placa_param) {
		this.placa = placa_param;
	}

	public String getPlaca () {
		return placa;
	}
}