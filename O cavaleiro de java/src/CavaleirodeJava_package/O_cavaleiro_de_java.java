package CavaleirodeJava_package;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Collections;

public class O_cavaleiro_de_java {
	// variaveis globais.

	// variaveis como, TavernaDaUcraniana, ColarCompleto e DesafioDoTroll01,
	// sao usadas para evitar, repeticao de dialogose desafios.
	static int Cafeh = 3, TavernaDaUcraniana = 0, Score = 0;
	// Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3
	// variáveis para 0;
	static int temp_dialog = Cafeh * 1, temp_narrativa = 20, temp_transicao = 25, temp_creditos = 150;
	static int ColarCompleto = 0, DesafioDoTroll01 = 0;

	//Esses metodos com "menu" antes no nome sao opçoes do menu
	public static void menu_intrucao() throws InterruptedException{
		Delay("Para desfrutar da gameplay dessa aventura, \n"
				+ "digite as opções que lhe foi apresentado na tela\n Sua vida é baseada em 'café', caso ela chegue a zero\n GAME OVER,"
				+ " acerte perguntas para ganhar café.", TimeUnit.MILLISECONDS, temp_transicao);
		
	}
	
	public static void menu_Creditos() throws InterruptedException{

		Delay("\n\nO Cavaleiro de java\nGrupo 12\nIntegrantes: \nEduardo Ramos \nJose Guerra \nRafael Duarte \nSarah Rodrigues \nSamuel Colina \n",
				TimeUnit.MILLISECONDS, temp_transicao);
	}
	
	public static void menu_sair() throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		String seleciona;
		
		Delay("Você deseja mesmo sair?", TimeUnit.MILLISECONDS, temp_transicao);
		System.out.println("\nS / N");
		seleciona = entrada.next();

		if (seleciona.equals("S") || seleciona.equals("s")) {
			Delay("Até um outro dia", TimeUnit.MILLISECONDS, temp_dialog);
			System.exit(0);
		}
		
	
	}
	
	// O menu do jogo
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		String seleciona;
		int sair = 0;
		do {
			Delay("\nO Cavaleiro de Java\n", TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println("\nA- Jogar \nB- Instrução \nC- Créditos \nD- Sair");

			seleciona = entrada.next();

			switch (seleciona) {
			case "a":
			case "A":
				jogo();
				break;
			case "b":
			case "B":
				menu_intrucao();
				break;
			case "c":
			case "C":
				menu_Creditos();
				break;

			case "d":
			case "D":
			    menu_sair();
				break;
			}
		} while (sair == 0);

	}

	// Aqui é aonde o jogo começa, apos escolhe "Jogar" no menu.
	public static void jogo() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int seleciona;

		Delay("Você acorda com um homem muito velho e barbudo te levantando e gritando\n"
				+ "Velho Barbudo: Nao ha tempo para explicar, você precisa fechar essa fissura", TimeUnit.MILLISECONDS,
				temp_dialog);
		// do-while responsável para repetição do diálogo.
		do {
			System.out.print(
					// a primeira forma de escolha de diálogo, feita em if, porem ao longo do
					// código, terá apenas switchs para isso.
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

	// A estrutura do código funciona, separando desafios e locais por metodos,
	// mantendo sempre esse padrão para evitar problemas.
	public static void Parte_central() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;

		System.out.println("\nHá apenas um grande e velho pilar aqui\n Para onde ir agora?\n  \n 1- Oeste \n 2- Leste");
		decicao = entrada.nextInt();

		switch (decicao) {
		case 1:
			Parte_Oeste();
			break;
		case 2:
			Parte_Leste();
			break;
		default:
			System.out.println("\n acho que não e por aqui");
			
			Parte_central();
		}
	}

	// Local
	public static void Parte_Oeste() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;
		System.out.println(
				"\nParte Oeste da cidade: Esta parte esta em pedacos, mas ha um grupo de pessoas reunida discutindo algo aparentemente serio\n"
						+ "1- Voltar para o centro da cidade \n2- Perguntar as pessoas o que esta acontecendo ");
		decicao = entrada.nextInt();

		switch (decicao) {
		case 1:
			Parte_central();
			break;
		case 2:
			// ele repete o dialogo do pessoal da parte oeste
			do {
				Delay("\nCampones: Existe um dragão que traiu sua raca, seu nome e Seath e ele vive isolado dentro de uma caverna\n"
						+ "ao noroeste daqui, estamos decidindo quem ira confronta-lo", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.out.println(
						"\n1- Por que um dragao trairia sua propria raca? \n2- por que nao vamos todos juntos? \n"
								+ "3- Eu irei visita-lo\n4- Eu tenho que ir");
				decicao = entrada.nextInt();

				switch (decicao) {
				case 1:
					Delay("\nCampones: Humanos matam humanos, talvez so estejam apredendo conosco",
							TimeUnit.MILLISECONDS, temp_dialog);
					break;
				case 2:
					Delay("\nCampones: Temos que estar aqui para contra-atacar caso os dragoes nos ataquem, nao podemos ir todos juntos",
							TimeUnit.MILLISECONDS, temp_dialog);
					break;
				case 3:
					Delay("\nCampones: Tome cuidado, talvez devesse passar na parte leste do condado, veja se encontra algo de útil.",
							TimeUnit.MILLISECONDS, temp_dialog);

					Delay("\nSe for agora para o dragao, esta provavelmente e uma jornada sem volta, esta certo disso?",
							TimeUnit.MILLISECONDS, temp_dialog);
					System.out.print("\n1- Sim \n2- Nao ");
					decicao = entrada.nextInt();

					if (decicao == 1) {
						Reta_final();
					} else {
						Delay("Ainda nao estou pronto", TimeUnit.MILLISECONDS, temp_dialog);
						Parte_Oeste();
					}
					break;
				default:
					Delay("\nVoce quer agua?, nao consigo te entender", TimeUnit.MILLISECONDS, temp_dialog);
					break;
				case 4:
					Parte_Oeste();
					break;
				}
			} while (decicao != 4);
			break;
		default:
			Delay("Não sei para onde ir, entao vou ficar aqui", TimeUnit.MILLISECONDS, temp_dialog);
			Parte_Oeste();
		
			break;
		}
	}

	// Local
	public static void Parte_Leste() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;
		Delay("\nVocê vê algumas casas e comercios, há uma Taverna e em meio as casas você vê um silhueta de um homem\n"
				+ " \n1-ir para o beco \n2-ir na taverna \n3- Voltar para parte central", TimeUnit.MILLISECONDS,
				temp_dialog);
		decicao = entrada.nextInt();
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
			Delay("\nVocê se perde e acaba voltando para a parte central", TimeUnit.MILLISECONDS, temp_dialog);
			Parte_central();
		
		}
	}

	// Local
	public static void TavernaDaUcraniana() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;
		if (TavernaDaUcraniana == 0) {
			Delay("\nAo entrar logo se é possivel ver uma sala repleta de móveis rústicos, chifres nas paredes, e castiçais de metal descendo\n do teto, a"
					+ " iluminição das tochas e velas chama sua atenção,há muitos estandartes Azul e amarelo,\n além do cheiro da ceia que foi preparada, há uma moça no bar.",
					TimeUnit.MILLISECONDS, temp_dialog);

			Delay("\nNastya: Bem-vindo aventureiro, o que na minha taverna seria de seu agrado?\n1- Não tenho como pagar por nada \n2- sua companhia já me é bem agradável",
					TimeUnit.MILLISECONDS, temp_dialog);
			decicao = entrada.nextInt();
			switch (decicao) {
			case 1:
				Delay("Nastya: Para aqueles que protegem nossa cidade, costumo ser generosa, escolha algo.\n1- Cerveja no chifre \n2- Hidromel \n3- velha pantera \n4- Vodka",
						TimeUnit.MILLISECONDS, temp_dialog);
				decicao = entrada.nextInt();
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
			} else if (ColarCompleto == 1) {
				Delay("\nAo entrar você repara que Nastya esta de olho em seu Colar.\n1- dar o colar a Nastya \n2- Sair da Taverna",
						TimeUnit.MILLISECONDS, temp_dialog);
				decicao = entrada.nextInt();
				switch (decicao) {
				case 1:
					Delay("\nNastya: E-Este colar...onde você o conseguiu?...\nEle é uma herança que foi roubada há muitos anos."
							+ "\nObrigado, não tenho como agradecer, mas venha aqui atrás para um tratamento especial"
							+ "\nE assim nosso bravo aventureiro esqueceu de sua missão."
							+ "\nAfinal para ele era mais importante uma mulher, que sua jornada"
							+ "\nFIM\n\nParabens você concluiu o Final Da Ucraniana", TimeUnit.MILLISECONDS,							
							temp_dialog);
					Delay("\n\nO Cavaleiro de java\nGrupo 12\nIntegrantes: \nEduardo Ramos \nJose Guerra \nRafael Duarte \nSarah Rodrigues \nSamuel Colina \n\nObrigado por jogar S2",
							TimeUnit.MILLISECONDS, temp_creditos);
					System.exit(0);
					break;
				case 2:
					Parte_Leste();
			
					break;
				}
			}
		}
	}

	// Local
	public static void Reta_final() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decisao;

		do {
			Delay("\nVoce chega ate a caverna e encontra o dragao olhando fixamente para voce\n"
					+ "???: Meu nome e Seath e eu estava a sua espera...\n1- O que voce veio fazer aqui"
					+ "\n2- O que voce sabe sobre a volta dos dragoes \n3- Por que te chamam de o 'dragao traidor'? ",
					TimeUnit.MILLISECONDS, temp_dialog);
			decisao = entrada.nextInt();
			switch (decisao) {
			case 1:
				Delay("\nSeath: Eu fui o primeiro dos dragoes a despertar e eu sabia que o escolhido viria para ca",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case 2:
				Delay("\nSeath: Os dragoes estao lentamente acordando de seu profundo sono, isso se deve por causa da magia dos magos de java estar enfraquendo\n"
						+ "Assim que estiverem totalmente acordados, eles iram se vingar da humanidade",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case 3:
				Delay("\nSeath: No passado, eu ajudei os magos de java com uma poderosa magia capaz de colocar qualquer ra�a desta terra para dormir\n"
						+ "eu fiz isso na esperanca de que no futuro a sede de sangue da minha especie diminui-se, mas aparentemente nao funcionou...\n"
						+ "\n1- O que podemos fazer para impedi-los? \n2- Nao podemos formar um acordo de paz com eles? \n3- Deixe-me perguntar outra coisa",
						TimeUnit.MILLISECONDS, temp_dialog);
				decisao = entrada.nextInt();
				switch (decisao) {
				case 1:
					Delay("\nSeath: Ha 4 pilares espalhados por essa terra, cada um deles tem um enigma, eu nao consigo descifrala...\n mas voce consegue."
							+ " venha, irei leva-lo em minhas costas para resolver esses enigmas",
							TimeUnit.MILLISECONDS, temp_dialog);
					decisao = 4;
					break;

				case 2:
					Delay("\nSeath: Eles estao muito furiosos, mesmo sonhando eles demonstram um grande odio pela humanidade",
							TimeUnit.MILLISECONDS, temp_dialog);
					break;
				case 3:
					Reta_final();
					break;
				default:
					Delay("\nSeath: Voce esta se engasgando, quer um copo d'agua?", TimeUnit.MILLISECONDS, temp_dialog);
					break;

				}
				break;
			default:
				Delay("\nSeath: Voce esta se engasgando, quer um copo d'agua?", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (decisao != 4);

		Delay("\nEntão por 9 horas, Seath e o cavaleiro de java percorreram as terras de java, resolvendo enigma por enigma.",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Delay("\nPilar 1: ", TimeUnit.MILLISECONDS, temp_narrativa);
		DesafioArray();

		Delay("\nPilar 2: ", TimeUnit.MILLISECONDS, temp_narrativa);
		DesafioDoWhile();

		Delay("\nPilar 3: ", TimeUnit.MILLISECONDS, temp_narrativa);
		DesafioFor();

		Delay("\nPilar 4: ", TimeUnit.MILLISECONDS, temp_narrativa);
		DesafioIf();

		Delay("\nEnquanto Seath te carrega de volta para montanha ele sorri e lhe diz...\n\nSeath: Esta feito, agora depois de muitos anos"
				+ " os dragoes nao apenas voltaram, mas voltaram \ncom todas as forca para destruir esse mundo hahahahaha, eu disse faria voce sentir toda a agonia deste mundo\n\nSeath: obrigado humano,"
				+ " eu nao teria conseguido sem voce\n\nSeath entao derruba o cavaleiro de suas costas e vai em direcao com ao pico da montanha",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Delay("\nO cavaleiro acorda em uma ravina com uma luz branca muito forte cobrindo seu corpo",
				TimeUnit.MILLISECONDS, temp_narrativa);

		decisao = 0;
		do {
			Delay("\n\nBaal: Acorde, voce nao pode morrer aqui, voce ainda pode impedir os dragoes\n\n1- O que voce fez comigo\n2- O que e voce?\n3- por que so eu posso impedir os dragoes? \n4- Como eu detenho os dragoes?\n"
					+ "5- Por Seath nos traiu?", TimeUnit.MILLISECONDS, temp_dialog);
			decisao = entrada.nextInt();
			switch (decisao) {
			case 1:
				Delay("\nBaal: Eu usei o resto de minha magica para te curar", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case 2:
				Delay("\nBaal: Eu ja estou morto a muito tempo, eu assumi esta forma apenas para encontrar o escolhido",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;

			case 3:
				Delay("\nBaal: Voce e o unico que esta com forca total, digamos que voce esta no auge de sua forca, o restante dos magos ja estao enfraquecidos",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;

			case 4:
				Delay("\nBaal: Seath lhe fez ativar 4 pilares, mas ha um quinto, o pilar dos desejos, com ele e possivel pedir qualquer desejo\n"
						+ "mas e claro que para usa-lo e necessario resolver um enigma. Esse pilar se encontra no centra da cidade do pico da montanha",
						TimeUnit.MILLISECONDS, temp_dialog);

				decisao = 4;
				break;
			case 5:
				Delay("\nBaal: Talvez ele nunca tivesse sido um traidor de sua raca, talvez todo esse tempo isso apenas fazia parte de seu plano",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			default:
				Delay("\nNao entendo do que voce esta falando", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (decisao != 4);

		Delay("\nBaal acompanha o cavaleiro ate o pilar da cidade e pode-se observar que a cidade esta um caos",
				TimeUnit.MILLISECONDS, temp_narrativa);
		Delay("\nBaal: rapido use sua magia no pilar para salvar-nos a todos", TimeUnit.MILLISECONDS, temp_dialog);
		df_ShuffleRpg();
		// fim de jogo
		Delay("\n\nBaal:Voce conseguiu...\nBaal: Finalmente paz. \n\nBaal comeca a desaparecer, e a paz e novamente restaurada na terra de Java..."
				+ "\n\n                  FIM\n \nPARABENS VOCE CONCLUIU O FINAL PRINCIPAL DO CAVALEIRO DE JAVA\n\nSua Pontuacao foi de: "
				+ Score, TimeUnit.MILLISECONDS, temp_narrativa);

		Delay("\n\nO Cavaleiro de java\nGrupo 12\nIntegrantes: \nEduardo Ramos \nJose Guerra \nRafael Duarte \nSarah Rodrigues \nSamuel Colina \n\nObrigado por jogar S2",
				TimeUnit.MILLISECONDS, temp_creditos);
	
		System.exit(0);

	}

	// Local
	public static void BecoDoTroll() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;
		if (DesafioDoTroll01 == 0) {

			Delay("\nVocê ve um homem calvo, com armadura de couro, e ao seu lado um escudo com a gravura de uma águia acompanhado de uma lança.",
					TimeUnit.MILLISECONDS, temp_dialog);

			Delay("\n\nLlort: Olha só o que temos aqui, mais um dos privilegiados do reino, mas você parace despreparado,mas posso lhe ajudar,\n"
					+ "Tenho uma charada sobre certe complexidade arcana,que tal fazermos uma aposta sim?\n1- Não tenho nada para apostar.\n2- Posso tentar. ",
					TimeUnit.MILLISECONDS, temp_dialog);
			decicao = entrada.nextInt();
			switch (decicao) {
			case 1:
				Delay("\n\nLlort: Como não você tem muito café contigo.", TimeUnit.MILLISECONDS, temp_dialog);
				Delay("\n\nEu tenho " + Cafeh + " cafés Comigo.", TimeUnit.MILLISECONDS, temp_dialog);
				Delay("\n\nLlort:É perfeito, podemos começar?\n1-Posso tentar.\n2-Não, prefiro não tentar.",
						TimeUnit.MILLISECONDS, temp_dialog);
				decicao = entrada.nextInt();

				switch (decicao) {
				case 1:
					DesafioDoTroll01();
					Parte_Leste();
					break;
				case 2:
					Delay("\nLlort: Tudo bem estarei aqui quando mudar de ideia.", TimeUnit.MILLISECONDS, temp_dialog);
					Delay("\n\nVocê deixa o beco\n", TimeUnit.MILLISECONDS, temp_dialog);
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
		} else if (DesafioDoTroll01 == 1) {
			Delay("Llort: Se quiser o resto do colar deverá responder mais uma de minhas charadas.\n1-Vou me arriscar \n2-Prefiro não tentar",
					TimeUnit.MILLISECONDS, temp_dialog);
			decicao = entrada.nextInt();
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
			
		}else if(DesafioDoTroll01 == 0) {
			DesafioDoTroll01();
			
		}else {
			Delay("\nPorfavor não venha mais aqui...\nVocê deixa o beco", TimeUnit.MILLISECONDS, temp_dialog);
			Parte_Leste();

		}
		
		Parte_Leste();
	}

	// Desafio
	public static int df_ShuffleRpg() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		String alt;
		boolean sair = true;// usado para repeticao da pergunta, caso erre

		System.out.printf(
				"	\nExiste no java uma função para embaralhar conteúdos e coleções. Qual o nome da expressão?\n ");

		ArrayList<String> lista = new ArrayList<String>();
		// alocação das respostar em um array para, ser feita a randomicidade na
		// compilação.

		lista.add("Math.Random;");
		lista.add("Shuffle;");// Resposta certa
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
				System.out.println("");
				sair = false;
			} else {
				if (Cafeh > 1) {
					System.out.println("Resposta errada, tente novamente" + " Você só tem " + Cafeh + " cafés contigo");
					Cafeh = Cafeh - 1;// Penaliza na "vida" do jogador
					Score = Score - 1;// penaliza no Score do jogador
				} else {
					/*
					 * para que o jogo tenha uma dificuldade em si, a repeticao do do-while, fará
					 * com que perca gradativemente seus cafes que são pontos de vida.
					 */
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);

				}
			}
		} while (sair);
		Score = Score + 1;// recompensa por acertar a pergunta
		Cafeh = Cafeh + 1;
		return Score;
	}

	// Desafio
	public static int df_SCrpg() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		String alt;
		boolean sair = true;

		System.out.printf("\nQuais expressões no switch são opcionais? \n ");

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
		Cafeh = Cafeh + 1;
		return Score;
	}

	// Desafio
	public static int DesafioDoTroll01() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int perda;

		Delay("Llort: Vamos a minha pergunta:", TimeUnit.MILLISECONDS, temp_dialog);
		boolean sair = true;
		Delay("Ao se deparar com esta sequencia de IF\n \nif(B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0 ) {"
				+ "\nSystem.out.println(\"Valores aceitos\");" + "\n}else { "
				+ "\nSystem.out.println(\"Valores não aceitos\");" + "\n}\n \nquais destes valores seriam aceitos?",
				TimeUnit.MILLISECONDS, temp_dialog);

		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add("Int A = 98, B = 99, C = 98,D = 102;"); // alternativa correta
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
			String alternativa = entrada.next();
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
				DesafioDoTroll01 = 1;
				sair = false;
			} else {
				Delay("Llort:Você errou,Vai me passando os cafeinados" + "Você tem " + Cafeh + "cafés contigo",
						TimeUnit.MILLISECONDS, temp_dialog);
				/*
				 * este desafio é diferente,alem de opcional, ele é para punir severamente o
				 * jogador, ele sempre irá deixa-lo com 1 Cafeh, no caso de ter apenas 1, e o
				 * jogador voltar a perder aparece Game Over
				 */
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
		Cafeh = Cafeh + 1;
		return DesafioDoTroll01;
	}

	// Desafio
	public static int DesafioDoTroll02() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
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
			String alternativa = entrada.next();
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
						+ "\nVocê o usa no pescoço." + "\nVocê sai do beco.", TimeUnit.MILLISECONDS, temp_dialog);
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
					// comando abaixo para encerrar o código.
					System.exit(0);
				}
			}

		} while (sair);
		Score = Score + 1;
		Cafeh = Cafeh + 1;
		return Score;
	}

	// Desafio
	public static int DesafioArray() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		boolean sair = true; // variável para sair do loop

		System.out.println("\nQual das características abaixo é padrão de um array? ");
		ArrayList<String> Lista = new ArrayList<String>(); // criação de um vetor em lista do tipo String
		Lista.add("O uso de colchetes"); // alternativa correta
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
			String alternativa = entrada.next();
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
					Score = Score - 1;

				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);
				}
			}
		} while (sair);
		Score = Score + 1;
		Cafeh = Cafeh + 1;
		return Score;
	}

	// "Desafio"
	public static void Cantadas() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int seleciona;
		Delay("\nAdmirado pela beleza da dama, você tenta conquista-la, qual de seus cortejos prefere?",
				TimeUnit.MILLISECONDS, temp_dialog);
		
		Delay("\n1- Posso te chamar de CSS? Porque eu gosto do seu estilo."
				+ " \n2- Você é um eixo terrestre? Porque meu mundo gira em torno de você. "
				+ " \n3- Você deve ser Windows 95, porque você me deixa instável. "
				+ " \n4- Você me ganhou no ‘Hello World’…", TimeUnit.MILLISECONDS, temp_dialog);
		seleciona = entrada.nextInt();
		
	}

	// Desafio
	public static int DesafioFor() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		boolean sair = true; // variável para sair do loop

		System.out.println("\nQual das características abaixo é padrão de um For? ");
		ArrayList<String> Lista = new ArrayList<String>(); // criação de um vetor em lista do tipo String
		Lista.add("O uso de variável char como seleção de alternativas");
		Lista.add("A aplicação de hifens como contador otimizado");
		Lista.add("não ter variável contador por ser um loop infinito");
		Lista.add("O uso de uma variavel contador com limite pré definido");// alternativa correta
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
			String alternativa = entrada.next();
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
					Score = Score - 1;
				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);
				}
			}
		} while (sair);
		Score = Score + 1;
		Cafeh = Cafeh + 1;
		return Score;
	}

	// Desafio
	public static int DesafioDoWhile() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		boolean sair = true;
		String alternativa;

		System.out.println("\nQual a principal diferenca entre os laços de repeticao WHILE e DO WHILE ?");

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
					System.out.println("A) " + Lista.get(i));
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
			alternativa = entrada.next();
			int n = 0;

			switch (alternativa) {

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
				System.out.println("�ssa n�o � uma alternativa v�lida");
				break;
			}
			if (Lista.get(n).equals("WHILE primeiro avalia a condicional, se for verdadeiro ele executa o codigo.")) {

				System.out.println("Resposta certa, parab�ns!!");
				sair = false;
			} else {
				System.out.println("Resposta errada, tente novamente" + "Você só tem " + Cafeh + " cafés contigo");
				if (Cafeh > 1) {
					Cafeh = Cafeh - 1;
					Score = Score - 1;

				} else {
					Delay("\r\nGAME OVER - acabou o café...", TimeUnit.MILLISECONDS, temp_dialog);
					System.exit(0);
				}
			}

		} while (sair);

		Score = Score + 1;
		Cafeh = Cafeh + 1;
		return Score;
	}

	// Desafio
	static int DesafioIf() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		boolean sair = true;

		System.out.println("\nNa estrutura de decisão IF e ELSE, a expressão condicional deve estar dentro de:  ");

		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add(" ( ) parenteses "); // resposta correta
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
			String alternativa = entrada.next();
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
		Cafeh = Cafeh + 1;
		return Score;
	}

	

	// Este método é o responsavel para dar um "delay" nas messagens do jogo
	public static void Delay(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);

		}
	}
}