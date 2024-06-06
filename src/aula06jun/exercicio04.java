package aula06jun;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		int soma = 0, x = 0;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite um valor: ");
			x = sc.nextInt();
			if (x > 0) {
				soma = soma + x;

			}
		} while (x != 0);
		System.out.println("A soma dos numeros positivos é: "+soma);
	}

}
