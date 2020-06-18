package TpCompositeShapeshifte;

import java.util.ArrayList;

public class ShapeshifteComposite implements IShapeshifte{

	//PROPIEDADES
	
	private ArrayList<Integer> listaDeElementos;
	private ArrayList<IShapeshifte> listaDeIshapeshifte;
	
	
	//CONSTRUCTOR.
	
	public ShapeshifteComposite() {
		
		this.listaDeElementos = new ArrayList<Integer>();
		this.listaDeIshapeshifte = new ArrayList<IShapeshifte>();
		
	}
	
	
	//GETTERS AND SETTERS.

	
	public ArrayList<IShapeshifte> getListaDeIshapeshifte() {
		return listaDeIshapeshifte;
	}


	public void setListaDeIshapeshifte(ArrayList<IShapeshifte> listaDeIshapeshifte) {
		this.listaDeIshapeshifte = listaDeIshapeshifte;
	}


	//OVERRIDE.
	
	@Override
	public IShapeshifte compose(IShapeshifte Ishapeshifte) {
		
		this.listaDeIshapeshifte.add(Ishapeshifte);
		this.setListaDeIshapeshifte(listaDeIshapeshifte);
		
		return this;
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

}














