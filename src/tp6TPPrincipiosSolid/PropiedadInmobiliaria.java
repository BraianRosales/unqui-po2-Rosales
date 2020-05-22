package tp6TPPrincipiosSolid;

public class PropiedadInmobiliaria {
	
	private String breveDescripcion;
	private String direccion;
	private double valorFiscal;
	
	public PropiedadInmobiliaria(String breveDescripcion, String direccion, double valorFiscal) {
		
		this.breveDescripcion = breveDescripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
		}

	public String getBreveDescripcion() {
		return breveDescripcion;
	}

	public void setBreveDescripcion(String breveDescripcion) {
		this.breveDescripcion = breveDescripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}

	
	
}

