package tp7TemplateMethod;

public class Pasante extends Empleado{

	public Pasante(int horasTrabajadas, double sueldoBasico) {
		super(horasTrabajadas, sueldoBasico);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double pagoPorHoraTrabajadas() {
		
		return getHorasTrabajadas() * 40;
	}

	@Override
	protected double pagoPorHijos() {
		
		return 0;
	}

}
