import java.io.*;


// Clase de tipo modulo, donde todos sus metodos son estaticos

public class Lee {

 //   
 private static InputStreamReader isr = new InputStreamReader(System.in);
 private static BufferedReader flujoE = new BufferedReader(isr);
 private static String sDato;


 public static int leeInt() {

    int numInt=0;

    try {
        sDato = flujoE.readLine();
        numInt = Integer.parseInt(sDato);
    } catch(NumberFormatException e){
        System.out.println("El caracter ingresado no es correcto");
        return -1;
    }catch (IOException e) {}
    return numInt;
}

public static float leeFloat() {

    float numFloat=0;

    try {
        sDato = flujoE.readLine();
        numFloat = Float.parseFloat(sDato);
    } catch(NumberFormatException e){
        System.out.println("El caracter ingresado no es correcto");
        return -1;
    }catch (IOException e) {}
    return numFloat;
}

public static String leeString() {

    try {
        sDato = flujoE.readLine();
    } catch (IOException e) {}
    return sDato;
}

}