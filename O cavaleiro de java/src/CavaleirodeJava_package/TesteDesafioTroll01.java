package CavaleirodeJava_package;

public class TesteDesafioTroll01 extends O_cavaleiro_de_java {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("A alternativa correta � 'Int A = 98, B = 99, C = 98,D = 102'");
		System.out.println("O retorno do m�todo � o int 'DesafioDoTroll01' iniciado em 0, \nvalor esperado para validar seria '1' ja que se \nobtem 1 ponto a cada resposta certa\n\n");
		int resultado = O_cavaleiro_de_java.DesafioDoTroll01();
		
		if (resultado==1) {
			System.out.println("\n\nO teste 1 foi um sucesso!!");
		} else {
			System.out.println("\n\nO teste 1 falhou, DesafioDoTroll01 atingiu o valor de: "+resultado);
		}
		
		System.out.println("A alternativa correta � 'Sim'");
		System.out.println("O retorno do m�todo � o int 'Score' iniciado em 1, porque \nno desafio 1 iniciar em 0 e incrementa 1 se acertar o valor\nesperado para validar seria '1' ja que se \nobtem 1 ponto a cada resposta certa.\nA variável DesafioTroll01 é incrementada mas não é o retorno desse metodo\n");
		int resultado02 = O_cavaleiro_de_java.DesafioDoTroll02();
		
		if (resultado02==2) {
			System.out.println("\n\nO teste 2 foi um sucesso!!");
		} else {
			System.out.println("\n\nO teste 2 falhou. Seu score atual �: "+resultado02);
		}

	}

}
