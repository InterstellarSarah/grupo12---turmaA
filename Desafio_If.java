package ifelse;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class Desafio_If {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean sair = true;

		System.out.println("A Esposa do Guerreiro de Java pediu para ele ir ao mercado do lado Leste da cidade ");
		System.out.println("e falou a seguinte frase: SE TIVER A�UCAR, TRAGA 1KG DE CAF� DA ILHA DE JAVA ");
		System.out.println("Sabendo-se que o Guerreiro de Java tem conhecimento pr�vio de L�gica de Programa��o ");
		System.out.println("Oque ele trouxe do Mercado??? ");
		
		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add("A�ucar e caf� da Ilha de Java !!!");
		Lista.add("Ado�ante e caf� da Ilha de Java");
		Lista.add("Somente um 1KG do caf� Cabloco, pois era o mais barato !!!");
		Lista.add("Somente um 1KG do caf� da Ilha de Java !!!");
		Lista.add("C�psulas de capuccino, pois ele ganha muito bem, por al�m de ser guerreiro � Dev. S�nior em Java !!! ");
		
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
			if (Lista.get(valorDeAlternativa).equals("Somente um 1KG do caf� da Ilha de Java !!!")) {

				System.out.println("Resposta certa, parab�ns!!");
				sair = false;
			} else {
				System.out.println("Resposta errada, tente novamente");
			}

		} while (sair);
		input.close();

	}

}
