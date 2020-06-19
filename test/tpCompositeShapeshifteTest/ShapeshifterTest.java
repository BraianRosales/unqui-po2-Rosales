package tpCompositeShapeshifteTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TpCompositeShapeshifte.ShapeshifteComposite;
import TpCompositeShapeshifte.ShapeshifteLeaft;

class ShapeshifterTest {

	ShapeshifteLeaft a;
	ShapeshifteLeaft b;
	ShapeshifteComposite c;
	ShapeshifteComposite c2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.a = new ShapeshifteLeaft();
		this.b = new ShapeshifteLeaft();
		
	}

	@Test
	void testDelShapeshifteCompuestoDelResultadoDeAComposeBTieneDosElementos() {
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		
		c = (ShapeshifteComposite)a.compose(b);
	
		assertEquals(c.getListaDeIshapeshifte().size(),2);
		
	}

	@Test
	void testDelShapeshifteCompuestoPorAyPorBTieneDosElementos(){
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		
		c2 = new ShapeshifteComposite();
		
		c2.compose(a);
		c2.compose(b);
	
		assertEquals(c2.getListaDeIshapeshifte().size(),2);
			}
	
	@Test
	void testCantidadDeElementosDelCompositoCEsIgualALaCantidadDeElemntosDeC2(){
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		c = (ShapeshifteComposite)a.compose(b);
		
		c2 = new ShapeshifteComposite();
		c2.compose(a);
		c2.compose(b);
		
		assertEquals(c.getListaDeIshapeshifte(),c2.getListaDeIshapeshifte());
	}
}
