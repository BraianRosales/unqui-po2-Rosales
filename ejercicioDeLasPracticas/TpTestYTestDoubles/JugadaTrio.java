package TpTestYTestDoubles;

import java.util.ArrayList;
import java.util.Iterator;

public class JugadaTrio extends Jugada{

	public JugadaTrio(Jugada jugadaPoker) {
		super(jugadaPoker);
		
	}

	@Override
	public Boolean verificar(String string, String string2, String string3, String string4, String string5) {
		ArrayList<String> listaDeCartas = new ArrayList<String>();
		listaDeCartas.add(string);
		listaDeCartas.add(string2);
		listaDeCartas.add(string3);
		listaDeCartas.add(string4);
		listaDeCartas.add(string5);
		
	ArrayList<String> cartasIguales = new ArrayList<String>();
	Iterator<String> it= listaDeCartas.iterator();
	
		Boolean hayPoquer = false;
		
		while(it.hasNext() && hayPoquer == false) {
			   cartaActual = it.next();
			   
					for(String carta: listaDeCartas) {
							if(carta == cartaActual) {
								 cartasIguales.add(carta);
								 }   
							    }	 
				hayPoquer = cartasIguales.size() >= 3;
				cartasIguales.removeAll(cartasIguales);
			}
		
	return hayPoquer;
	}

	@Override
	public String deColor(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated method stub
		return "NoEsDeColor";
	}

	@Override
	public  String esJugadaTrio(String string, String string2, String string3, String string4, String string5) {
		
		String esJugadaTrio = "NoEsJugadaTrio";
		if( this.verificar(string, string2, string3, string4, string5)){
			esJugadaTrio = "esJugadaTrio";
		}
		
		return esJugadaTrio;
		
		
	}

	@Override
	public String esJugadaNada(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated method stub
		return "NoEsJugadaNada";
	}

	

}
