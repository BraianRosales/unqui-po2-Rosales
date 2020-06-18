package TpCompositeCultivos;

import java.util.ArrayList;

public class CultivoMixto extends Cultivo{

	private ArrayList<Cultivo> listaDeCultivos;
	
	
	public CultivoMixto(int gananciaAnual) {
		super(gananciaAnual);
		this.listaDeCultivos = new ArrayList<Cultivo>();
	}


	public void setListaDeCultivos(ArrayList<Cultivo> listaDeCultivos) {
		this.listaDeCultivos = listaDeCultivos;
	}

	public ArrayList<Cultivo> getListaDeCultivos() {
		return listaDeCultivos;
	}

	
	public void agregarCultivo(Cultivo cultivo) {
		this.listaDeCultivos.add(cultivo);
	}
	
	public void removerCultivo(Cultivo cultivo) {
		this.listaDeCultivos.remove(cultivo);
	}

	
	
	@Override
	public int gananciaAnualDelCultivo() {
		//GANANCIA ANULA DE TODA LA PARCELA.
		
		int gananciaAnual = 0;
		
		for(Cultivo cultivo : this.listaDeCultivos) {
			
			gananciaAnual += cultivo.gananciaDelCultivo();
		}
		
		return gananciaAnual;
	}


	@Override
	public int gananciaDelCultivo() {
		//GANANCIA DEL CULTIVO COMPOSITE.
		
		int ganancia = 0;
		
		for(Cultivo cultivo : this.listaDeCultivos) {
			
				ganancia += cultivo.gananciaProporcional(listaDeCultivos);
		}
		
		return ganancia;
	}


	
	@Override
	public int gananciaProporcional(ArrayList<Cultivo> listaCultivos) {
		//GANANCIA DEL CULTIVO COMPOSITE RECURSION.
		
		return this.gananciaDelCultivo();
	}
	

	
	
	
	
}
