import java.io.*;

import java.util.*;

public class DirectorioUsuariosTest {

  public static void main(String[] args) {

    Usuario listaUsuarios [] = new Usuario [3];
    DirectorioUsuarios directorio = new DirectorioUsuarios ();
    Lector reader = new Lector();

    for ( int i = 0 ; i < listaUsuarios.length ; i++ ) {

      Usuario user = new Usuario ();

      System.out.println("Nombre: ");
      user.setNombre(reader.leeString());

      System.out.println("Telefono: ");
      user.setTelefono(reader.leeString());

      System.out.println("Direccion: ");
      user.setDireccion(reader.leeString());

      System.out.println("Correo Electronico: ");
      user.setMail(reader.leeString());

      System.out.println("Nickname: ");
      user.setNickname(reader.leeString());

      System.out.println("Contraseña: ");
      user.setPassword(reader.leeString());

      System.out.println("Fecha de nacimiento");

      System.out.println("Día / Mes / Año");
      user.setFechaNacimiento(reader.leeString());
    }

    System.out.println("Inicio de sesion:");
    System.out.println("Nickname: ");
    directorio.setInicioNickname(reader.leeString());
    System.out.println("Password: ");
    directorio.setInicioPassword(reader.leeString());



    


  }
}