package tpCompositeShapeshifteTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import TpCompositeShapeshifte.ShapeshifteComposite;
import TpCompositeShapeshifte.ShapeshifteLeaft;

class DeepestShapeshifterTest {

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
	void testDeepestAEsIgualACero() {
		
		a.getListaDeElementos().add(1);
		
		assertEquals(a.deepest(),0);
	} 

	@Test
	void testDeepestCEsIgualAUno() {
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		d.getListaDeElementos().add(3);
		
		c = (ShapeshifteComposite)a.compose(b);
		
		assertEquals(c.deepest(),1);
	} 
	
	@Test
	void testDeepestZEsIgualADos() {
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		d.getListaDeElementos().add(3);
		
		c = (ShapeshifteComposite)a.compose(b);
		z = (ShapeshifteComposite)d.compose(c);
		
		assertEquals(z.deepest(),2);
	} 
	
	@Test
	void testDeepestFEsIgualATres() {
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		d.getListaDeElementos().add(3);
		a2.getListaDeElementos().add(5);
		b2.getListaDeElementos().add(6);
		
		c = (ShapeshifteComposite)a.compose(b);
		z = (ShapeshifteComposite)d.compose(c);
		e = (ShapeshifteComposite)a2.compose(b2);
		f = (ShapeshifteComposite)z.compose(e);
		
		assertEquals(f.deepest(),3);
		
	}

}





