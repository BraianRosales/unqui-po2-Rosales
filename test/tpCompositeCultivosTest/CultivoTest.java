package tpCompositeCultivosTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TpCompositeCultivos.Cultivo;
import TpCompositeCultivos.CultivoMixto;
import TpCompositeCultivos.CultivoSoja;
import TpCompositeCultivos.CultivoTrigo;

class CultivoTest {

	//SETUP
	
	CultivoSoja cultivoSoja;
	CultivoTrigo cultivoTrigo;
	CultivoMixto cultivoMixto;
	CultivoMixto cultivoMixto2;
	ArrayList<Cultivo> listaDeCultivos;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		listaDeCultivos = new ArrayList<Cultivo>();
		cultivoSoja = new CultivoSoja(500);
		cultivoTrigo = new CultivoTrigo(300);
		cultivoMixto = new CultivoMixto(0);
		cultivoMixto2 = new CultivoMixto(0);
	}

	@Test
	void testGananciaAnualCultivoDeSoja() {
		
		assertEquals(this.cultivoSoja.gananciaAnualDelCultivo(),500);
	}
	
	@Test
	void testGananciaAnualCultivoDeTrigo() {
		
		assertEquals(this.cultivoTrigo.gananciaAnualDelCultivo(),300);
	}
	
	@Test
	void testListaDeCultivosEstaVacia() {
		
		assertTrue(cultivoMixto.getListaDeCultivos().isEmpty());
	}
	
	@Test
	void testListaDeCultivosNoEstaVacia() {
		
		//EXERCISE
		
		cultivoMixto.agregarCultivo(cultivoSoja);
		cultivoMixto.agregarCultivo(cultivoSoja);
		cultivoMixto.agregarCultivo(cultivoTrigo);
		cultivoMixto.agregarCultivo(cultivoTrigo);
		
		
		//VERIFY
		assertFalse(cultivoMixto.getListaDeCultivos().isEmpty());
	}

	@Test
	void testGananciaAnualDeLaParcelaConCultivosPurosEsMilSeicientos() {
		
		cultivoMixto.agregarCultivo(cultivoSoja);
		cultivoMixto.agregarCultivo(cultivoSoja);
		cultivoMixto.agregarCultivo(cultivoTrigo);
		cultivoMixto.agregarCultivo(cultivoTrigo);
		
		assertEquals(cultivoMixto.gananciaAnualDelCultivo(),1600);
	} 
	
	
	@Test
	void testGananciaAnualDeLaParcelaConCulivosMixtosEsCuatrocientos() {
		
		cultivoMixto2.agregarCultivo(cultivoSoja);
		cultivoMixto2.agregarCultivo(cultivoSoja);
		cultivoMixto2.agregarCultivo(cultivoTrigo);
		cultivoMixto2.agregarCultivo(cultivoTrigo);
		
		cultivoMixto.agregarCultivo(cultivoMixto2);
		
		assertEquals(cultivoMixto.gananciaAnualDelCultivo(),400);
	}
	
	@Test
	void testGananciaAnualDeParcelaConCultivosPurosYMixtosEsMilSetecientos() {
		
		cultivoMixto2.agregarCultivo(cultivoSoja);
		cultivoMixto2.agregarCultivo(cultivoSoja);
		cultivoMixto2.agregarCultivo(cultivoTrigo);
		cultivoMixto2.agregarCultivo(cultivoTrigo);
	
		cultivoMixto.agregarCultivo(cultivoSoja);
		cultivoMixto.agregarCultivo(cultivoSoja);
		cultivoMixto.agregarCultivo(cultivoMixto2);
		cultivoMixto.agregarCultivo(cultivoTrigo);
		
		
		assertEquals(cultivoMixto.gananciaAnualDelCultivo(),1700);
	}
	
}
