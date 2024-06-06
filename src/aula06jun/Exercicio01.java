package aula06jun;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		x = sc.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		y = sc.nextInt();
		if( x >= y) {
			System.out.println("O intervalo é inválido");
			
		}
		else {
			for(int i = x; i<y; i++ ) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " É multiplo de 3 e 5 ");
				}
				
				
			}
			
		}
		
		
		

	}

}
