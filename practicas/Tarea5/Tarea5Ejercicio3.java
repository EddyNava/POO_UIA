import java.io.*;
public class Tarea5Ejercicio3 {
  public static void main(String[] args)throws IOException{

    int alumno = 10;

    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    float [] calificacion = new float [alumno];
    String [] nombre = new String [alumno];
    String [] nota = new String [4];
    nota[0] = "reprobado.";
    nota[1] = "bien.";
    nota[2] = "notable.";
    nota[3] = "sobresaliente.";

    System.out.println("Se almacenará el nombre y calificación de 10 alumnos.");

    for(int i = 0 ; i < alumno ; i++) {
      System.out.println("Introducir el nombre del alumno "+ (i+1) +":");
      nombre[i] = entrada.readLine();

      try {  
        do {
          System.out.println("Introduce la calificación del alumno "+ (i+1) +":");
          calificacion[i] = Float.parseFloat(entrada.readLine());
        } while(calificacion[i] < 0 && calificacion[i] >10);
        System.out.println();

      }
      catch (Exception e) {} 
    }

    for (int i = 0 ; i < alumno ; i++) {
      if(calificacion[i] >= 0 && calificacion[i] <= 4.9){
        System.out.println("Alumno "+ (i+1) + ": " + nombre[i] + ", " + calificacion[i] + ", " + nota[0]);
      }
      else if(calificacion[i] >= 5  && calificacion[i] <= 6.9){
        System.out.println("Alumno "+ (i+1) + ": " + nombre[i] + ", " + calificacion[i] + ", " + nota[1]);
      }
      else if(calificacion[i] >= 7  && calificacion[i] <= 8.9){
        System.out.println("Alumno "+ (i+1) + ": " + nombre[i] + ", " + calificacion[i] + ", " + nota[2]);
      }
      else if(calificacion[i] >= 9  && calificacion[i] <= 10){
        System.out.println("Alumno "+ (i+1) + ": " + nombre[i] + ", " + calificacion[i] + ", " + nota[3]);
      }
    }

  }
}