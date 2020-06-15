package tp4ObjetosEnJavaEjer1y2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SupermercadoTestCase {

	private Supermercado supermercado;
	private ProcutoUnico  producto;
	private Arroz arroz;
	private Fideos fideos;
	
	@BeforeEach
	void setUp() throws Exception {
		supermercado = new Supermercado("Coto", "Yrigoyen 624");
		producto = new ProcutoUnico("alfajor", 10.50, true,"primera necesidad");
		arroz = new Arroz("arroz",45.00,true,"primera necesidad");
		fideos = new Fideos("fideos",55.30,true,"no es primera necesidad");
		
	}

	@Test
	void testConstructorGetersSupermercado() {
		assertEquals("Coto", supermercado.getNombre());
		assertEquals("Yrigoyen 624",supermercado.getDireccion());
		
	}

	@Test
	void testConstructorSetersSupermercado() {
		supermercado.setNombre("Coto");
		supermercado.setDireccion("Yrigoyen 1080");
		assertEquals("Coto", supermercado.getNombre());
		assertEquals("Yrigoyen 1080",supermercado.getDireccion());
		
	}
	
	@Test
	void testConstructorPruducto() {
		
		assertEquals(producto.getNombre(),"alfajor");
		assertEquals(producto.getPrecio(),10.50);
		
		producto.setPrecio(12.00);
		producto.setNombre("alfajor");
		
		assertEquals(producto.getPrecio(),12.00);
		
		producto.setEsDePrecioCuidados(true);
		assertEquals(producto.getEsDePrecioCuidados(),true);
		
		producto.setEsProductoDePrimeraNecesidad("primera necesidad");
		assertEquals(producto.getEsProductoDePrimeraNecesidad(),"primera necesidad");
		
	}
	
	@Test
	void testPrecioProducto(){
		
		producto.setPorcentajeDescuento(0.9);
		assertEquals(producto.PrecioDescuento(),9.450000000000001);
		assertEquals(producto.precioFinal(),9.450000000000001);
		
		producto.setEsProductoDePrimeraNecesidad("primera necesidad");
		assertEquals(producto.precioFinal(),9.450000000000001);
	}
		
	@Test
	void testListaProducto() {
		
		//TEST CON UN PRODUCTO
		
		supermercado.agregaProducto(producto);
		assertEquals(supermercado.getListaDeProductos().size(),1);
		assertEquals(supermercado.cantidadTotalesDeProductos(),1);
		assertEquals(supermercado.cantidadTotalDePrecios(),10.50);
		
		supermercado.getListaDeProductos().clear();
		
		//TEST CON 2 PRODUCTOS
		supermercado.agregaProducto(arroz);
		supermercado.agregaProducto(fideos);
		assertEquals(supermercado.cantidadTotalesDeProductos(),2);
		
		arroz.setPorcentajeDescuento(0.8);
		assertEquals(arroz.precioFinal(),32,4);
		fideos.setPorcentajeDescuento(0.11);
		assertEquals(fideos.precioFinal(),55,30);
		
		assertEquals(supermercado.cantidadTotalDePrecios(),95,8);
		
	}
	


}





