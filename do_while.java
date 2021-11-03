package do_while;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		boolean infoValida = false;
		String nome, sexo, armadura;
		int idade;
		double forca;

		do {
			System.out.println("Entre com o nome do seu Guerreiro(a): ");
			nome = entrada.next();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome do Guerreiro precisa de no mininmo 3 caracteres ");
			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Entre com a idade do seu Guerreiro(a): ");
			idade = entrada.nextInt();

			if (idade >= 15 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("A Idade do Guerreiro tem que estar entre 15 a 150 anos ");
			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Entre com o nivel de força do seu Guerreiro(a): ");
			System.out.println("Observação: Quanto mais força seu Guerreiro(a) tem, menos habilidade e terá");
			forca = entrada.nextDouble();

			if (forca > 0) {
				infoValida = true;
			} else {
				System.out.println("A Força do Guerreiro tem ser maior que 0. ");
			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Escolha entre uma Guerreira e um Guerreiro: ");
			sexo = entrada.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("O sexo do Guerreiro(a) precisa ser 'f' ou 'm' :");
			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Escolha a cor da armadura do seru Guerreiro(a): ");
			System.out.println("A: Azul ");
			System.out.println("R: Rosa ");
			System.out.println("V: Verde ");
			System.out.println("P: Preto ");
			armadura = entrada.next();

			if (armadura.equalsIgnoreCase("A") || armadura.equalsIgnoreCase("R") || armadura.equalsIgnoreCase("V")
					|| armadura.equalsIgnoreCase("P")) {
				infoValida = true;
			} else {
				System.out.println("O sexo do Guerreiro(a) precisa ser 'A', 'R', 'V', ou 'P' :");
			}

		} while (!infoValida);

		System.out.println("O seu Guerreiro(a) tem as seguintes características: ");

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Força: " + forca);
		System.out.println("Sexo: " + sexo);
		System.out.println("Armadura: " + armadura);

		entrada.close();
	}

}
