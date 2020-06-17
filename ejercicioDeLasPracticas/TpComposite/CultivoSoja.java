package TpComposite;

import java.util.ArrayList;

public class CultivoSoja extends Cultivo{

	public CultivoSoja(int gananciaAnual) {
		super(gananciaAnual);
		
	}

	@Override
	public int gananciaAnualDelCultivo() {
		//GANANCIA ANUAL DE CULTIVO EN TOTAL.
		
		return this.getGananciaAnual();
	}

	
	@Override
	public int gananciaDelCultivo() {
		//GANANCIA ACTUAL DEL CULTIVO.
		return gananciaAnualDelCultivo();
	}
	

	@Override
	public int gananciaProporcional(ArrayList<Cultivo> listaCultivos) {
		//GANANCIA DEL CULTIVO SI ESTA DENTRO DEL COMPOSITE Y ESTA COMPUESTO POR MAS CULTIVOS.
		
		return this.gananciaAnualDelCultivo() / listaCultivos.size();
	}


}
