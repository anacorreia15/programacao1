package exerciciosTeste;

import java.util.Scanner;

public class Ex5a {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		//se for um retangulo
		int altura = 0, comprimento = 0;

		System.out.println("Introduza um valor:\nAltura: ");
		altura = read.nextInt();
		System.out.println("Comprimento: ");
		comprimento = read.nextInt();

		for(int i = 0; i < altura; i++) {
			for(int j = 0; j < comprimento; j++) {
				if (i % (altura-1) == 0 || j % (comprimento-1) == 0 ) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}	
			System.out.println();
		}

		read.close();

	}

}
