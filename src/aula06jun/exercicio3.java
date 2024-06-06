package aula06jun;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int velho = 0, x = 0, novo = 0;

		Scanner sc = new Scanner(System.in);
		while (x >= 0) {
			System.out.println("Digite uma idade:");
			x = sc.nextInt();

			if (x > 50) {
				velho++;
			} else if (x < 21) {
				novo++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos:" + novo);
		System.out.println("Total de pessoas maiores de 50 anos" + velho);

	}

}
