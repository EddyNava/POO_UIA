import java.io.*;

public class UsuarioTest{

  public static void main(String[] args) {

    Lector reader = new Lector();
    Usuario user1 = new Usuario();
    Usuario user2 = new Usuario( "Edgardo" , "Leonardo da Vinci 135" , "enava@kionetworks.com" , "EddyNava" , "password" , "63540597" , "24/08/1988");
    Usuario user3 = new Usuario( "Edgardo" , "EddyNava" , "password" );



    System.out.println(" REGISTRO ");

    System.out.println("Nombre: ");
    user1.setNombre(reader.leeString());

    System.out.println("Telefono: ");
    user1.setTelefono(reader.leeString());

    System.out.println("Direccion: ");
    user1.setDireccion(reader.leeString());

    System.out.println("Correo Electronico: ");
    user1.setMail(reader.leeString());

    System.out.println("Nickname: ");
    user1.setNickname(reader.leeString());

    System.out.println("Contraseña: ");
    user1.setPassword(reader.leeString());

    System.out.println("Fecha de nacimiento");
    
    System.out.println("Día / Mes / Año");
    user1.setFechaNacimiento(reader.leeString());
    

    System.out.println(" DATOS \n");

    System.out.println(user1.toString());

    System.out.println ("-----------------User 2----------------------");

    System.out.println(user2.toString());

    System.out.println ("-----------------User 3----------------------");

    System.out.println(user3.toString());

    }
}



