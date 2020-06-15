package tp4ObjetosEnJavaEjerc3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	private Trabajador braian;
	private IngresoComun ingresoA;
	private IngresoPorHorasExtras ingresoExtra;
	
	@BeforeEach
	void setUp() throws Exception {
		braian = new Trabajador(37.000);
		ingresoA = new IngresoComun("Marzo", "sueldoBasico", 37.000);
		ingresoExtra = new IngresoPorHorasExtras("Marzo", "HorasExtras",1.000, 6);
	}

	@Test
	void TestListaDeTotalIngresosDelTrabajador() {
		
		 braian.recibeUnIngreso(ingresoA);
		 braian.recibeUnIngreso(ingresoExtra);
		 assertEquals(braian.cantidadDeSusImpuesto(),2);
		 
		 assertEquals(ingresoA.montoPercibidoFinal(),37.000);
		 assertEquals(ingresoExtra.montoPercibidoFinal(),6.000);
		 
		 assertEquals(braian.getTotalPercibido(), 43.000);
		 assertEquals(braian.getMontoImponible(), 37.000);
		 
		 assertEquals(braian.getImpuestoAPagar(),7.400);
	}

}
