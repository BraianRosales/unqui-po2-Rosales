package tp6TPPrincipiosSolid;

public class SolicitudCreditoHipotecario extends SolicitudDeCredito{

	
	
	public SolicitudCreditoHipotecario(Cliente clienteQueLaSolicita, double montoSolicitado, int plazoEnMeses,
			double montoDeLaCuota) {
		super(clienteQueLaSolicita, montoSolicitado, plazoEnMeses, montoDeLaCuota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esSolicitudAceptada() {
		// TODO Auto-generated method stub
		return noSuperaElCincuentaPorCientoDeIngresoMensualesDelTitular() && montoTotalSolicitadoNoEsMayorAlSetentaPorCientoDelValorFiscalComoGarantia();
	}

	@Override
	public double ingresoRequeridoDeAprobacion() {
		// TODO Auto-generated method stub
		return getClienteQueLaSolicita().getSueldoNetoMensual() * 0.50;
	}

	public boolean noSuperaElCincuentaPorCientoDeIngresoMensualesDelTitular() {
		return this.getMontoDeLaCuota() < this.ingresoRequeridoDeAprobacion();
	}

	public boolean montoTotalSolicitadoNoEsMayorAlSetentaPorCientoDelValorFiscalComoGarantia() {
		
		return this.getMontoSolicitado() < setentaPorCientoGarantiaFiscal();
	}

	public double setentaPorCientoGarantiaFiscal()
	{
		return getClienteQueLaSolicita().getPropiedadInmobiliaria().getValorFiscal() * 0.70;
	}
	
}
