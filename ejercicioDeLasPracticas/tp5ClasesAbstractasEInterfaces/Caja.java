package tp5ClasesAbstractasEInterfaces;

public class Caja {

	private Cliente cliente;
	
	public Caja(Cliente cliente) {
		this.cliente = new Cliente(0.0);
	}

	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Double montoTotalAPagar() {
		
		Double montoTotal = 0.0;
		for(Producto producto : cliente.getListaDeProductos()) {
			montoTotal += producto.precioFinal();
		}
		
	return montoTotal;

	}
	
	public void decrementarStockDelProducto() {
		
	}
}





