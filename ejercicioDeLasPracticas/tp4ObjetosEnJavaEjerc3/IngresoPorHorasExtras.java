package tp4ObjetosEnJavaEjerc3;

public class IngresoPorHorasExtras extends Ingreso{

	private int cantidadHorasExtrasRealizadas;
	
	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double montoPerscibido,int cantidadHorasExtras) {
		super(mesDePercepcion, concepto, montoPerscibido);
		this.setCantidadHorasExtrasRealizadas(cantidadHorasExtras);
		// TODO Auto-generated constructor stub
	}

	public int getCantidadHorasExtrasRealizadas() {
		return cantidadHorasExtrasRealizadas;
	}

	public void setCantidadHorasExtrasRealizadas(int cantidadHorasExtrasRealizadas) {
		this.cantidadHorasExtrasRealizadas = cantidadHorasExtrasRealizadas;
	}

	@Override
	public double montoPercibidoFinal() {
		// TODO Auto-generated method stub
		return this.getMontoPercibido() * cantidadHorasExtrasRealizadas;
	}
	
}
