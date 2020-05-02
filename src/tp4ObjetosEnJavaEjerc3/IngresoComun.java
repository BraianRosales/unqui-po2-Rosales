package tp4ObjetosEnJavaEjerc3;

public class IngresoComun extends Ingreso {

	public IngresoComun(String mesDePercepcion, String concepto, double montoPerscibido) {
		super(mesDePercepcion, concepto, montoPerscibido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double montoPercibidoFinal() {
		// TODO Auto-generated method stub
		return this.getMontoPercibido();
	}

	
}
