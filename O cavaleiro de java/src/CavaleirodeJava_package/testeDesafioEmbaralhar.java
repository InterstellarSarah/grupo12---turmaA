package CavaleirodeJava_package;

public class testeDesafioEmbaralhar {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("A alternativa correta é 'Shuffle'");
		System.out.println("O retorno do método é o int 'Score' iniciado em 0, \nvalor esperado para validar seria '1' ja que se \nobtem 1 ponto a cada resposta certa\n\n");
		int resultado = O_cavaleiro_de_java.df_ShuffleRpg();
		
		if (resultado==1) {
			System.out.println("O teste foi um sucesso!!");
		} else {
			System.out.println("Teste falhou, Score atingiu o valor de: "+resultado);
		}

	}

}
