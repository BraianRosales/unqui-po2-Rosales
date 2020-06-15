package tp4ObjetosEnJavaEjer1y2;

public abstract class Producto{

	
	private String nombre;
	private Double precio;
	private boolean esDePrecioCuidado;
	private String esProductoPrimeraNecesidad;
	private double porcentajeDescuento;
	
	

	public Producto(String nombre, double precio, boolean precioCuidado,String esProductoPrimeraNecesidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.esDePrecioCuidado = precioCuidado;
		this.esProductoPrimeraNecesidad = esProductoPrimeraNecesidad;
	}

	public String getNombre() {
		
		return this.nombre;
	}

	public Double getPrecio() {
		
		return this.precio;
	}

	public void setPrecio(double d) {
		this.precio = d;
		
	}

	public void setNombre(String string) {
		this.nombre = string;
		
	}

	public boolean getEsDePrecioCuidados() {
		// TODO Auto-generated method stub
		return this.esDePrecioCuidado;
	}

	public void setEsDePrecioCuidados(boolean b) {
		this.esDePrecioCuidado = b;
		
	}

	public String getEsProductoDePrimeraNecesidad() {
		// TODO Auto-generated method stub
		return this.esProductoPrimeraNecesidad;
	}

	public void setEsProductoDePrimeraNecesidad(String string) {
		this.esProductoPrimeraNecesidad = string;
		
	}

	public Double precioFinal() {
		
		Double precioFinal = this.precio;
		if(this.esProductoPrimeraNecesidad == "primera necesidad")
		{
			precioFinal = this.PrecioDescuento();
		}
		return precioFinal;
	}

	
public abstract double PrecioDescuento();
	
public double getPorcentajeDescuento() {
	return porcentajeDescuento;
}

public void setPorcentajeDescuento(double porcentajeDescuento) {
	this.porcentajeDescuento = porcentajeDescuento;
}
}
