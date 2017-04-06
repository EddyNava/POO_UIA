import java.util.*;

class Usuario{

  private String nombre;
  private String direccion;
  private String mail;
  private String nickname;
  private String telefono;
  private String password;
  private String fechaNacimiento;

  public Usuario () {

    this.nombre = " ";
    this.direccion = " ";
    this.mail = " ";
    this.nickname = " ";
    this.password = " ";
    this.telefono = " ";
    this.fechaNacimiento = " ";

  }

  public Usuario(String nombre_p, String direccion_p, String mail_p, String nickname_p, String password_p, String telefono_p, String fechaNacimiento_p){
    
    this.nombre = nombre_p;
    this.direccion = direccion_p;
    this.mail = mail_p;
    this.nickname = nickname_p;
    this.password = password_p;
    this.telefono = telefono_p;
    this.fechaNacimiento = fechaNacimiento_p;
  }

  public Usuario(String nombre_p , String nickname_p, String password_p){
    
    this.nombre = nombre_p;
    this.direccion = " ";
    this.mail = " ";
    this.nickname = nickname_p;
    this.password = password_p;
    this.telefono = " ";
    this.fechaNacimiento = " ";
  }

  public void setNombre(String nombre_p){
    this.nombre = nombre_p;
  }

  public String getNombre(){
    return "Nombre: " + this.nombre;
  }

  public void setTelefono(String telefono_p){
    this.telefono = telefono_p;
  }
  public String getTelefono(){
    return "Telefono: " + this.telefono;
  }

  public void setDireccion(String direccion_p){
    this.direccion = direccion_p;
  }
  public String getDireccion(){
    return "Direccion: " + this.direccion;
  }

  public void setMail(String mail_p){
    this.mail = mail_p;
  }
  public String getMail(){
    return "Correo Electronico: " + this.mail;
  }

  public void setNickname(String nickname_p){
    this.nickname = nickname_p;
  }
  public String getNickname(){
    return "Nickname: " + this.nickname;
  }

  public void setPassword(String password_p){
    this.password = password_p;
  }

  public String getPassword(){
    return "password: " + this.password;
  }

  public void setFechaNacimiento(String fechaNacimiento_p){
    this.fechaNacimiento = fechaNacimiento_p;
    
  }

  public String getFecha(){
    return "Fecha de nacimiento: " + this.fechaNacimiento;
  }

  public String toString() {
    return ("Nombre: " + this.nombre +"\n") +
        ("Teléfono: " + this.telefono +"\n") +
        ("Dirección: "+ this.direccion +"\n") +
        ("Mail: " + this.mail + "\n") +
        ("Nickname: " + this.nickname + "\n") +
        ("Fecha de nacimiento: " + this.fechaNacimiento + "\n");
  }



}