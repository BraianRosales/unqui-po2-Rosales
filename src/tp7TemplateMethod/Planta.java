package tp7TemplateMethod;

public class Planta extends Empleado {

	private int cantidadHijos;
	
	public Planta(int horasTrabajadas, double sueldoBasico, int cantidadHijos) {
		super(horasTrabajadas, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
	}

	
	@Override
	protected double pagoPorHoraTrabajadas() {
		
		return 0;
	}

	@Override
	protected double pagoPorHijos() {
		return getCantidadHijos() * 150;
	}


	public int getCantidadHijos() {
		return cantidadHijos;
	}


	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	
	
}
