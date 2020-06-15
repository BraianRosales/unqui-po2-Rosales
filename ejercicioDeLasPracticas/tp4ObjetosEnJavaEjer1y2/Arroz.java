package tp4ObjetosEnJavaEjer1y2;

public class Arroz extends Producto{

	public Arroz(String nombre, double precio, boolean precioCuidado, String esProductoPrimeraNecesidad) {
		super(nombre, precio, precioCuidado, esProductoPrimeraNecesidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double PrecioDescuento() {
		return this.getPrecio() * getPorcentajeDescuento();
		
		
	}

	
	

}
