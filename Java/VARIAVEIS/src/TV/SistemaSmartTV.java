package TV;
public class SistemaSmartTV {
	//boolean ligada = false;
	//int canal=1;			;
	//int volume = 25;
	
	boolean ligada;
	int canal;			
	int volume;
	
	public SistemaSmartTV() {
		 ligada = false;
		 canal=1;		
		 volume = 25;
	}

	
	public SistemaSmartTV(boolean pLigado) {
		 ligada = pLigado;
	}

	public SistemaSmartTV(boolean pLigado, int pVolume) {
		 ligada = pLigado;
		 volume = pVolume;
	}

	public SistemaSmartTV( int pVolume) {
		 volume = pVolume;
	}
	
	public void aumentarVolume () {
		volume++;
	}
	
	public void diminuirVolume () {
		volume--;
	}
	
	
	public void ligar() {
		ligada=true;
	}
	public void desligar() {
		ligada=false;
		}
	
	
	public void mudarCanal (int novoCanal) {
		canal = novoCanal;
	}
	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}
	
	
	
	
	
}