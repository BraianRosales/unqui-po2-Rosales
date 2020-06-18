package TpCompositeShapeshifte;

import java.util.ArrayList;

public class ShapeshifteLeaft implements IShapeshifte{

	
	
	
	
	public  ShapeshifteLeaft() {
		
	}
	


	@Override
	public IShapeshifte compose(IShapeshifte shapeshifte) {
		
		return shapeshifte;
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
