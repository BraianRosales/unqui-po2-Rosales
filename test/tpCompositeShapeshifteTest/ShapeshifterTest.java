package tpCompositeShapeshifteTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TpCompositeShapeshifte.ShapeshifteComposite;
import TpCompositeShapeshifte.ShapeshifteLeaft;

class ShapeshifterTest {

	
	ShapeshifteLeaft a;
	ShapeshifteLeaft b;
	ShapeshifteLeaft a2;
	ShapeshifteLeaft b2;
	ShapeshifteComposite c;
	ShapeshifteComposite c2;
	ShapeshifteLeaft d;
	ShapeshifteComposite z;
	ShapeshifteComposite z2;
	ShapeshifteComposite e;
	ShapeshifteComposite e2;
	ShapeshifteComposite f;
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.a = new ShapeshifteLeaft();
		this.b = new ShapeshifteLeaft();
		this.a2 = new ShapeshifteLeaft();
		this.b2 = new ShapeshifteLeaft();
		this.d = new ShapeshifteLeaft();
		
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
	void testCantidadDeShapeshifterDelCompuestoCEsIgualALaCantidadDeShipeshiftersDelCompuestoC2(){
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		
		c = (ShapeshifteComposite)a.compose(b);
		
		c2 = new ShapeshifteComposite();
		c2.compose(a);
		c2.compose(b);
		
		assertEquals(c.getListaDeIshapeshifte(),c2.getListaDeIshapeshifte());
	}
	
	@Test
	void testLaCantidadDeShapeshifterDelCompositeZEsDos() {
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		d.getListaDeElementos().add(3);
		
		c = (ShapeshifteComposite)a.compose(b);
		z = (ShapeshifteComposite)d.compose(c);
		
		assertEquals(z.getListaDeIshapeshifte().size(),2);
	}
	
	@Test
	void testLaCantidadDeShapeshiterDelCompositeZEsIgualALaCantidadDeShapeshifterDelCompositeDeDComposeC(){               
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		d.getListaDeElementos().add(3);
		
		c = (ShapeshifteComposite)a.compose(b);
		z = (ShapeshifteComposite)d.compose(c);
		
		z2= new ShapeshifteComposite();
		z2.compose(d);
		z2.compose(c);
		
		assertEquals(z.getListaDeIshapeshifte().size(),2);
		assertEquals(z2.getListaDeIshapeshifte().size(),2);
		assertEquals(z.getListaDeIshapeshifte(),z2.getListaDeIshapeshifte());
	}
	
	
	@Test
	void testLaCantidadDeShapeshifterDelCompositeFEsDos() {
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		d.getListaDeElementos().add(3);
		a2.getListaDeElementos().add(5);
		b2.getListaDeElementos().add(6);
		
		c = (ShapeshifteComposite)a.compose(b);
		z = (ShapeshifteComposite)d.compose(c);
		e = (ShapeshifteComposite)a2.compose(b2);
		
		assertEquals(z.getListaDeIshapeshifte().size(),2);
		assertEquals(e.getListaDeIshapeshifte().size(),2);
		
		f = (ShapeshifteComposite)z.compose(e);
		assertEquals(z.getListaDeIshapeshifte().size(),2);
	}
	
}




