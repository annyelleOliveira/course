package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		//OBTER TAMANHO DA LISTA
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		//REMOVER ITENS SE A PRIMEIRA LETRA FOR M
		
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		// ENCONTRAR A POSIÇÃO DO ELEMENTO
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// ENCONTRAR A POSIÇÃO DO ELEMENTO INEXISTENTE (-1)
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
		
		// FILTRAR OS ELEMENTOS QUE INICIAM COM DETERMINADA LETRA
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		// FILTRAR OS ELEMENTOS QUE INICIAM COM DETERMINADA LETRA E APRESNETAR O PRIMEIRO ENCONTRADO OU NULL
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
