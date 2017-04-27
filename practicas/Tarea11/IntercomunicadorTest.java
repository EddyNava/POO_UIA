public class IntercomunicadorTest {
	public void main (String [] args) {

		jugarConInterfonos();
		jugarConWalkieTalkies();
		jugarConHomePhones();
		jugarConCelulares();

		private static void jugarConInterfonos() {
			Interfono[] interfonos = {
				new Interfono( "IF1111" ),
				new Interfono( "IF0111" ),
				new Interfono( "IF0011" ),
				new Interfono( "IF0001" ),
			};

			interfonos[0].setAddress( "Cocina" ); 
			interfonos[1].setAddress( "Baño"   );
			interfonos[2].setAddress( "Estudio" );
			interfonos[3].setAddress( "Patio" );
			interfonos[0].connectTo( interfonos[1] ); 
			interfonos[0].connectTo( interfonos[2] ); 
			interfonos[0].connectTo( interfonos[3] ); 
			interfonos[1].connectTo( interfonos[2] ); 
			interfonos[1].connectTo( interfonos[3] ); 
			interfonos[2].connectTo( interfonos[3] ); 
			
			jugarConOneWay( 
				interfonos[0] , 
				interfonos[1] , 
				interfonos[2] , 
				interfonos[3] );
		}

		private static void jugarConHomePhones() {
			Exchange e = new Exchange();
			HomePhone[] HP = {
				new HomePhone( "HP1111", "5558991122", e ),
				new HomePhone( "HP0111", "5521902002", e ),
				new HomePhone( "HP0011", "5555626262", e ),
				new HomePhone( "HP0001", "5521188888", e )
			};
			HP[0].setAddress( "Ciruelos 24, Naucalpan" );
			HP[1].setAddress( "Oyameles 1, Pedregal" );
			HP[2].setAddress( "Grietas 33, Lomas Gacho" );
			HP[3].setAddress( "Rosa 24, Nativitas" );
			jugarConTwoWay( 
				HP[0], 
				HP[1], 
				HP[2], 
				HP[3] );
		}

		private static void jugarConWalkieTalkies() {
			
			WalkieTalkie[] walkieTalkies = { 
				
				new WalkieTalkie( "WT1111" ), 
				new WalkieTalkie( "WT1110" ), 
				new WalkieTalkie( "WT1100" ), 
				new WalkieTalkie( "WT1000" )
			};

			for ( int i = 0; i < 4; i++ ) {

				for ( int j = 0; j < 4; j++ ) {

					if ( i != j ) {

						walkieTalkies[i].addListener( walkieTalkies[j] );

					}
				}
			}

			prenderMobiles( walkieTalkies );

			jugarConOneWay( 
				walkieTalkies[0], 
				walkieTalkies[1], 
				walkieTalkies[2], 
				walkieTalkies[3]);
		}

		private static void jugarConCelulares() {
			Exchange e = new Exchange();
			Celular[] C = {
				new Celular( "HP1111", "5558991122", e ),
				new Celular( "HP0111", "5521902002", e ),
				new Celular( "HP0011", "5555626262", e ),
				new Celular( "HP0001", "5521188888", e )
			};

			prenderMobiles( C );
			jugarConTwoWay( C[0], C[1], C[2], C[3] );
		}

		// prende los dispositivos moviles
		private static void prenderMobiles( Mobile[] m ) {
			
			for ( int i = 0; i < m.length; i++ ) {
				
				if ( !m[i].isOn() ) {
					
					m[i].onOff ();
				}
			}
		}

		// Ejemplo de comunicación entre dispositivos de una via
		private static void JugarConOneWay( OneWay a, OneWay b, OneWay c, OneWay d ) {

			a.push(); a.sendMessage("Hola ¿ya terminaste de bañarte?"); a.release();
			b.push(); b.sendMessage("Ya...¿porque?"); b.release();
			a.push(); a.sendMessage("Ya esta tu cena..."); a.release();
			c.push(); c.sendMessage("Yo tambien quiero. ¿qué hay?"); c.release();
			a.push(); a.sendMessage("De todo lo de siempre"); a.release();
			c.push(); c.sendMessage("¿me haces unas quechas porfa?"); c.release();
			a.push(); a.sendMessage("¿cuantas?"); a.release();
			c.push(); c.sendMessage("dos porfavor"); c.release();
			a.push(); a.sendMessage("OK"); a.release ();
			c.push(); c.sendMessage("Gracias"); c.release ();
		}

		// Ejemplo de comunicación entre dispositivos de dos vias
		private static void JugarConTwoWay( TwoWay a, TwoWay b, TwoWay c, TwoWay d) {
			if( a.Dial("5521902002") ) {
				b.answerCall("¿Bueno?");
				a.sendMessage("¿Quien habla?");
				b.sendMessage("Yo.");
				a.sendMessage("¿Quien yo?");
				b.sendMessage("Johnny Merote. ¿Con quien desea hablar?");
				a.sendMessage("Con Juan Mero.");
				b.sendMessage("Ah. No esta.");
				a.sendMessage("Bueno. Hablo mas tarde. Gracias");
				b.sendMessage("De nada.");
				a.endCall();
			}

			if( a.dial("5521188888") ) {
				d.answerCall("Hola, ¿quien habla?");
				a.sendMessage("Rico Mac Pato.");
				d.sendMessage("Hoooooola. Qué tal? Como estas?");
				a.sendMessage("Pus, molestandote con un favorcito.");
				d.sendMessage("Claro! Dime.");
				a.sendMessage("Necesito que me prestes un dinerito.");
				d.sendMessage("Tu? pero, como!?");
				a.sendMessage("Es que necesito mas fortuna.");
				d.sendMessage("Estas loco!");
				a.sendMessage("Eso es un no?");
				d.endCall();
				a.sendMessage("oye, oye! uuuy!! Me colgo.");
			}
		}
	}
}














