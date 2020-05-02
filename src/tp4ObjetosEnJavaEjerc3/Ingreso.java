package tp4ObjetosEnJavaEjerc3;

public abstract class Ingreso {
	
	private String mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(String mesDePercepcion, String concepto, double montoPerscibido) {
		
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPerscibido;
	}

	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	public void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	

	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public abstract double montoPercibidoFinal();

	public void setMontoPercibido(double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
}


