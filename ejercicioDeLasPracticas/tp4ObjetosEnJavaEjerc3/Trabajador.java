package tp4ObjetosEnJavaEjerc3;

import java.util.ArrayList;



public class Trabajador {

	private double ingresos;
	private ArrayList<Ingreso> ingresosPercibidos;
	
	public Trabajador(double ingresos) {
		this.ingresos = ingresos;
		ingresosPercibidos= new ArrayList<Ingreso>();
	}
		
	
	
	
	public double getTotalPercibido() {
		
			double percibidoTotal = 0;
			
			for(Ingreso ingreso : this.ingresosPercibidos) {
				percibidoTotal += ingreso.montoPercibidoFinal();
			}
			
			return percibidoTotal;
		
	}
	
	public double getMontoImponible() {
		return this.getIngresos();
		
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.2;
		
	}




	public double getIngresos() {
		return ingresos;
	}




	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}




	public void recibeUnIngreso(Ingreso ingresoA) {
		this.ingresosPercibidos.add(ingresoA);
	}

	public Integer cantidadDeSusImpuesto() {
		return this.ingresosPercibidos.size();
	}

	
}
