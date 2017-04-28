public class Estudiante {
	static int noDeEstudiantes;
	private String noEstudiante;
	private String nombre;
	private String fechaNacimiento;
	private int puntuacion;  
	

	public Estudiante () {
		
		noEstudiante = "No conocido";
		nombre = "No conocido";
		fechaNacimiento = "01/01/1995";
		puntuacion = 20;
		noDeEstudiantes++;
	}
	
	public Estudiante (String noEstudiante_param, String nombre_param, String fechaNacimiento_param, int puntuacion_param, int noDeEstudiante_param) {	
		
		setNoEstudiante( noEstudiante_param );  
		setNombre( nombre_param );
		setFechaNacimiento( fechaNacimiento_param );
		setPuntuacion( puntuacion_param );
		setNoDeEstudiantes( noDeEstudiante_param );
	} 
	
	public void setNoEstudiante(String noEstudiante_param){
		noEstudiante = noEstudiante_param;
	}
	public String getNoEstudiante() {
		return noEstudiante;
	}
	public void setNombre(String nombre_param){
		nombre = nombre_param;
	}
	public String getNombre() {
		return nombre;
	}
	public void setFechaNacimiento(String fechaNacimiento_param){
		fechaNacimiento = fechaNacimiento_param;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setPuntuacion(int puntuacion_param){
		if (puntuacion_param >= 20 && puntuacion_param < 280) {
			puntuacion = puntuacion_param;
		}
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setNoDeEstudiantes(int noDeEstudiante_param){
		noDeEstudiante_param++;
		noDeEstudiantes = noDeEstudiante_param;
	}
	public int getNoDeEstudiantes() {
		return noDeEstudiantes++;
	}
	
	
	
	
	
	
}