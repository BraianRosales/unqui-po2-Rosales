package tp6TPPrincipiosSolid;

import java.util.ArrayList;

public class BancoCiudad implements ISistemaInformatico{
	
	private Cliente cliente;
	private ArrayList<Cliente>listaDeClientes;
	private ArrayList<SolicitudDeCredito>listaDeSolicitudesDeCreditos;
	
	public BancoCiudad() {
		listaDeClientes = new ArrayList<Cliente>();
		listaDeSolicitudesDeCreditos = new ArrayList<SolicitudDeCredito>();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}

	public ArrayList<SolicitudDeCredito> getListaDeSolicitudesDeCreditos() {
		return listaDeSolicitudesDeCreditos;
	}

	public void setListaDeSolicitudesDeCreditos(ArrayList<SolicitudDeCredito> listaDeSolicitudesDeCreditos) {
		this.listaDeSolicitudesDeCreditos = listaDeSolicitudesDeCreditos;
	}

	public boolean aceptaLaSolicitudDeCreditoDe(Cliente cliente) {
		
		return this.cliente.getSolicitudDeCredito().esSolicitudAceptada();
				
	}
	
	@Override
	public void agregarNuevoCliente() {
		this.listaDeClientes.add(this.cliente);
		
	}

	@Override
	public void agregarNuevaSolicitud(SolicitudDeCredito solicitud) {
		
		
	}

	@Override
	public double montoTotalADesembolsarDelBanco() {
	 
		double suma = 0;
		for(Cliente cliente : listaDeClientes) {
			suma += cliente.getMontoObtenidoPorElBanco();
		}
		return  suma;
	}

	public void desembolsaDinero(Cliente braian) {
		
		this.cliente.setMontoObtenidoPorElBanco(this.cliente.getSolicitudDeCredito().getMontoSolicitado());
		
	}

	public Integer cantidadDeClientes() {
		
		return this.listaDeClientes.size();
	}
	
	
}
