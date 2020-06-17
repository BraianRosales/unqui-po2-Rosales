package TpComposite;

import java.util.ArrayList;

public abstract class Cultivo {

	private int gananciaAnual;

	public Cultivo(int gananciaAnual) {
		super();
		this.gananciaAnual = gananciaAnual;
	}

	public int getGananciaAnual() {
		return gananciaAnual;
	}

	public void setGananciaAnual(int gananciaAnual) {
		this.gananciaAnual = gananciaAnual;
	}
	
	
	public abstract int gananciaAnualDelCultivo();
	
	public abstract int gananciaDelCultivo();
	
	public abstract int gananciaProporcional(ArrayList<Cultivo> listaCultivos);
	
}
