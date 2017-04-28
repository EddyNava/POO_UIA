	/* Por error no vi el ejercicio 19
	* A la hora de realizar mi exámen teórico
	* Así que lo programé.
	*/


	public class radio {

	//public bool isSwitchedOn; El error estaba en el tipo de dato del atributo.
	public boolean isSwitchedOn; //either true or false
	public int volume; // from 0 to 10
	public double frequency; // from 535 to 1606 Mhz

	public radio () {
		isSwitchedOn = false;
		volume = 0;
		frequency = 535;
	}

	public radio (boolean isSwitchedOn_param , int volume_param , double frequency_param) {
		isSwitchedOn = isSwitchedOn_param;
		volume = volume_param;
		frequency = frequency_param;
	}

	public void setVolume (int volume_param) {
		volume = volume_param;
	}

	public int getVolume (){
		return volume;
	}

	public void setFrequency (int frequency_param) {
		frequency = frequency_param;
	}

	public double getFrequency (){
		return frequency;
	}

}