package ifelse;

import java.util.Scanner;

//Objetivo do c�digo: o usu�rio  insere qualquer
//n�mero e ele imprime em ordem descrescente.

public class ifelse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Entre com o terceiro n�mero: ");
		int num3 = entrada.nextInt();
		
		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 � menor
			// num3 � maior
			// num1 < num2 <num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
			
		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// num1 � menor
			// num2 � maior
			// num1 < num3 <num2
			System.out.println(num2 + " - " + num3 + " - " + num1);
			
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			// num2 � menor
			// num3 � maior
			// num2 < num1 <num3
			System.out.println(num3 + " - " + num1 + " - " + num2);
			
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			// num2 � menor
			// num1 � maior
			// num2 < num3 <num1
			System.out.println(num1 + " - " + num3 + " - " + num2);
			
		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// num3 � menor
			// num2 � maior
			// num3 < num1 <num2
			System.out.println(num2 + " - " + num1 + " - " + num3);
			
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// num3 � menor
			// num1 � maior
			// num3 < num1 <num2
			System.out.println(num1+ " - " + num2 + " - " + num3);
		}
		
		entrada.close();
		
	}

}
