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
		
		return null;
	}

	@Override
	public ArrayList<Integer> values() {
		
		return null;
	}


	public ArrayList<Integer> getListaDeElementos() {
		return listaDeElementos;
	}

	public void setListaDeElementos(ArrayList<Integer> listaDeElementos) {
		this.listaDeElementos = listaDeElementos;
	}

	
}
