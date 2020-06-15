package tp5ClasesAbstractasEInterfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private AgenciaRecaudadora agenciaRecaudadora;
	private Servicio servicio;
	private Factura factura;
	private Caja mercadoCentral;
	private Cliente cliente;
	private ProductoCooperativas alcoholEnGel;
	private ProductoEmpresaTradicionales vinoTinto;

	@BeforeEach
	void setUp() throws Exception {
		agenciaRecaudadora = new AgenciaRecaudadora();
		servicio= new Servicio(80.00, 4, 5.50);
		factura= (new Factura(servicio));
		cliente = new Cliente(0);
		mercadoCentral = new Caja(cliente);
		alcoholEnGel = new ProductoCooperativas(128.00, 5);
		vinoTinto = new ProductoEmpresaTradicionales(380.50, 10);
	}

	@Test
	void testMetodoConstructorProducto() {
		
		assertEquals(alcoholEnGel.precioFinal(),115,2);
		assertEquals(vinoTinto.precioFinal(),380.50);
	}

	@Test 
	void testListaDeProductosDelCliente() {
		
		cliente.agregarProducto(alcoholEnGel);
		assertEquals(this.cliente.cantidadDeProductos(),1);
		
		cliente.agregarProducto(vinoTinto);
		assertEquals(this.cliente.cantidadDeProductos(),2);
	}
	
	@Test
	void testCaja() {
		cliente.agregarProducto(alcoholEnGel);
		cliente.agregarProducto(vinoTinto);
		assertEquals(this.cliente.cantidadDeProductos(),2);
		
		mercadoCentral.setCliente(cliente);
		assertEquals(mercadoCentral.montoTotalAPagar(),495.7);
		
		cliente.setMontoTotalAPagarDeSusProductos(mercadoCentral.montoTotalAPagar());
		assertEquals(cliente.getMontoTotalAPagarDeSusProductos(),495.7);
	}
	
	@Test
	void TestServicio() {
	assertEquals(servicio.getCostoPorUnidad(), 80.00);
	assertEquals(servicio.getCantidadUnidadesConsumidas(), 4);
	assertEquals(servicio.impuesto(), 5.50);
	assertEquals(servicio.montoAPagar(), 320.0);
	
	}

	@Test
	void TestFactura() {
		assertEquals(factura.montoAPagarDelServicioConImpuesto(), 325.5);
	}
	
	@Test 
	void TestAgenciaRecaudadora() {
		agenciaRecaudadora.registrarPago(factura);
		assertEquals(agenciaRecaudadora.getListaDeFacturas().size(), 1);
	}
	
}




