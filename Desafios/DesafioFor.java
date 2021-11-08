import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList; //classe de listas em array

public class DesafioFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean sair = true; //variável para sair do loop

		System.out.println("Qual das características abaixo é padrão de um For? ");
		ArrayList<String> Lista = new ArrayList<String>(); //criação de um vetor em lista do tipo String
		Lista.add("O uso de variável char como seleção de alternativas");
		Lista.add("A aplicação de hifens como contador otimizado");
		Lista.add("não ter variável contador por ser um loop infinito");
		Lista.add("O uso de uma variavel contador com limite pré definido");
		Lista.add("Nenhuma das alternativas");
		//Lista.add para adicionar String diferentes e, consequentemente posições ao vetor em lista
		do {
			//'do' para que o laço seja executado ao menos uma vez
			Collections.shuffle(Lista); //embaralhar as posições do vetor em lista
			for (int i = 0; i < Lista.size(); i++) { //esse laço 'For' é para atribuir os valores embaralhado em alternativas fixas, assim as alternativas sempre vão mudar de lugar
				switch (i) {

				case 0:
					System.out.println("A) " + Lista.get(i)); //sorteia um valor embaralhado para ser alternativa 'A)' etc....
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
			//transforma qualquer letra em minuscula para padronizar
			//esse switch é para identificar a opção escolhida por um número, pois esse será usado para buscar a informação do vetor referente aquele número
			
			case "a":
				valorDeAlternativa = 0;
				break;
			//letra 'a' vale 0, então ele vai buscar o que tem no vetor em lista na posição 0	

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
				System.out.println("Éssa não é uma alternativa válida");
				break;
			}
			if (Lista.get(valorDeAlternativa).equals("O uso de uma variavel contador com limite pré definido")) {
			//Se o que ele pegar no vetor em lista na posição escolhida for igual a resposta certa, ele muda a variável boolean para sair do laço, caso contrário ele embaralha novamente as alternativas e recomeça o processo	
				System.out.println("Resposta certa, parabéns!!");
				sair = false;
			} else {
				System.out.println("Resposta errada, tente novamente");
			}

		} while (sair);
		input.close();

	}

}