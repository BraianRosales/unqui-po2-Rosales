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
		
		ShapeshifteComposite nuevoShapeshifter = new ShapeshifteComposite();
		ArrayList<IShapeshifte> listaNuevaShapeShifter = new ArrayList<IShapeshifte>();
		
		listaNuevaShapeShifter.add(this);
		listaNuevaShapeShifter.add(Ishapeshifte);
		
		nuevoShapeshifter.setListaDeIshapeshifte(listaNuevaShapeShifter);
		
		return nuevoShapeshifter;
	}

	
	//SI LO HAGO CON RECURCION ME VA A DAR 4 PORQUE CUENTA LA CANTIDAD DE COMPOSITE QUE HAY EN LA LISTA.
	
	/*@Override
	public int deepest() {
		
		int profundidad = 1;
		
		for(IShapeshifte shape : this.getListaDeIshapeshifte()) {
				
					profundidad += shape.deepest();
				
		}
	return profundidad;
	}
	*/
	

	
	@Override
	public int deepest() {
		
		int profundidad = 1;
		
		for(IShapeshifte shape : listaDeIshapeshifte) {
				if(shape.isComposite()) {
					profundidad = profundidad + 1;
				}
		}
	return profundidad;
	}

	
	@Override
	public IShapeshifte flat() {
		
		ArrayList<IShapeshifte>nuevaListaDeIshapeshifter = new ArrayList<IShapeshifte>();
		
			 if(this.deepest() >= 1) {
				 
				 for(IShapeshifte shape : this.getListaDeIshapeshifte()) {
				 	
				 		nuevaListaDeIshapeshifter.add(shape.flat());
				 		}
				 	
			 } 
		this.setListaDeIshapeshifte(nuevaListaDeIshapeshifter);	
		return this;
	}

	

	@Override
	public ArrayList<Integer> values() {
		
		ArrayList<Integer> nuevaLista = new ArrayList<Integer>();
		
		 
		 for(IShapeshifte shape : this.getListaDeIshapeshifte()) {
		 	
		 		nuevaLista.addAll(shape.values());
		 		}
		
		return nuevaLista;
	}

	
	
	@Override
	public boolean isComposite() {

		return true;
	}


	public ArrayList<Integer> getListaDeElementos() {
		return listaDeElementos;
	}


	public void setListaDeElementos(ArrayList<Integer> listaDeElementos) {
		this.listaDeElementos = listaDeElementos;
	}
	
	
	
	
}














