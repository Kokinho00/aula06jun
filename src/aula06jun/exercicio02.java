package aula06jun;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		int par = 0, impar = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<11; i++ ) {
			System.out.println(" Digite o "+i+"º numero: ");
			int x = sc.nextInt();
			
			if(x % 2 == 0) {
				par = par+1;
			}
			else {
				impar++; 
			}
			}
		System.out.println("Total de números pares:"+par);
		System.out.println("total de números éimpares:"+impar);
	}

}
