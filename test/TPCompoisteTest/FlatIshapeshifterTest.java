package TPCompoisteTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TpCompositeShapeshifte.ShapeshifteComposite;
import TpCompositeShapeshifte.ShapeshifteLeaft;



class FlatIshapeshifterTest {

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
	ShapeshifteComposite g;
	
	@BeforeEach
	void setUp() throws Exception {
		this.a = new ShapeshifteLeaft();
		this.b = new ShapeshifteLeaft();
		this.a2 = new ShapeshifteLeaft();
		this.b2 = new ShapeshifteLeaft();
		this.d = new ShapeshifteLeaft();
	}

	@Test
	void testFlatDeAEsIgualaA() {
		
		assertEquals(a.flat(),a);
	}
	
	@Test
	void testFlatDeFEsIgualAG() {
		
		a.getListaDeElementos().add(1);
		b.getListaDeElementos().add(2);
		d.getListaDeElementos().add(3);
		a2.getListaDeElementos().add(5);
		b2.getListaDeElementos().add(6);
		
		c = (ShapeshifteComposite)a.compose(b);
		z = (ShapeshifteComposite)d.compose(c);
		e = (ShapeshifteComposite)a2.compose(b2);
		f = (ShapeshifteComposite)z.compose(e);
		
		f.flat();
		assertEquals(f.getListaDeIshapeshifte().size(),5);
	}

}
