public class Celular extends TwoWay implements Mobile {
  private  Boolean on;

  public Celular ( String serialNum , String number , Exchange e) {
    super ( serialNum , number , e);
    on = false;
  }

  public Boolean dial ( String n ) {
    if ( !on ) {
      return false;
    }
    return super.dial ( n );
  }

  public Boolean receiveMessage ( String m ) {
    if ( !on ) {
      return false;
    }
    return super.receiveMessage ( m );
  }
  public void ring () {
    if ( !on ) {
      return;
    }
    super.ring ( this );
  }

  public Boolean onOff () {
    on = !on;
    if ( !on ) {
      endCall();
    }
    return on;
  }
  public Boolean isOn () {
    return on;
  }
  public String toString () {
    return super.toString () + " on:" + on;
  }

}
