package TpCompositeShapeshifte;

import java.util.ArrayList;

public class ShapeshifteLeaft implements IShapeshifte{
	

	private ArrayList<Integer> listaDeElementos;
	
	
	public  ShapeshifteLeaft() {
		this.listaDeElementos = new ArrayList<Integer>();
	}
	
	
	@Override
	public IShapeshifte compose(IShapeshifte Ishapeshifte) {
	
	ShapeshifteComposite ShapeshifteComposite = new ShapeshifteComposite();
	
	ShapeshifteComposite.getListaDeIshapeshifte().add(this);
	ShapeshifteComposite.getListaDeIshapeshifte().add(Ishapeshifte);
	
	 return ShapeshifteComposite;
	}

	@Override
	public int deepest() {
		
		return 0;
	}

	@Override
	public IShapeshifte flat() {
		
		
		
		return this;
	}
	
	

	@Override
	public ArrayList<Integer> values() {

		ArrayList<Integer> nuevaLista = new ArrayList<Integer>();
	
		nuevaLista.addAll(listaDeElementos);
		return nuevaLista;
	}

	
	
	

	public ArrayList<Integer> getListaDeElementos() {
		return listaDeElementos;
	}

	public void setListaDeElementos(ArrayList<Integer> listaDeElementos) {
		this.listaDeElementos = listaDeElementos;
	}


	@Override
	public boolean isComposite() {
		
		return false;
	}
	
	

	
}
