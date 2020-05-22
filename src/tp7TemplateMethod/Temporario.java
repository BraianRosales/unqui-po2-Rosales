package tp7TemplateMethod;

public class Temporario extends Empleado {

	private int cantidadHijos;
	
	public Temporario(int horasTrabajadas, double sueldoBasico,int cantidadHijos) {
		super(horasTrabajadas, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		
	}

	@Override
	protected double pagoPorHoraTrabajadas() {
		
		return this.getHorasTrabajadas() * 5;
	}

	@Override
	protected double pagoPorHijos() {
		
		double var = 0;
		if(this.cantidadHijos > 0) {
			var = 1000.00;
		}
		
		return var;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	

}
