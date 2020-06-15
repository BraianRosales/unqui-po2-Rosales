package TpTestYTestDoubles;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestConDoubles {

	PokerStatus pokerStatus;
	JugadaPoquer jugadaDePoquer;
	JugadaColor jugadaDeColor;
	JugadaTrio jugadaTrio;
	JugadaNada jugadaANada;
	Carta carta;
	Carta carta2;
	
	//SETUP
	
	@BeforeEach
	void setUp() throws Exception {
		
		//DOCS : doubles
		//Dummy
		
		/*PUNTO 3 DE LA PRACTICA ¿Cómo hacer para que un objeto mock este preparado para recibir algunos mensajes sin importar el orden o la
		obligatoriedad de recibirlos? CREANDO DUMMY*/
		
		this.jugadaDePoquer = mock(JugadaPoquer.class);
		this.jugadaDeColor= mock(JugadaColor.class);
		this.jugadaTrio = mock(JugadaTrio.class);
		this.jugadaANada = mock(JugadaNada.class);
		this.carta2 = mock(Carta.class);
	
		
		//SUT
		this.pokerStatus = new PokerStatus(jugadaDePoquer);
		this.carta = new Carta(7, "Diamante");
	}

	
	@Test
	void testEsUnaRondaConJugadaDePoquer() {
	
		/*PUNTO 2 DE LA PRACTICA ¿Cómo se indica en mockito que el objeto mock debe recibir un secuencia de mensajes particular en un orden
		preestablecido? Agregue un ejemplo.CON UN WHEN*/
		
		/*PUNTO 4 DE LA PRACTICA ES PISBILE ANIDAR MENSAJES CON LOS .THENRETURN*/
		
		when(this.jugadaDePoquer.esPoquer("2D","2D","10D","2D","2D")).thenReturn("esPoquer");
		
		assertEquals(pokerStatus.jugadaPoker.esPoquer("2D","2D","10D","2D","2D"),"esPoquer");
	}
	
	
	@Test
	void testEsUnaRondaConJugadaDeColor() {
	
		//EXERCISE
		pokerStatus.setJugadaPoker(this.jugadaDeColor);
		
		//Stub
		when(this.jugadaDeColor.deColor("10D", "10D", "10D", "10D", "10D")).thenReturn("esJugadaColor");
		
		//PUNTO 5 DE LA PRACTICA FORMA DE VERIFICACION DE MOCKITO.
		//Mock
		verify(jugadaDeColor,times(0)).verificar("10D", "10D", "10D", "10D", "10D");
		
		
		//VERIFY
		assertEquals(pokerStatus.jugadaPoker.deColor("10D", "10D", "10D", "10D", "10D"),"esJugadaColor");
	}
	
	
	@Test
	void testEsUnaRondaConJugadaTrio() {
		
		pokerStatus.setJugadaPoker(jugadaTrio);
		when(this.jugadaTrio.esJugadaTrio("10D", "10D", "10D", "QJ", "A7")).thenReturn("esJugadaTrio");
		
		assertEquals(pokerStatus.jugadaPoker.esJugadaTrio("10D", "10D", "10D", "QJ", "A7"),"esJugadaTrio");
	}
	
	@Test
	void testEsUnaRondaConNadaDeJugada() {
		
		pokerStatus.setJugadaPoker(jugadaANada);
		when(this.jugadaANada.esJugadaNada("10D", "2D", "11C", "A20", "QJ")).thenReturn("esJugadaNada");
		
		assertEquals(pokerStatus.getJugadaPoker().esJugadaNada("10D", "2D", "11C", "A20", "QJ"),"esJugadaNada");
	}
	
	@Test
	void testDelMetodoConstructorDeCarta() {
		
		when(carta2.getValor()).thenReturn(6);

		assertTrue(carta.esMayorA(carta2));
		
		
	}
	
	
	/*
	 
	 TIPOS DE TEST DOUBLES:

DUMMY:
      se utiliza el objeto para que ocupe un lugar pero nunca es utilizado.
      como por ejemplo para utilizarlo como parametro.

	Customer dummy = creatDummyCustomer();
	addressBook addressBook = new AddressBook();
	addresBook.addCustomer(dummy);
	assertEquals(1,addessBook.getNumberOfCustomers());


STUB:
     Es un objeto en el que configuras que cuando llames a un método devuelva  un valor determinado. Por ejemplo, si tienes un 
     objeto con un método que  suma dos números, un stub sería un objeto que 
     independientemente de los valores que le pases al método suma, devuelva 5.
	
	setup:
	TimeDisplay sut = new TimeDisplay();
	TimeProvider tpStub = mock(TimeProvider.class);
	Calendar midnight = Calendar.makeTime(0,0);
	when(tpStub.getTime()).thenReturn(midnight);
	sut.setTimeProvider(tpStub);
	
	String result = sut.getCurrenTimeAsh()

SPY:
     Estos objetos guardan las acciones que se hacen sobre ellos. Hace una especie de seguimiento sobre qué métodos se han llamado y con qué  parámetros.
     Cuando para que un test sea un éxito no es suficiente ver el estado de los      
     objetos disponibles, podemos usar un spy y comprobar cosas como cuántas      

		es el when.

MOCK:
     Muy similar a un spy, pero no solo guardan las acciones que se hacen sobre      
     ellos, también es necesario configurar qué comportamiento esperas cuando      
     alguien llame a alguno de sus métodos.
	
	  */
	
	//FALTA EL ULTIMO PUNTO JUGADAS DE POQUER
	
}








