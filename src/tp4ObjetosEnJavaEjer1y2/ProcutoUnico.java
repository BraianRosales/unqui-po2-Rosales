package tp4ObjetosEnJavaEjer1y2;

public class ProcutoUnico extends Producto{

	public ProcutoUnico(String nombre, double precio, boolean precioCuidado, String esProductoPrimeraNecesidad) {
		super(nombre, precio, precioCuidado, esProductoPrimeraNecesidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double PrecioDescuento() {
		return this.getPrecio() * getPorcentajeDescuento();
		
	}

}
