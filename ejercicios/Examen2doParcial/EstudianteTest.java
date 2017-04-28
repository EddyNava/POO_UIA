public class EstudianteTest {
	
	public static void main(String[] args) {

		Estudiante e1 = new Estudiante();

		System.out.println();
		System.out.println(e1.getNoEstudiante());
		System.out.println(e1.getNombre());
		System.out.println(e1.getFechaNacimiento());
		System.out.println(e1.getPuntuacion());
		System.out.println(e1.getNoDeEstudiantes());

		Estudiante e2 = new Estudiante("25", "Edgardo", "24/08/88", 10, 1);

		System.out.println();
		System.out.println(e2.getNoEstudiante());
		System.out.println(e2.getNombre());
		System.out.println(e2.getFechaNacimiento());
		System.out.println(e2.getPuntuacion());
		System.out.println(e1.getNoDeEstudiantes());
	}
}