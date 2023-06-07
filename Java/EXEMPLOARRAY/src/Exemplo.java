import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Exemplo {

	public static void main (String args[]) {
		/*String opcao = "";
		
		do {
			opcao = escolheOpcao();
			
			if(opcao.equals("1")) {
				arrayNormal();
			} else if(opcao.equals("2")) {
				arrayMultiDimensional();
			} else {
				System.out.print(" --- Saindo --- ");;
			}
		} while (opcao.equals("1") || opcao.equals("2"));*/
		
		teste();
		
	}
	
	
	
	/*public static void teste() {
		/*int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
		System.out.print(numeros[2][2]);*/
		
		/*int num = 5, count = 1, count2 = 1;
        do {
            num += count;
            System.out.println(num);
            count2++;
            if(count2 == 10) {
            	System.out.println("Qual tamanho queres do array fodas?");
            	count = 10;*/
           // }
        } while (count <= 3);*/
		
		/*int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);*/
		
		/*int i, num = 5;
        for (i = 0; i < 3; i++) {
            num += i;
            System.out.print(i);
        }
		
		String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
		System.out.print(nomes.length);
		*/




	}
	
	public static int getRandomNumber(int max) {
		Random random = new Random();
		return random.nextInt(max);
		
	}
	
	
	public static void arrayNormal() {
		 	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	        
	        System.out.println("Qual tamanho queres do array fodas?");
	        String q = scanner.next();
	        
	        try {
	        	int qtd = Integer.parseInt(q);
	        	int[] arr = new int[qtd];
	        	
	        	for(int i=0; i<qtd; i++) {
	        		arr[i]=getRandomNumber(100);
	        	}
	        	
	        	for(int i=0; i<qtd; i++) {
	        		System.out.println("Posição: " + i + ", Valor: " + arr[i]); 
	        	}

	        	System.out.println(" === OUTRA VISUALIZACAO === ");

	        	for(int i=0; i<qtd; i++) {
	        		System.out.println("[" + i + "] => " + arr[i]); 
	        	}
	        	
	        } catch (Exception e) {
	        	System.out.println("Passe um valor numerico");
	        }
		
	}
	
	public static void arrayMultiDimensional() {
	 	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Qual tamanho queres do array fodas?");
        String q = scanner.next();
        System.out.println("Qual tamanho queres da segunda dimensao do array fodas?");
        String q2 = scanner.next();
        
        try {
        	int qtd = Integer.parseInt(q);
        	int qtd2 = Integer.parseInt(q2);
        	int[][] arr = new int[qtd][qtd2];
        	
        	
        	for(int i=0; i<qtd; i++) {
        		for(int j=0; j<qtd2; j++) {
        			arr[i][j]=getRandomNumber(100);
        		}
        	}
        	
        	for(int i=0; i<qtd; i++) {
        		for(int j=0; j<qtd2; j++) {
        			System.out.println("Posição: " + i + " e " + j + ", Valor: " + arr[i][j]); 
        		}
        	}
        	System.out.println(" === OUTRA VISUALIZACAO === ");
        	
        	for(int i=0; i<qtd; i++) {
        		for(int j=0; j<qtd2; j++) {
	        		System.out.println("[" + i + "] [" + j + "] => " + arr[i][j]); 
        		}
        	}
        	

        } catch (Exception e) {
        	System.out.println("Passe um valor numerico");
        }
		
	}
	
	public static String escolheOpcao() {
		try  {
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

			System.out.println(" ======================================= ");
			System.out.println("Qual opcao voce quer?");
			System.out.println("1 - Array Simples");
			System.out.println("2 - Array Multidimensional");
			System.out.println("Outro - Sair");
			
			return scanner.next();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getStackTrace());
			return "Erro: ";
		} 
	}
}