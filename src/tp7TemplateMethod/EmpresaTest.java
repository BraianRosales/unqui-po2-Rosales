package tp7TemplateMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {

	Empresa empresa;
	Temporario empleado1;
	Pasante empleado2;
	Planta empleado3;
	
	@BeforeEach
	void setUp() throws Exception {
		empresa = new Empresa();
		empleado1 = new Temporario(48, 37500.00, 2);
		empleado2= new Pasante(32, 0);
		empleado3 = new Planta(220, 42000.00, 3);
	}

	@Test
	void test01EmpleadoTemporario() {
		
		
		assertEquals(empleado1.getSueldoBasico(),37500.00);
		assertEquals(empleado1.pagoPorHijos(),1000);
		assertEquals(empleado1.pagoPorHoraTrabajadas(),240);
		assertEquals(empleado1.descuentosEnConceptosDeAportesYObraSocial(),4875.00);
		
		assertEquals(empleado1.sueldo(),33865.00);
		
	}

	@Test
	void test02EmpleadoPasante()
	{
		assertEquals(empleado2.getSueldoBasico(),0);
		assertEquals(empleado2.pagoPorHijos(),0);
		assertEquals(empleado2.pagoPorHoraTrabajadas(),1280.00);
		assertEquals(empleado2.descuentosEnConceptosDeAportesYObraSocial(),0);
		
		assertEquals(empleado2.sueldo(),1280);
	}
	
	@Test
	void test03EmpleadoDePlanta() {
		
		assertEquals(empleado3.getSueldoBasico(),42000.00);
		assertEquals(empleado3.pagoPorHijos(),450.00);
		assertEquals(empleado3.pagoPorHoraTrabajadas(),0);
		assertEquals(empleado3.descuentosEnConceptosDeAportesYObraSocial(),5460.00);
		
		assertEquals(empleado3.sueldo(),36990.00);
	}
}
