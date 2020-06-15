package TpTestYTestDoubles;


public class Carta {

	private int valor;
	private String palo;
	
	
	public Carta(int valor, String palo) {
		
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean esMayorA(Carta carta2) {
		
		return this.getValor() > carta2.getValor();
	}
	
	

}
