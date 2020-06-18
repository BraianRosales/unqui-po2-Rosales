package tpCompositeShapeshifteTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TpCompositeShapeshifte.ShapeshifteComposite;
import TpCompositeShapeshifte.ShapeshifteLeaft;

class IshapeshifteTest {

	
	ShapeshifteLeaft a;
	ShapeshifteLeaft b;
	ShapeshifteComposite c;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		a = new ShapeshifteLeaft();
		b = new ShapeshifteLeaft();
		c = new ShapeshifteComposite();
	}

	@Test
	void testListDeShapeshifterDeShapeshifteCompositeContiene2Elementos() {
		
	
		assertEquals(c.getListaDeIshapeshifte().size(),2);
	}
	
}
