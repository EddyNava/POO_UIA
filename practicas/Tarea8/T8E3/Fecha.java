public class Fecha {

    private int day;
    private int month;
    private int year;

    public Fecha () {
        day = 0;
        month = 0;
        year = 0;
    }
    
    public Fecha (int d_param, int m_param, int y_param) {
        this.day = d_param;
        this.month = m_param;
        this.year = y_param;
    }
    
    public void pimpFecha() {

        System.out.println( this.day + " / "+ this.month + " / "+ this.year );

    }


    public void finalize(){

        System.out.println ("El objeto será destruido");
    }
}