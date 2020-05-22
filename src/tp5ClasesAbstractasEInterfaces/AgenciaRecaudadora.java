package tp5ClasesAbstractasEInterfaces;

import java.util.ArrayList;

public class AgenciaRecaudadora  implements Agencia{

	private ArrayList<Factura> listaDeFacturas;
	
	public  AgenciaRecaudadora() {
		setListaDeFacturas(new ArrayList<Factura>());
		
	}

	public ArrayList<Factura> getListaDeFacturas() {
		return listaDeFacturas;
	}

	public void setListaDeFacturas(ArrayList<Factura> listaDeFacturas) {
		this.listaDeFacturas = listaDeFacturas;
	}

	@Override
	public void registrarPago(Factura factura) {
		this.getListaDeFacturas().add(factura);
		
	}
}
