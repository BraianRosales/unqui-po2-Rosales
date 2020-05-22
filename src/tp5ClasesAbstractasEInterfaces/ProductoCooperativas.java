package tp5ClasesAbstractasEInterfaces;

public class ProductoCooperativas extends Producto{

	public ProductoCooperativas(double precio, int stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double precioFinal() {
		
		return this.getPrecio() * 0.9;
	}
	

}
