package TpTestYTestDoubles;

import java.util.ArrayList;
import java.util.Iterator;

public class PokerStatus  {

	
	protected String cartaActual;
	public Jugada jugadaPoker;
	
	
	public PokerStatus(Jugada jugadaPoker) {
		
		this.jugadaPoker = jugadaPoker;
	}
	
	
	//DE UNA LISTA DE STRINGS ME DONOTA TRUE SI AL MENOS HAY 4 STRINGS IGUALES EN DICHA LISTA.
	
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
				hayPoquer = cartasIguales.size() >= 4;
				cartasIguales.removeAll(cartasIguales);
			}
		
	return hayPoquer;	
  }


public Jugada getJugadaPoker() {
	return jugadaPoker;
}


public void setJugadaPoker(Jugada jugadaPoker) {
	this.jugadaPoker = jugadaPoker;
}


}













