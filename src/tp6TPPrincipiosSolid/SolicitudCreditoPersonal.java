package tp6TPPrincipiosSolid;



public class SolicitudCreditoPersonal extends SolicitudDeCredito {

	 
	public SolicitudCreditoPersonal(Cliente clienteQueLaSolicita, double montoSolicitado, int plazoEnMeses,double montoDeLaCuota) {
		super(clienteQueLaSolicita, montoSolicitado, plazoEnMeses, montoDeLaCuota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esSolicitudAceptada() {
		// TODO Auto-generated method stub
		boolean var = false;
		if( montoDeLaCuotaNoSupereAlIngresoRequeridoDeAprobacion() && ingresoAnualEsMayorAQuinceMilQuinientos()) {
			var = true;
		}
		return var;
	}
	
	public boolean montoDeLaCuotaNoSupereAlIngresoRequeridoDeAprobacion() {
		return this.getMontoDeLaCuota() < ingresoRequeridoDeAprobacion();
	}
	


	public boolean ingresoAnualEsMayorAQuinceMilQuinientos() {
		return getClienteQueLaSolicita().ingresoAnual() > 15.000;
	}
	

	@Override
	public double ingresoRequeridoDeAprobacion() {
		// TODO Auto-generated method stub
		return getClienteQueLaSolicita().getSueldoNetoMensual() * 0.70;
	}


	

	
}

