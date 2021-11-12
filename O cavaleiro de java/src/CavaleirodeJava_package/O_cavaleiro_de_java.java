package CavaleirodeJava_package;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Collections;

public class O_cavaleiro_de_java {
	//Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 vari�veis para 0;
	static int temp_dialog = 5, temp_narrativa = 150, temp_transicao = 25; 
	
	//O menu do jogo
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		String seleciona;
		int sair = 0;
		do {
		Delay("\nO Cavaleiro de Java\n", TimeUnit.MILLISECONDS, temp_transicao);
		System.out.println("\nA- Jogar \nB- Instru��o \nC- Cr�ditos \nD- Sair");
		
		seleciona = entrada.next();
		
		switch (seleciona){
			case "a":
			case "A":
				jogo();
		        break;
			case "b":
			case "B":
				Delay("Para desfrutar da gameplay dessa aventura, \n"
						+ "digite as op��es que lhe foi apresentado na tela\n", TimeUnit.MILLISECONDS,temp_transicao );
				break;
			case "c":
		    case "C":
		    	System.out.println("O Cavaleiro de java");
		    	System.out.println("Grupo 12");
		    	System.out.println("Integrantes: "); System.out.println("        ");
		    	System.out.println("Eduardo Ramos \nJos� Guerra \nRafael Almeida \nSarah Rodrigu�s \nSamuel Colina \n");
		    	break;
		    	
			case "d":
			case "D":
				Delay("Voc� deseja mesmo sair?", TimeUnit.MILLISECONDS, temp_transicao);
				System.out.println("\nS / N");
			seleciona = entrada.next();	
			
			if(seleciona.equals("S") || seleciona.equals("s")) {
				Delay("At� um outro dia", TimeUnit.MILLISECONDS, temp_dialog);
			sair++;
			}
		    break;
			default:
				System.out.println("Por favor, selecione uma op��o valida");
				break;
		}
		}while(sair == 0);
	}
   //Aqui � aonde o jogo todo se passa
	public static void jogo()throws Exception{
	    Scanner entrada = new Scanner(System.in);
	    int seleciona;
	
	    
	    
	    //esse trecho a seguir � apenas um prot�tipo de como vai funcionar o jogo, ainda n�o foi adicionado nenhum desafio nele
		Delay("Voc� acorda com um homem muito velho e barbudo te levantando e gritando\n"
				+ "Velho Barbudo: N�o h� tempo para explicar, voc� precisa fechar essa fissura", TimeUnit.MILLISECONDS, temp_dialog);
		do {
		System.out.print("\n 1- Quem � voc�? \n 2- Oque esta acontecendo?! \n 3- Eu n�o sei como fechala \n 4- Irei fechala");
		seleciona = entrada.nextInt();
		if(seleciona == 1) {
			Delay("Velho barbudo: Como eu disse, n�o a tempo para explicar!, feche essa fissura", TimeUnit.MILLISECONDS, temp_dialog);
		}
		
		if(seleciona == 2) {
			Delay("Velho barbudo: Se esta fissura n�o for fechada, n�s iremos morrer aqui, e s� voc� pode fechala\n ent�o se apresse", TimeUnit.MILLISECONDS, temp_dialog);
		}
		
		if(seleciona == 3) {
			Delay("Velho barbudo: Concentre-se apenas na l�gica, pois voc� j� possui a for�a", TimeUnit.MILLISECONDS, temp_dialog);
		}
		
		
		}while(seleciona != 4);
		//Aqui � aonde se inicia com o primeiro desafio
		df_SCrpg();
		
		Delay("A fissura se fecha, mas � possivel se escutar uma voz\n ??? : Maldito seja!!, os magos iram conhecer toda agonia deste mundo", TimeUnit.MILLISECONDS, temp_dialog);
		Delay("\nVelho Barbudo: Seja quem for devemos impedir que venha para nosso mundo, enfim, venha comigo, irei leva-lo para o seu proximo destino", TimeUnit.MILLISECONDS, temp_dialog);
		Delay("\nVelho Barbudo: Bem-Vindo a cidade do pico da montanha, aqui antes era apenas uma parada, mas varias pessoas come�aram\n  "
				+ " aparecer neste lugal para resolver a crise com os drag�es, enfim, h� muito oque fazer para impedir os drag�es\n "
				+ " boa sorte \n ... \n a pr�posito, meu nome � ********* ", TimeUnit.MILLISECONDS, temp_dialog);
		Parte_central();
		
	}
	
	public static void Parte_central() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;
		
		System.out.println("\n Para onde ir agora?\n  \n 1- Oeste \n 2- Leste");
		decicao = entrada.nextInt();
		
		switch(decicao) {
		case 1:
			Parte_Oeste();
			break;
		case 2: Parte_Leste();
			break;
		}
	}
	
	public static void Parte_Oeste() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int decicao;
		String decicao_definitivo;
		System.out.println("\nParte Oeste da cidade: Esta parte esta em peda�os, mas h� um grupo de pessoas reunida discutindo algo aparentemente s�rio\n"
				+ " 1- Ir para o centro da cidade \n 2- Perguntar as pessoas o que esta acontecendo ");
		decicao = entrada.nextInt();
		switch(decicao) {
		case 1:
			Parte_central();
			break;
		case 2:
			Delay("Figurante Gen�rico: Existe um drag�o que traiu sua ra�a, seu nome � sif e ele vive isolado dentro de uma caverna\n"
					+ " ao noroeste daqui, estamos decidim quem ira confronta-lo", TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("\n1- Por que um drag�o trairia sua pr�pria ra�a? \n2- por que n�o vamos todos juntos? \n"
					+ "3- Eu irei visita-lo");
			
		    decicao = entrada.nextInt();
		    switch(decicao) {
		    case 1:
		    	
		    	break;
		    case 2:
		    	Delay("Temos que estar aqui para contra-atacar caso os drag�es nos ataquem, n�o podemos ir todos juntos", TimeUnit.MILLISECONDS, temp_dialog);
		    	break;
		    case 3:
		    	Delay("voc� esta certo disto?, esta provavelmente � uma jornada sem volta", TimeUnit.MILLISECONDS, temp_dialog);
		    	System.out.print("\n1- Sim \n2- N�o ");
		    	decicao = entrada.nextInt();
		    	
		    	if(decicao == 1) {
		    		Reta_final();
		    	}else {
		    		Delay("Ainda n�o estou pronto", TimeUnit.MILLISECONDS, temp_dialog);
		    		Parte_Oeste();
		    	}
		    	break;
		    }
		   
			break;
		}
	}
	
	public static void Parte_Leste() {
		Scanner entrada = new Scanner(System.in);
		int decicao;
		System.out.println("Parte Leste da cidade: Parece que � aqui aonde os aventureiros vem para reabastecer seus suprimentos \n"
				+ " h� uma loja e um  , ");
		
	}
	
	public static void Reta_final() {
		System.out.println("RETA FINAL");
	}
	
	public static void df_ShuffleRpg() {
		Scanner entrada = new Scanner(System.in);
		String alt;
		boolean sair = true;
		
		
			System.out.printf("	Existe no java uma fun��o para embaralhar conte�dos e cole��es. Qual o nome da express�o?\n ");
		
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
				System.out.println("Escolha inv�lida!");
		}
			if(lista.get(n).equals("Math.Random;")){ //compara a resposta com a alternativa
				System.out.println("Resposta correta! :D");
				sair = false;
			}else {
				System.out.println("Resposta incorreta! D:");
			}
			
		} while(sair);
		
	}
	
	public static void df_SCrpg() {
		Scanner entrada = new Scanner(System.in);
		String alt;
		boolean sair = true;
		
		
			System.out.printf("Quais express�es no switch s�o opcionais? \n ");
		
			ArrayList<String> lista = new ArrayList<String>();
				lista.add("Break e Default;");  // resposta correta
				lista.add("Case e Break;");
				lista.add("Else e Case;");
				lista.add("Default e While;");
				lista.add("While e Else;");
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
						break;
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
				System.out.println("Escolha inv�lida!");
		}
			if(lista.get(n).equals("Break e Default;")){ //compara a resposta com a alternativa
				System.out.println("Resposta correta! :D");
				sair = false;
			}else {
				System.out.println("Resposta incorreta! D:");
			}
			
		} while(sair);
	}
		
	public static void DesafioArray() {
		
		
		
	}
	
	public static void DesafioFor() {
		
		
		
	}
	
	//Este m�todo � o responsavel para dar um "delay" nas messagens do jogo
	public static void Delay(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }
        }
}

