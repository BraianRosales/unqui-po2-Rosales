package TpTestYTestDoubles;



public abstract class Jugada extends PokerStatus{

	public Jugada(Jugada jugadaPoker) {
		super(jugadaPoker);
		
	}
	
	
	public abstract Boolean verificar(String string, String string2, String string3, String string4, String string5);


	public String esPoquer(String string, String string2, String string3, String string4, String string5) {
	
		String esPoquer = "NoEsPoquer";
		if( this.verificar(string, string2, string3, string4, string5)){
			esPoquer = "esPoquer";
		}
		
		return esPoquer;
	}


	public abstract String deColor(String string, String string2, String string3, String string4, String string5);

	public abstract String esJugadaTrio(String string, String string2, String string3, String string4, String string5);
	
	public abstract String esJugadaNada(String string, String string2, String string3, String string4, String string5);
}
