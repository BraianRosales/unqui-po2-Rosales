package tp4ObjetosEnJavaEjer1y2;


import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> listaDeProductos;
	
	
	public Supermercado(String nombre, String dir) {
		this.nombre = nombre;
		this.direccion = dir;
		listaDeProductos= new ArrayList<Producto>();
	}
	
	
	
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String getDireccion() {
		// TODO Auto-generated method stub
		return this.direccion;
	}



	public void setNombre(String string) {
		this.nombre = string;
	}


	public void setDireccion(String string) {
		this.direccion = string;
		
	}



	public ArrayList<Producto> getListaDeProductos() {
		
		return this.listaDeProductos;
	}



	public void agregaProducto(Producto e) {
		this.listaDeProductos.add(e);
	}



	public Integer cantidadTotalesDeProductos() {
		
		return this.listaDeProductos.size();
	}



	public Double cantidadTotalDePrecios() {
		
		double precioTotal = 0;
		
		for(Producto producto : this.listaDeProductos) {
			precioTotal += producto.getPrecio();
		}
		
		return precioTotal;
	}
	
}
