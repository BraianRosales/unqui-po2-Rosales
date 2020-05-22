package tp5ClasesAbstractasEInterfaces;

public abstract class Producto {
	
	private double precio;
	private int stock;
	
	public Producto(double precio, int stock) {
		
		this.setPrecio(precio);
		this.setStock(stock);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public abstract double precioFinal();

}
