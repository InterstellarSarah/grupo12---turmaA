package CavaleirodeJava_package;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Collections;

public class O_cavaleiro_de_java {
	// Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3
	// variáveis para 0;

	static int Cafeh = 3, TavernaDaUcraniana = 0, Score = 0;
	static int temp_dialog = Cafeh * 1, temp_narrativa = 150, temp_transicao = 25;
	static int ColarCompleto = 0,DesafioDoTroll01 = 0;
	static boolean  DesafioDoTroll011 = false, DesafioDoTroll02 = false;

	// O menu do jogo
	public static void main(String[] args) throws Exception {
		
		Scanner entrada = new Scanner(System.in);

		String seleciona;
		int sair = 0;
		do {
			Delay("\nO Cavaleiro de Java\n", TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println("\nA- Jogar \nB- Instrução \nC- Créditos \nD- Sair");

			seleciona = ColetarString();

			switch (seleciona) {
			case "a":
			case "A":
				jogo();
				break;
			case "b":
			case "B":
				Delay("Para desfrutar da gameplay dessa aventura, \n"
						+ "digite as opções que lhe foi apresentado na tela\n", TimeUnit.MILLISECONDS, temp_transicao);
				break;
			case "c":
			case "C":
				System.out.println("O Cavaleiro de java");
				System.out.println("Grupo 12");
				System.out.println("Integrantes: ");
				System.out.println("        ");
				System.out.println("Eduardo Ramos \nJosé Guerra \nRafael Duarte \nSarah Rodriguês \nSamuel Colina \n");
				break;

			case "d":
			case "D":
				Delay("Você deseja mesmo sair?", TimeUnit.MILLISECONDS, temp_transicao);
				System.out.println("\nS / N");
				seleciona = entrada.next();

				if (seleciona.equals("S") || seleciona.equals("s")) {
					Delay("Até um outro dia", TimeUnit.MILLISECONDS, temp_dialog);
					sair++;
				}
				break;
			default:
				System.out.println("Por favor, selecione uma opção valida");
				break;
			}
		} while (sair == 0);
	}

	// Aqui é aonde o jogo todo se passa
	public static void jogo() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int seleciona;

		// esse trecho a seguir é apenas um protótipo de como vai funcionar o jogo,
		// ainda não foi adicionado nenhum desafio nele
		Delay("Você acorda com um homem muito velho e barbudo te levantando e gritando\n"
				+ "Velho Barbudo: Nao ha tempo para explicar, você precisa fechar essa fissura", TimeUnit.MILLISECONDS,
				temp_dialog);
		do {
			System.out.print(
					"\n 1- Quem é você? \n 2- Oque esta acontecendo?! \n 3- Eu nao sei como fechala \n 4- Irei fecha-la");
			seleciona = entrada.nextInt();
			if (seleciona == 1) {
				Delay("Velho barbudo: Como eu disse, não a tempo para explicar!, feche essa fissura",
						TimeUnit.MILLISECONDS, temp_dialog);
			}

			if (seleciona == 2) {
				Delay("Velho barbudo: Se esta fissura não for fechada, nos iremos morrer aqui, e so você pode fechala\n então se apresse",
						TimeUnit.MILLISECONDS, temp_dialog);
			}

				
			
			if (seleciona == 3) {
				Delay("Velho barbudo: Concentre-se apenas na logica, pois você já possui a forca",
						TimeUnit.MILLISECONDS, temp_dialog);
			}

		} while (seleciona != 4);
		// Aqui é aonde se inicia com o primeiro desafio
		df_SCrpg();

		Delay("A fissura se fecha, mas é possivel se escutar uma voz\n ??? : Maldito seja!!, os magos iram conhecer toda agonia deste mundo",
				TimeUnit.MILLISECONDS, temp_dialog);
		Delay("\nVelho Barbudo: Seja quem for devemos impedir que venha para nosso mundo, enfim, venha comigo, irei leva-lo para o seu proximo destino",
				TimeUnit.MILLISECONDS, temp_dialog);
		Delay("\nVelho Barbudo: Bem-Vindo a cidade do pico da montanha, aqui antes era apenas uma parada, mas varias pessoas comecaram\n  "
				+ " aparecer neste lugar para resolver a crise com os dragoes, enfim, há muito oque fazer para impedir os dragoes\n "
				+ " boa sorte \n ... \n a próposito, meu nome e Baal ", TimeUnit.MILLISECONDS, temp_dialog);
		Parte_central();

	}

	public static void Parte_central() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;

		System.out.println("\n Para onde ir agora?\n  \n 1- Oeste \n 2- Leste");
		decicao = entrada.nextInt();

		switch (decicao) {
		case 1:
			Parte_Oeste();
			break;
		case 2:
			Parte_Leste();
			break;
		default:System.out.println("\n acho que não e por aqui");
			Parte_central();
		}
	}

	public static void Parte_Oeste() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;
		String decicao_definitivo;
		System.out.println(
				"\nParte Oeste da cidade: Esta parte esta em pedaços, mas há um grupo de pessoas reunida discutindo algo aparentemente sério\n"
						+ " 1- Ir para o centro da cidade \n 2- Perguntar as pessoas o que esta acontecendo ");
		decicao = entrada.nextInt();
		switch (decicao) {
		case 1:
			Parte_central();
			break;
		case 2:
			Delay("Campones: Existe um dragão que traiu sua raça, seu nome é seath e ele vive isolado dentro de uma caverna\n"
					+ " ao noroeste daqui, estamos decidindo quem ira confronta-lo", TimeUnit.MILLISECONDS, temp_dialog);
			System.out
					.println("\n1- Por que um dragão trairia sua própria raça? \n2- por que não vamos todos juntos? \n"
							+ "3- Eu irei visita-lo");
			decicao = ColetarInt();
			switch (decicao) {
			case 1:
				Delay("\nCampones: Humanos matam humanos, talvez so estejam apredendo conosco", TimeUnit.MILLISECONDS,temp_dialog);
				break;
			case 2:
				Delay("\nCampones: Temos que estar aqui para contra-atacar caso os dragões nos ataquem, não podemos ir todos juntos",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case 3:
				Delay("\nCampones: Tome cuidado, talvez devesse passar na parte leste do condado, veja se encontra algo de útil.", TimeUnit.MILLISECONDS,temp_dialog);
				
				Delay("\nSe for agora para o dragão, esta provavelmente é uma jornada sem volta, esta certo disso?", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.out.print("\n1- Sim \n2- Não ");
				decicao = entrada.nextInt();

				if (decicao == 1) {
					Reta_final();
				} else {
					Delay("Ainda não estou pronto", TimeUnit.MILLISECONDS, temp_dialog);
					Parte_Oeste();
				}
				break;
			}

			break;
		}
	}

	public static void Parte_Leste() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;
		Delay("\nVocê vê algumas casas e comercios, há uma Taverna e em meio as casas você vê um silhueta de um homem\n"
				+ " \n1-ir para o beco \n2-ir na taverna \n3- Voltar para parte central", TimeUnit.MILLISECONDS,
				temp_dialog);
		decicao = ColetarInt();
		switch (decicao) {
		case 1:
			BecoDoTroll();
			break;
		case 2:
			TavernaDaUcraniana();
			break;
		case 3:
			Parte_central();
			break;

		default:
			Delay("Você se perde e acaba voltando para a parte central", TimeUnit.MILLISECONDS, temp_dialog);
			Parte_central();
		}
	}

	public static void TavernaDaUcraniana() throws InterruptedException {
		int decicao;
		if (TavernaDaUcraniana == 0) {
			Delay("\nAo entrar logo se é possivel ver uma sala repleta de móveis rústicos, chifres nas paredes, e castiçais de metal descendo\n do teto, a"
					+ " iluminição das tochas e velas chama sua atenção,há muitos estandartes Azul e amarelo,\n além do cheiro da ceia que foi preparada, há uma moça no bar.",
					TimeUnit.MILLISECONDS, temp_dialog);

			Delay("\nNastya: Bem-vindo aventureiro, o que na minha taverna seria de seu agrado?\n1- Não tenho como pagar por nada \n2- sua companhia já me é bem agradável",
					TimeUnit.MILLISECONDS, temp_dialog);
			decicao = ColetarInt();
			switch (decicao) {
			case 1:
				Delay("Nastya: Para aqueles que protegem nossa cidade, costumo ser generosa, escolha algo.\n1- Cerveja no chifre \n2- Hidromel \n3- velha pantera \n4- Vodka",
						TimeUnit.MILLISECONDS, temp_dialog);
				decicao = ColetarInt();
				switch (decicao) {
				case 1:
					Delay("Nastya: A mais vendida daqui", TimeUnit.MILLISECONDS, temp_dialog);
					Cantadas();
					break;
				case 2:
					Delay("Nastya: O povo daqui não tem muito, mas sabe produzir muito disto. ", TimeUnit.MILLISECONDS,
							temp_dialog);
					Cantadas();
					break;
				case 3:
					Delay("Nastya: ÉÉÉÉÉÉÉÉ DAS BOAS ", TimeUnit.MILLISECONDS, temp_dialog);
					Cantadas();
					break;
				case 4:
					Delay("Nastya: Bem comum em uma terra distante daqui", TimeUnit.MILLISECONDS, temp_dialog);
					Cantadas();
					break;
				}
			case 2:
				Delay("Nastya:haha você é mais um daqueles que se confundem com minha simpatia.\nVolte quando tiver algo interessante.",
						TimeUnit.MILLISECONDS, temp_dialog);
				TavernaDaUcraniana = 1;
				Delay("\nVocê deixa a Taverna\n", TimeUnit.MILLISECONDS, temp_dialog);
				Parte_Leste();
				break;
			}
		}

		if (TavernaDaUcraniana == 1) {
			if (ColarCompleto == 0) {
				Delay("\nNastya: Volte quando tiver algo interessante.", TimeUnit.MILLISECONDS, temp_dialog);
				Delay("\nVocê deixa a Taverna.", TimeUnit.MILLISECONDS, temp_dialog);
				Parte_Leste();
			} else if(ColarCompleto == 1) {
				Delay("\nAo entrar você repara que Nastya esta de olho em seu Colar.\n1- dar o colar a Nastya \n2- Sair da Taverna",
						TimeUnit.MILLISECONDS, temp_dialog);
				decicao = ColetarInt();
				switch (decicao) {
				case 1:
					Delay("\nNastya: E-Este colar...onde você o conseguiu?...\nEle é uma herança que foi roubada há muitos anos."
						+ "\nObrigado, não tenho como agradecer, mas venha aqui atrás para um tratamento especial"
						+ "\nE assim nosso bravo aventureiro esqueceu de sua missão."
						+ "\nAfinal para ele era mais importante uma mulher, que sua jornada"
						+ "\nFIM\n\nParabens você concluiu o Final Da Ucraniana",
							TimeUnit.MILLISECONDS, temp_dialog);		
					System.exit(0);
					break;
				case 2:
					Parte_Leste();
				break;
				}
			}
		}
	}

	public static void Reta_final() throws InterruptedException {
		System.out.println("RETA FINAL");
	}

	public static void BecoDoTroll() throws InterruptedException {
		int decicao;
		if (DesafioDoTroll01 == 0) {

			Delay("\nVocê ve um homem calvo, com armadura de couro, e ao seu lado um escudo com a gravura de uma águia acompanhado de uma lança.",
					TimeUnit.MILLISECONDS, temp_dialog);

			Delay("\nLlort: Olha só o que temos aqui, mais um dos privilegiados do reino, mas você parace despreparado,mas posso lhe ajudar,\n"
					+ "Tenho uma charada sobre certe complexidade arcana,que tal fazermos uma aposta sim?\n1- Não tenho nada para apostar.\n2- Posso tentar. ",
					TimeUnit.MILLISECONDS, temp_dialog);
			decicao = ColetarInt();
			switch (decicao) {
			case 1:
				Delay("\nLlort: Como não você tem muito café contigo.", TimeUnit.MILLISECONDS, temp_dialog);
				Delay("\nEu tenho " + Cafeh + " cafés Comigo.", TimeUnit.MILLISECONDS, temp_dialog);
				Delay("\nLlort:É perfeito, podemos começar?\n1-Posso tentar.\n2-Não, prefiro não tentar.",
						TimeUnit.MILLISECONDS, temp_dialog);
				decicao = ColetarInt();

				switch (decicao) {
				case 1:
					DesafioDoTroll01();
					break;
				case 2:
					Delay("\nLlort: Tudo bem estarei aqui quando mudar de ideia.", TimeUnit.MILLISECONDS, temp_dialog);
					Delay("\nVocê deixa o beco\n", TimeUnit.MILLISECONDS, temp_dialog);
					Parte_Leste();
					break;
				default:
					Delay("\nOpção inválida\nVocê deixa o beco\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
				}
			case 2:
				DesafioDoTroll01();
				Parte_Leste();
				break;

			}
		} else if(DesafioDoTroll01 == 1){
			Delay("Llort: Se quiser o resto do colar deverá responder mais uma de minhas charadas.\n1-Vou me arriscar \n2-Prefiro não tentar",
					TimeUnit.MILLISECONDS, temp_dialog);
			decicao = ColetarInt();
			switch (decicao) {
			case 1:
				DesafioDoTroll02();
				break;
			case 2:
				Delay("\nVocê deixa o beco", TimeUnit.MILLISECONDS, temp_dialog);
				Parte_Leste();
				break;
			default:
				Delay("\nOpção inválida\nVocê deixa o beco", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}
		}else {
			Delay("\nPorfavor não venha mais aqui...\nVocê deixa o beco", TimeUnit.MILLISECONDS, temp_dialog);
			Parte_Leste();

		}

		Parte_Leste();
	}

	public static int df_ShuffleRpg() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		String alt;
		boolean sair = true;

		System.out.printf(
				"	Existe no java uma função para embaralhar conteúdos e coleções. Qual o nome da expressão?\n ");

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Math.Random;"); // resposta correta
		lista.add("Shuffle;");
		lista.add("Sort;");
		lista.add("Reverse;");
		lista.add("Array;");
		// valores do array

		do {
			Collections.shuffle(lista); // sorteia as alternativas
			for (int i = 0; i < lista.size(); i++) { // numera o array
				switch (i) {
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
			// pega a resposta e compara com o numero da lista
			switch (alt) {
			case "a":
			case "A":
				n = 0;
				break;
			case "b":
			case "B":
				n = 1;
				break;
			case "c":
			case "C":
				n = 2;
				break;
			case "d":
			case "D":
				n = 3;
				break;
			case "e":
			case "E":
				n = 4;
				break;
			default:
				System.out.println("Escolha inválida!");
			}
			if (lista.get(n).equals("Shuffle;")) { // compara a resposta com a alternativa
				System.out.println("Resposta correta! :D");
				sair = false;
			} else {
				if (Cafeh > 1) {
					System.out.println("Resposta errada, tente novamente" + " Você só tem " + Cafeh + " cafés contigo");
					Cafeh = Cafeh - 1;
					Score = Score - 1;
				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);

				}
			}
		} while (sair);
		Score = Score + 1;
		return Score;
	}

	public static int df_SCrpg() 	throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		String alt;
		boolean sair = true;

		System.out.printf("Quais expressões no switch são opcionais? \n ");

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Break e Default;"); // resposta correta
		lista.add("Case e Break;");
		lista.add("Else e Case;");
		lista.add("Default e While;");
		lista.add("While e Else;");
		// valores do array

		do {
			Collections.shuffle(lista); // sorteia as alternativas
			for (int i = 0; i < lista.size(); i++) { // numera o array
				switch (i) {
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
					break;
				}
			}
			System.out.printf("\n Digite aqui a resposta correta: ");
			alt = entrada.next();
			int n = 0;
			// pega a resposta e compara com o numero da lista
			switch (alt) {
			case "a":
			case "A":
				n = 0;
				break;
			case "b":
			case "B":
				n = 1;
				break;
			case "c":
			case "C":
				n = 2;
				break;
			case "d":
			case "D":
				n = 3;
				break;
			case "e":
			case "E":
				n = 4;
				break;
			default:
				System.out.println("Escolha inválida!");
			}
			if (lista.get(n).equals("Break e Default;")) { // compara a resposta com a alternativa
				System.out.println("Você conseguiu.");
				sair = false;
			} else {
				if (Cafeh > 1) {
					System.out.println("Resposta errada, tente novamente" + " Você só tem " + Cafeh + " cafés contigo");
					Cafeh = Cafeh - 1;
					Score = Score - 1;
				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);
				}
			}

		} while (sair);
		Score = Score + 1;
		return Score;
	}

	public static int DesafioDoTroll01() throws InterruptedException {
		int perda;

		Delay("Llort: Vamos a minha pergunta:", TimeUnit.MILLISECONDS, temp_dialog);
		boolean sair = true;
		Delay("Ao se deparar com esta sequencia de IF\n \nif(B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0 ) {"
				+ "\nSystem.out.println(\"Valores aceitos\");" + "\n}else { "
				+ "\nSystem.out.println(\"Valores não aceitos\");" + "\n}\n \nquais destes valores seriam aceitos?",
				TimeUnit.MILLISECONDS, temp_dialog);

		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add("Int A = 98, B = 99, C = 98,D = 102;");
		Lista.add("Int A = 88, B = 100, C = 99,D = 78;");
		Lista.add("Int A = 88, B = 99, C = 98,D = 90;");
		Lista.add("Int A = 64, B = 94, C = 102,D = 91;");
		Lista.add("Int A = 96, B = 95, C = 101,D = 102;");

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
			String alternativa = ColetarString();
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
				System.out.println("Llort: Esperava você ser burro mas nem tanto, tenta denovo");
				sair = true;
				break;
			}
			if (Lista.get(valorDeAlternativa).equals("Int A = 98, B = 99, C = 98,D = 102;")) {

				Delay("Llort: Como você acertou???\nNão quero saber, como prometido, sua recompensa:\nVocê Ganhou um colar com gravuras de flores em volta"
						+ "de um espaço em branco.\nO que eu devo fazer com isso?e onde esta o resto do colar? ",
						TimeUnit.MILLISECONDS, temp_dialog);

				sair = false;
			} else {
				Delay("Llort:Você errou,Vai me passando os cafeinados" + "Você tem " + Cafeh + "cafés contigo",
						TimeUnit.MILLISECONDS, temp_dialog);
				if (Cafeh > 1) {
					perda = Cafeh - 1;
					Score = Score - 1;
					Cafeh = Cafeh - perda;
					Delay("Você perdeu " + perda + "cafés", TimeUnit.MILLISECONDS, temp_dialog);
				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);
				}
				sair = false;
			}
		} while (sair);
		Score = Score + 1;
		DesafioDoTroll01 = 1;
		return DesafioDoTroll01;
	}

	public static int DesafioDoTroll02() throws InterruptedException {
		Delay("Llort: Eu amo a magia dos IFs, então vamos com outra dele:", TimeUnit.MILLISECONDS, temp_dialog);
		boolean sair = true;
		Delay("\nO código abaixo vai funcionar?" + "\n  if (10>1) \n" + "System.out.println(\"Hello Word\");\n   ",
				TimeUnit.MILLISECONDS, temp_dialog);

		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add("Sim");
		Lista.add("Nao");

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
				}
			}
			String alternativa = ColetarString();
			int valorDeAlternativa = 0;

			switch (alternativa.toLowerCase()) {

			case "a":
				valorDeAlternativa = 0;
				break;

			case "b":
				valorDeAlternativa = 1;
				break;
			default:
				System.out.println("\nLlort: Esperava você ser burro mas nem tanto, tenta denovo");
				sair = true;
				break;
			}
			if (Lista.get(valorDeAlternativa).equals("Sim")) {

				Delay("\nLlort:parabens... \nLlort:A verdade é que, eu não sou bom com charadas, a primeira, é minha unica, "
						+ "boa e verdadeira charada, tome seu prêmio...\nVocê ganha a parte que faltava do colar, ele não mágico, porem elegante"
						+ "\nVocê o usa no pescoço."
						+ "\nVocê sai do beco.", TimeUnit.MILLISECONDS, temp_dialog);
				DesafioDoTroll01 = 2;	
				ColarCompleto = 1;
				sair = false;
			} else {
				if (Cafeh > 1) {
					System.out.println("Resposta errada, tente novamente" + "Você tem " + Cafeh + "cafés contigo");
					Score = Score - 1;
					Cafeh = Cafeh - 1;
				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);
				}
			}
			
		} while (sair);
		Score = Score + 1;
		return Score;
	}

	public static int DesafioArray() throws InterruptedException {
		boolean sair = true; // variável para sair do loop

		System.out.println("Qual das características abaixo é padrão de um array? ");
		ArrayList<String> Lista = new ArrayList<String>(); // criação de um vetor em lista do tipo String
		Lista.add("O uso de colchetes");
		Lista.add("O uso de aspas duplas para delimitar o tamanho do vetor");
		Lista.add("O uso de sublinhado (underline) para separar o tipo de variável do vetor");
		Lista.add("A aplicação do comandos 'break' para sair do vetor após aramzenar um dado");
		Lista.add("A adição de varios outros vetores de valor 0 quando não se é delimitado um tamanho");
		// Lista.add para adicionar String diferentes e, consequentemente posições ao
		// vetor em lista
		do {
			// 'do' para que o laço seja executado ao menos uma vez
			Collections.shuffle(Lista); // embaralhar as posições do vetor em lista
			for (int i = 0; i < Lista.size(); i++) { // esse laço 'For' é para atribuir os valores embaralhado em
														// alternativas fixas, assim as alternativas sempre vão mudar de
														// lugar
				switch (i) {

				case 0:
					System.out.println("\nA) " + Lista.get(i)); // sorteia um valor embaralhado para ser alternativa
																// 'A)' etc....
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
			String alternativa = ColetarString();
			int valorDeAlternativa = 0;

			switch (alternativa.toLowerCase()) {
			// transforma qualquer letra em minuscula para padronizar
			// esse switch é para identificar a opção escolhida por um número, pois esse
			// será usado para buscar a informação do vetor referente aquele número

			case "a":
				valorDeAlternativa = 0;
				break;
			// letra 'a' vale 0, então ele vai buscar o que tem no vetor em lista na posição
			// 0

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
				System.out.println("Essa não é uma alternativa válida");
				break;
			}
			if (Lista.get(valorDeAlternativa).equals("O uso de colchetes")) {
				// Se o que ele pegar no vetor em lista na posição escolhida for igual a
				// resposta certa, ele muda a variável boolean para sair do laço, caso contrário
				// ele embaralha novamente as alternativas e recomeça o processo
				System.out.println("Resposta certa, parabéns!!");
				sair = false;
			} else {
				if (Cafeh > 1) {
					System.out.println("Resposta errada, tente novamente" + " Você só tem " + Cafeh + " cafés contigo");
					Cafeh = Cafeh - 1;
					Score = Score + 1;

				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);
				}
			}
		} while (sair);
		Score = Score + 1;
		return Score;
	}

	public static void Cantadas() throws InterruptedException {
		int decicao;

		Delay("\nAdmirado pela beleza da dama, você tenta conquista-la, qual de seus cortejos prefere?",
				TimeUnit.MILLISECONDS, temp_dialog);
		Delay("\n1- Posso te chamar de CSS? Porque eu gosto do seu estilo."
				+ " \n2- Você é um eixo terrestre? Porque meu mundo gira em torno de você. "
				+ " \n3- Você deve ser Windows 95, porque você me deixa instável. "
				+ " \n4- Você me ganhou no ‘Hello World’…", TimeUnit.MILLISECONDS, temp_dialog);

		decicao = ColetarInt();
		
		
	}

	public static int DesafioFor() throws InterruptedException {
		boolean sair = true; // variável para sair do loop

		System.out.println("Qual das características abaixo é padrão de um For? ");
		ArrayList<String> Lista = new ArrayList<String>(); // criação de um vetor em lista do tipo String
		Lista.add("O uso de variável char como seleção de alternativas");
		Lista.add("A aplicação de hifens como contador otimizado");
		Lista.add("não ter variável contador por ser um loop infinito");
		Lista.add("O uso de uma variavel contador com limite pré definido");
		Lista.add("Nenhuma das alternativas");
		// Lista.add para adicionar String diferentes e, consequentemente posições ao
		// vetor em lista
		do {
			// 'do' para que o laço seja executado ao menos uma vez
			Collections.shuffle(Lista); // embaralhar as posições do vetor em lista
			for (int i = 0; i < Lista.size(); i++) { // esse laço 'For' é para atribuir os valores embaralhado em
														// alternativas fixas, assim as alternativas sempre vão mudar de
														// lugar
				switch (i) {

				case 0:
					System.out.println("A) " + Lista.get(i)); // sorteia um valor embaralhado para ser alternativa 'A)'
																// etc....
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
			String alternativa = ColetarString();
			int valorDeAlternativa = 0;

			switch (alternativa.toLowerCase()) {
			// transforma qualquer letra em minuscula para padronizar
			// esse switch é para identificar a opção escolhida por um número, pois esse
			// será usado para buscar a informação do vetor referente aquele número

			case "a":
				valorDeAlternativa = 0;
				break;
			// letra 'a' vale 0, então ele vai buscar o que tem no vetor em lista na posição
			// 0

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
				// Se o que ele pegar no vetor em lista na posição escolhida for igual a
				// resposta certa, ele muda a variável boolean para sair do laço, caso contrário
				// ele embaralha novamente as alternativas e recomeça o processo
				System.out.println("Resposta certa, parabéns!!");
				sair = false;
			} else {
				if (Cafeh > 1) {
					System.out.println("Resposta errada, tente novamente" + " Você só tem " + Cafeh + " cafés contigo");
					Cafeh = Cafeh - 1;
					Score = Score + 1;
				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);
				}
			}
		} while (sair);
		Score = Score + 1;
		return Score;
	}

	public static int DesafioDoWhile() throws InterruptedException {
		boolean sair = true;

		System.out.println("Qual a principal diferenca entre os la�os de repeticao WHILE e DO WHILE ?");

		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add("Nao ha diferenca entre os laços. ");

		Lista.add("WHILE primeiro avalia a condicional, se for verdadeiro ele executa o codigo.");

		Lista.add("DO WHILE primeiro avalia a condicional, se for verdadeiro ele executa o codigo.");

		Lista.add("WHILE primeiro executa a condicional, e depois avalia se a condicional e verdadeira ou nao.");

		Lista.add("WHILE e uma Laço de repeticao e DO WHILE e uma classe.");

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
			String alternativa = ColetarString();
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
			if (Lista.get(valorDeAlternativa)
					.equals("WHILE primeiro avalia a condicional, se for verdadeiro ele executa o c�digo.")) {

				System.out.println("Resposta certa, parab�ns!!");
				sair = false;
			} else {
				System.out.println("Resposta errada, tente novamente" + "Você só tem " + Cafeh + "cafés contigo");
				if (Cafeh > 1) {

					Score = Score - 1;

				} else {
					if (Cafeh > 1) {
						System.out
								.println("Resposta errada, tente novamente" + " Você tem " + Cafeh + " cafés contigo");
						Cafeh = Cafeh - 1;
						Score = Score - 1;
					} else {
						Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
					}
				}
			}

		} while (sair);

		Score = Score + 1;
		return Score;
	}

	static int DesafioIf() throws InterruptedException {
		boolean sair = true;

		System.out.println("Na estrutura de decisão IF e ELSE, a expressão condicional deve estar dentro de:  ");

		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add(" ( ) parenteses ");
		Lista.add(" { } chaves ");
		Lista.add(" [ ] colchetes ");
		Lista.add(" ' ' aspas simples ");
		Lista.add("(()) parenteses duplo ");

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
			String alternativa = ColetarString();
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
				System.out.println("Éssa não é uma alternativa válida");
				break;
			}
			if (Lista.get(valorDeAlternativa).equals(" ( ) parenteses ")) {

				System.out.println("Resposta certa, parabéns!!");
				sair = false;
			} else {
				if (Cafeh > 1) {
					System.out.println("Resposta errada, tente novamente" + " Você tem " + Cafeh + " cafés contigo");
					Cafeh = Cafeh - 1;
					Score = Score - 1;
				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);
				}
			}
		} while (sair);
		Score = Score + 1;
		return Score;
	}

	// Metódo criado para coleta de Strings
	public static String ColetarString() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		String word;
		word = entrada.next();
		return word;
	}

	// Metódo criado para coleta de Int
	public static int ColetarInt() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int num;
		num = entrada.nextInt();
		return num;
	}

	// Este método é o responsavel para dar um "delay" nas messagens do jogo
	public static void Delay(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
}