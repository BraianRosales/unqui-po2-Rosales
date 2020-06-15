package tp6TPPrincipiosSolid;

public abstract class SolicitudDeCredito implements ICondicionDeAprobacionPorMeses{
	
	private Cliente clienteQueLaSolicita;
	private double montoSolicitado;
	private int plazoEnMeses;
	private double montoDeLaCuota;
	
	public SolicitudDeCredito(Cliente clienteQueLaSolicita,double montoSolicitado,int plazoEnMeses, double montoDeLaCuota) {
		
		this.clienteQueLaSolicita = clienteQueLaSolicita;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
		this.montoDeLaCuota = montoDeLaCuota;
		
	}
	
	public abstract boolean esSolicitudAceptada();



	
	public Cliente getClienteQueLaSolicita() {
		return clienteQueLaSolicita;
	}

	public void setClienteQueLaSolicita(Cliente clienteQueLaSolicita) {
		this.clienteQueLaSolicita = clienteQueLaSolicita;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public double getMontoDeLaCuota() {
		return montoDeLaCuota;
	}

	public void setMontoDeLaCuota(double montoDeLaCuota) {
		this.montoDeLaCuota = montoDeLaCuota;
	}

	

	
	
}
