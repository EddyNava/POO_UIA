
import java.io.*;

public class T7E1 {

	private int day;
	private int month;
	private int year;

	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public void setDate() {
		this.setDay ();
		this.setMonth ();
		this.setYear ();	
	}

	private void setDay() {
		System.out.print("Ingresa el día: ");
		this.leeInt();
	}

	private void setMonth() {
		System.out.print("Ingresa el mes: ");
		this.leeInt();
	}

	private void setYear() {
		System.out.print("Ingresa el año: ");
		this.leeInt();
	}

	private int leeInt() {
		int dato = 0;
		try{
			dato = Integer.parseInt(entrada.readLine());
		}catch(IOException e) {
			System.out.println("El dato que ingresasten no es valido se tomará como " + (dato +1));
		}
		return dato;
	}


	private void valiYear() {
		if(this.year > 1582) {
		}else 
		System.out.println("El año que ingresaste no es valido");
	}

	private void valiDay() {
		if(this.day >= 1 && this.day <= 31) {
		} else 
		System.out.println("El día ingresado es incorrecto");
	}

	private void valiMonth() {
		if(this.month >= 1 && this.month <= 12) {
			this.valiMonthFeb();
		}else 
		System.out.println("El month ingresado es incorrecto");
	}

	private void valiBisiesto() {
		if(this.year % 400 == 0) {
			System.out.println("El año que ingresaste es bisiesto");
		} else if(this.year % 4 == 0 && this.year % 100 != 0) {
			System.out.println("El año que ingresaste es bisiesto");
		} else 
		System.out.println("El año que ingresaste NO es bisiesto");
	}

	private void valiMonthFeb() {
		if(this.month == 2){
			if(this.day < 30){
			} else 
			this.valiBisiesto();
			System.out.println("El mes que ingresaste no tiene 30 días");
		}
	}

	private void valiMonth2() {
		if(this.month != 4 && this.month != 6 && this.month != 9 && this.month != 11){
		} if(this.day == 31) {
			System.out.println("El mes que ingresaste no tiene 31 días");
		}
	}

	private void valiDate() {
		this.valiDay();
		this.valiMonth();
		this.valiMonth2();
		this.valiYear();
	}

	public void getDate(int [] fecha) {
		this.valiDate();
		fecha[0] = this.day;
		fecha[1] = this.month;
		fecha[2] = this.year;
	}

	public static void printDate(int [] fecha) {
		System.out.println(fecha[0]+" / "+ fecha[1] +" / "+ fecha[2]);
	}



}