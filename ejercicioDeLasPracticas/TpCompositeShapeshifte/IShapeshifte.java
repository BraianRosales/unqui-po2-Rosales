package TpCompositeShapeshifte;

import java.util.ArrayList;



public interface IShapeshifte {
	
	

	public IShapeshifte compose(IShapeshifte shapeshifte);
	
	public int deepest();
	
	public IShapeshifte flat();
	
	public ArrayList<Integer> values();
}
