import java.util.*;

class DirectorioUsuarios{

  private String listaUsuarios;
  private String inicioNickname;
  private String inicioPassword;
  private Usuario user;


  

  public DirectorioUsuarios(){
    Usuario listaUsuarios [] = new Usuario [3];
    user = new Usuario();

  }

  public void setInicioNickname (String nickname_p) {

    this.inicioNickname = nickname_p;
  }

  public String getInicioNickname () { 

    return this.inicioNickname;
  }

  public void setInicioPassword (String password_p) {

    this.inicioPassword = password_p;

  }
  public String getInicioPassword () { 

    return this.inicioPassword;
  }


  public boolean iniciarSesion (String nickname_p, String password_p){

    if(user.getNickname().equals(nickname_p) && user.getPassword().equals(password_p)){

      return true;

    }else{

      return false;
    }
  }

}