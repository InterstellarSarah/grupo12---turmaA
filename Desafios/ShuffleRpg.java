import java.util.Collections;

import java.util.Scanner;

import java.util.ArrayList;

public class SCrpg{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		String alt;
		boolean sair = true;
		
		
			System.out.printf("	Existe no java uma função para embaralhar conteúdos e coleções. Qual o nome da expressão?\n ");
		
			ArrayList<String> lista = new ArrayList<String>();
				lista.add("Math.Random;");  // resposta correta
				lista.add("Shuffle;");
				lista.add("Sort;");
				lista.add("Reverse;");
				lista.add("Array;");
			  //valores do array  

		do{
			Collections.shuffle(lista);      //sorteia as alternativas
			for(int i = 0; i < lista.size(); i++){ //numera o array
				switch (i){
					case 0:
						System.out.println("a) " + lista.get(i));
						break;
					case 1:
						System.out.println("b) " + lista.get(i));
						break;
					case 2:
						System.out.println("c) " + lista.get(i));
						break;
					case 3:
						System.out.println("d) " + lista.get(i));
						break;
					case 4:
						System.out.println("e) " + lista.get(i));
			}
		}
			System.out.printf("\n Digite aqui a resposta correta: ");
				alt = entrada.next();
				int n = 0;
				//pega a resposta e compara com o numero da lista
			switch (alt){
			case "a":
			case "A":
				n = 0;
				break;
			case "b":
			case "B":
				n = 0;
				break;
			case "c":
			case "C":
				n = 0;
				break;
			case "d":
			case "D":
				n = 0;
				break;
			case "e":
			case "E":
				n = 0;
				break;
			default:
				System.out.println("Escolha inválida!");
		}
			if(lista.get(n).equals("Math.Random;")){ //compara a resposta com a alternativa
				System.out.println("Resposta correta! :D");
				sair = false;
			}else {
				System.out.println("Resposta incorreta! D:");
			}
			
		} while(sair);
	}
}