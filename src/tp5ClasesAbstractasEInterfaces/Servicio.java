package tp5ClasesAbstractasEInterfaces;

public class Servicio {

	private double costoPorUnidad;
	private int cantidadUnidadesConsumidas;
	private double tasaDelServicio;
	
	public Servicio(double costPorUnidad, int cantidadUnidadesConsumidas, double tasaDelServicio) {
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
		this.costoPorUnidad = costPorUnidad;
		this.tasaDelServicio = tasaDelServicio;

	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public int getCantidadUnidadesConsumidas() {
		return cantidadUnidadesConsumidas;
	}

	public void setCantidadUnidadesConsumidas(int cantidadUnidadesConsumidas) {
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
	}

	public double getTasaDelServicio() {
		return tasaDelServicio;
	}

	public void setTasaDelServicio(double tasaDelServicio) {
		this.tasaDelServicio = tasaDelServicio;
	}
	
	public double impuesto()
	{
		return getTasaDelServicio();
	}

	public Double montoAPagar() {
		// TODO Auto-generated method stub
		return this.costoPorUnidad * this.cantidadUnidadesConsumidas;
	}

}
