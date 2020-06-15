package TpTestYTestDoubles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

//SETUP
	PokerStatus pokerStatus;
	JugadaPoquer jugadaPoker;
	JugadaColor jugadaColor;
	JugadaTrio jugadaTrio;
	JugadaNada jugadaANada;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		jugadaPoker = new JugadaPoquer(jugadaPoker);
		pokerStatus = new PokerStatus(jugadaPoker);
		jugadaColor = new JugadaColor(jugadaColor);
		jugadaTrio = new JugadaTrio(jugadaTrio);
		jugadaANada = new JugadaNada(jugadaANada);
		
	}

//EXERCISE DEBERIA SER POKERSTATUS.VERIFICAR Y LOS SETS.
	
//VERIFY
	@Test
	void testJugadorObtienePoquer() {
		
		
		assertTrue(pokerStatus.verificar("2D","2D","10D","2D","2D"));
	
	}
	
	@Test 
	void testUnJugadorNoObtienePoquer() {
		
		assertFalse(pokerStatus.verificar("10D", "10D", "10D", "5E", "QJ"));
	}

	@Test
	void testEsUnaRondaConJugadaDePoquer() {
	
		assertEquals(pokerStatus.getJugadaPoker().esPoquer("2D","2D","10D","2D","2D"),"esPoquer");
	}
	
	@Test
	void testEsUnaRondaConJugadaDeColor() {
	
		pokerStatus.setJugadaPoker(jugadaColor);
		assertEquals(pokerStatus.getJugadaPoker().deColor("10D", "10D", "10D", "10D", "10D"),"esJugadaColor");
	}
	
	@Test
	void testEsUnaRondaConJugadaTrio() {
		pokerStatus.setJugadaPoker(jugadaTrio);
		assertEquals(pokerStatus.getJugadaPoker().esJugadaTrio("10D", "10D", "10D", "QJ", "A7"),"esJugadaTrio");
	}
	
	@Test
	void testEsUnaRondaConNadaDeJugada() {
		pokerStatus.setJugadaPoker(jugadaANada);
		assertEquals(pokerStatus.getJugadaPoker().esJugadaNada("10D", "2D", "11C", "A20", "QJ"),"esJugadaNada");
	}
	
	@Test
	void testDelMetodoConstructorDeCarta() {
		
		Carta carta1 = new Carta(7,"Diamante");
		Carta carta2 = new Carta(6, "Corazones");
		assertEquals(carta1.getValor(),7);
		assertEquals(carta1.getPalo(), "Diamante");
		assertTrue(carta1.esMayorA(carta2));
	}
	
	//DEBERIA CREAR UNA LISTA DE CARTAS Y PASARSELA A VERIFICAR.
	
}




