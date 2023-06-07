package exLista;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class Bandido  {
	public static void main(String[] args) {
		
		a();
	}
	
	public static void oldMain() {

		List<String> perguntas = createQuestions();
		Map<Integer, String> mapAnswer = createMap();
			
		int cont=0;
		for(String P : perguntas) {
			cont += resposta(P);
		}
		
		String r = mapAnswer.getOrDefault(cont, "Inocente");
		System.out.println(r);
	}
	
	public static int resposta(String P) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		String resp = null;

		System.out.println(P);
		resp = scanner.next();
			 
		if(resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("Y"))
			return 1;
		
		return 0;
	}
	
	public static Map<Integer, String> createMap(){
		Map<Integer, String> mapAnswer = new HashMap<Integer, String>();
		
		mapAnswer.put(2, "Suspeito");
		mapAnswer.put(3, "Cumplice");
		mapAnswer.put(4, "Cumplice");
		mapAnswer.put(5, "Assassino");
		
		return mapAnswer;
	}
	
	public static List<String> createQuestions(){
		List<String> perguntas = Arrays.asList("Telefonou para a vítima?", "Mora perto da vítima?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?");
		return perguntas;
	}
	

	public static void teste() {
		List<String> t = new ArrayList<>();
		t.add("Telefonou para a vítima?");
		t.add("Mora perto da vítima?a?");
		t.add("TMora perto da vítima?");
		t.add("Devia para a vítima?");
		t.add("Já trabalhou com a vítima?");
		
		t.forEach(x -> {
			System.out.println(x);
		});
		
		
		
		
	}
	
	public static void a() {
		List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't'); 
		 System.out.println(consoantesMeuNome);
	}

}
	
	
