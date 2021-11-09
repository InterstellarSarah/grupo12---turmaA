package CavaleirodeJava_package;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Collections;

public class O_cavaleiro_de_java {
	//Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 vari�veis para 0;
	static int temp_dialog =70, temp_narrativa = 150, temp_transicao = 25; 
	
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
	    int seleciona, cafezinho;
	    // Cafezinho = vida do personagem
	    cafezinho = 100;
	    
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
		
		
			System.out.printf("\nQuais express�es no switch s�o opcionais? \n ");
		
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
	
	
	//Este m�todo � o responsavel para dar um "delay" nas messagens do jogo
	public static void Delay(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }
        }
}

