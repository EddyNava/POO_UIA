public class CB extends CA {

	private int z;

	public CB () {

		super ();
		z = 0;
	}

	public CB (int x_param , int y_param , int z_param) {
		super ( x_param , y_param );
		z = z_param;
	}

	public int suma( ) {

		return super.suma( ) + z;
	}

}