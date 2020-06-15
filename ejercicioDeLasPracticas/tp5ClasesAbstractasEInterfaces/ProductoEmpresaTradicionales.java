package tp5ClasesAbstractasEInterfaces;

public class ProductoEmpresaTradicionales  extends Producto{

	public ProductoEmpresaTradicionales(double precio, int stock) {
		super(precio, stock);
	}

	@Override
	public double precioFinal() {
		return this.getPrecio();
	}

}
