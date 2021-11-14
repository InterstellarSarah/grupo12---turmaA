package ifelse;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Desafio_DoWhile {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean sair = true;

		System.out.println("Qual a principal diferen�a entre os la�os de repeti��o WHILE e DO WHILE ?");
		
		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add("N�o h� diferen�a entre os la�os. ");
		Lista.add("WHILE primeiro avalia a condicional, se for verdadeiro ele executa o c�digo.");
		Lista.add("DO WHILE primeiro avalia a condicional, se for verdadeiro ele executa o c�digo.");
		Lista.add("WHILE primeiro executa a condicional, e depois avalia se a condicional � verdadeira ou n�o.");
		Lista.add("WHILE � uma La�o de repeti��o e DO WHILE � uma classe.");
		
		do {
			

			Collections.shuffle(Lista); 
			for (int i = 0; i < Lista.size(); i++) {
				switch (i) {

				case 0:
					System.out.println("\nA) " + Lista.get(i));
					break;

				case 1:
					System.out.println("B) " + Lista.get(i));
					break;

				case 2:
					System.out.println("C) " + Lista.get(i));
					break;

				case 3:
					System.out.println("D) " + Lista.get(i));
					break;

				case 4:
					System.out.println("E) " + Lista.get(i));
					break;
				}
			}
			String alternativa = input.next();
			int valorDeAlternativa = 0;

			switch (alternativa.toLowerCase()) {

			case "a":
				valorDeAlternativa = 0;
				break;

			case "b":
				valorDeAlternativa = 1;
				break;

			case "c":
				valorDeAlternativa = 2;
				break;

			case "d":
				valorDeAlternativa = 3;
				break;

			case "e":
				valorDeAlternativa = 4;
				break;

			default:
				System.out.println("�ssa n�o � uma alternativa v�lida");
				break;
			}
			if (Lista.get(valorDeAlternativa).equals("WHILE primeiro avalia a condicional, se for verdadeiro ele executa o c�digo.")) {

				System.out.println("Resposta certa, parab�ns!!");
				sair = false;
			} else {
				System.out.println("Resposta errada, tente novamente");
			}

		} while (sair);
		input.close();

	}

}


