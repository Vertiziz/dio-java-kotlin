package TV;
public class Usuario {
	public static void main(String[] args) throws Exception {
		
		SistemaSmartTV smartTv = new SistemaSmartTV();
		SistemaSmartTV smartTv2 = new SistemaSmartTV(true, 5);
		

		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("TV Ligada? " + smartTv2.ligada);
		
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();

		System.out.println("Canal Atual? " + smartTv.canal);
		
		smartTv.mudarCanal(13);
		System.out.println("Canal Atual? " + smartTv.canal);

		System.out.println("TV Ligada? " + smartTv.ligada);
		
		System.out.println("Volume Atual " + smartTv.volume);
		
		smartTv.ligar ();
		System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);
		smartTv.desligar ();
		System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);

		
	}

}
