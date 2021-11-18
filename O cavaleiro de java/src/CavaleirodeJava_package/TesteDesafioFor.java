package CavaleirodeJava_package;

public class TesteDesafioFor extends O_cavaleiro_de_java {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("A alternativa correta é 'O uso de uma variavel contador com limite prÃ© definido'");
		System.out.println("O retorno do método é o int 'Score' iniciado em 0, \nvalor esperado para validar seria '1' ja que se \nobtem 1 ponto a cada resposta certa\n\n");
		int resultado = O_cavaleiro_de_java.DesafioFor();
		
		if (resultado==1) {
			System.out.println("\n\nO teste foi um sucesso!!");
		} else {
			System.out.println("\n\nO teste falhou, Score atingiu o valor de: "+resultado);
		}
		
	}
	

}
