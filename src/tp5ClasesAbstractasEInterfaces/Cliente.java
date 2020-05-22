package tp5ClasesAbstractasEInterfaces;

import java.util.ArrayList;

public class Cliente {
	
	private double montoTotalAPagarDeSusProductos;
	private ArrayList<Producto> listaDeProductos;
	
	public Cliente(double montoTotalAPagarDeSusProductos) {
		listaDeProductos= new ArrayList<Producto>();
		this.setMontoTotalAPagarDeSusProductos(montoTotalAPagarDeSusProductos);
	}

	public Integer cantidadDeProductos() {
		
		return this.listaDeProductos.size();
	}

	public void agregarProducto(Producto alcoholEnGel) {
		this.listaDeProductos.add(alcoholEnGel);
	}

	public double getMontoTotalAPagarDeSusProductos() {
		return montoTotalAPagarDeSusProductos;
	}

	public void setMontoTotalAPagarDeSusProductos(double montoTotalAPagarDeSusProductos) {
		this.montoTotalAPagarDeSusProductos = montoTotalAPagarDeSusProductos;
	}

	public ArrayList<Producto> getListaDeProductos() {
		return listaDeProductos;
	}

	public void setListaDeProductos(ArrayList<Producto> listaDeProductos) {
		this.listaDeProductos = listaDeProductos;
	}

}
