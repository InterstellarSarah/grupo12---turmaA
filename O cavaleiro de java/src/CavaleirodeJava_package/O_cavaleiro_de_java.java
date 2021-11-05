package CavaleirodeJava_package;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
				+ "Velho Barbudo: N�o h� tempo para explicar, voc� precisa salvar o mundo", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.print("\n 1- Quem � voc�? \n 2- Oque esta acontecendo?! \n 3- Tabom :)");
		seleciona = entrada.nextInt();
		if(seleciona == 3) {
			Delay("Velho barbudo: Estou surpreso de voc� n�o me pergutar nada... \n enfim, s� voc� pode usar sua magia e resolver esse "
					+ "enigma para fechar essa fissura", TimeUnit.MILLISECONDS, temp_dialog);
		}
		//Aqui � aonde se inicia com o primeiro desafio
		
	}
	
	//Este m�todo � o responsavel para dar um "delay" nas messagens do jogo
	public static void Delay(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }
        }
}

