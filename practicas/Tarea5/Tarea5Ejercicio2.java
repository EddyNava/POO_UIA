import java.io.*;
import java.util.*;

public class Tarea5Ejercicio2 {
	public static void main( String[ ] args) {

		int size = 0, numero = 0, entrada = 0, num = 0, contador = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("¿De cuantos numeros quieres el arreglo?");
		size = entrada = sc.nextInt();

		int[] array = new int[size];
		int[] result = new int[size];

		System.out.println("Se ha generado un arreglo de " + size + " numeros de valores aleatorios entre 1 y 300");

		for (int i = 0 ; i < size ; i++) {
			Random rand = new Random();
			numero = rand.nextInt(300) + 1;
			array[i] = numero;
		}

		do {
			System.out.println(" Ingresa un número entre 0 y 9:");
			num = sc.nextInt();
		} while (num < 0 && num > 9);

		for (int i = 0 ; i < size ; i++) {
			if (array[i] % 10 == num) {
				result[i] = array[i];
				contador++;
			}
		}

		System.out.println(" Se encontro " +  contador + " numeros con la terminación [" + num + "]");

		System.out.println();
		for (int i = 0 ; i < size ; i++) {
			if(result[i]> 0){
				System.out.println(result[i]);

			}
		}
	}
}