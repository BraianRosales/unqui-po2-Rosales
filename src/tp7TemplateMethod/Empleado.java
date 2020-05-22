package tp7TemplateMethod;

public abstract class Empleado {
	
	private int horasTrabajadas;
	private double sueldoBasico;
	
	
	
	public Empleado(int horasTrabajadas, double sueldoBasico) {
		
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoBasico = sueldoBasico;
	}

	

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}


	public double getSueldoBasico() {
		return sueldoBasico;
	}


	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
	//ESTE ES EL TEMPLATE METHOD O METODO PLANTILLA (ES EL METODO QUE SE REALIZA POR MEDIO DE LOS HOOK METHODS)
	public  double sueldo() {
		return (sueldoBasico + pagoPorHijos() + pagoPorHoraTrabajadas() )- descuentosEnConceptosDeAportesYObraSocial();
		
	}



	public double descuentosEnConceptosDeAportesYObraSocial() {
		return this.sueldoBasico * 0.13;
	}

	//LOS HOOK METHOD SON LOS METODOS ABSTRACTOS A REALIZAR POR LAS SUBCLASES QUE HEREDERAN DE LA CLASE PADRE.

	//ESTE ES UN HOOK METHOD
	protected abstract double pagoPorHoraTrabajadas();



	//ESTE ES UN HOOK METHOD
	protected abstract double pagoPorHijos();
	
	
	
}
