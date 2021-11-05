package CavaleirodeJava_package;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class O_cavaleiro_de_java {
	//Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 variáveis para 0;
	static int temp_dialog =70, temp_narrativa = 150, temp_transicao = 25; 
	
	//O menu do jogo
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		String seleciona;
		int sair = 0;
		do {
		Delay("\nO Cavaleiro de Java\n", TimeUnit.MILLISECONDS, temp_transicao);
		System.out.println("\nA- Jogar \nB- Instrução \nC- Créditos \nD- Sair");
		
		seleciona = entrada.next();
		
		switch (seleciona){
			case "a":
			case "A":
				jogo();
		        break;
			case "b":
			case "B":
				Delay("Para desfrutar da gameplay dessa aventura, \n"
						+ "digite as opções que lhe foi apresentado na tela\n", TimeUnit.MILLISECONDS,temp_transicao );
				break;
			case "c":
		    case "C":
		    	System.out.println("O Cavaleiro de java");
		    	System.out.println("Grupo 12");
		    	System.out.println("Integrantes: "); System.out.println("        ");
		    	System.out.println("Eduardo Ramos \nJosé Guerra \nRafael Almeida \nSarah Rodriguês \nSamuel Colina \n");
		    	break;
		    	
			case "d":
			case "D":
				Delay("Você deseja mesmo sair?", TimeUnit.MILLISECONDS, temp_transicao);
				System.out.println("\nS / N");
			seleciona = entrada.next();	
			
			if(seleciona.equals("S") || seleciona.equals("s")) {
				Delay("Até um outro dia", TimeUnit.MILLISECONDS, temp_dialog);
			sair++;
			}
		    break;
			default:
				System.out.println("Por favor, selecione uma opção valida");
				break;
		}
		}while(sair == 0);
	}
   //Aqui é aonde o jogo todo se passa
	public static void jogo()throws Exception{
	    Scanner entrada = new Scanner(System.in);
	    int seleciona, cafezinho;
	    // Cafezinho = vida do personagem
	    cafezinho = 100;
	    
	    //esse trecho a seguir é apenas um protótipo de como vai funcionar o jogo, ainda não foi adicionado nenhum desafio nele
		Delay("Você acorda com um homem muito velho e barbudo te levantando e gritando\n"
				+ "Velho Barbudo: Não há tempo para explicar, você precisa salvar o mundo", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.print("\n 1- Quem é você? \n 2- Oque esta acontecendo?! \n 3- Tabom :)");
		seleciona = entrada.nextInt();
		if(seleciona == 3) {
			Delay("Velho barbudo: Estou surpreso de você não me pergutar nada... \n enfim, só você pode usar sua magia e resolver esse "
					+ "enigma para fechar essa fissura", TimeUnit.MILLISECONDS, temp_dialog);
		}
		//Aqui é aonde se inicia com o primeiro desafio
		
	}
	
	//Este método é o responsavel para dar um "delay" nas messagens do jogo
	public static void Delay(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }
        }
}

