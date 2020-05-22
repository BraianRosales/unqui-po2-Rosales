package tp5ClasesAbstractasEInterfaces;

public class Factura {

private Servicio servicio;

	public Factura(Servicio servicio) {
		this.servicio = servicio;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Double montoAPagarDelServicioConImpuesto() {
		
		return this.servicio.montoAPagar() + this.servicio.impuesto();
	}


}
