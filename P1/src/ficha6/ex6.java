package ficha6;

import java.util.Scanner;

public class ex6 {

	static long devolveFatorial (int num) {
		int fatorial = 1; //fatorial de 0 � 1
		for(int i = 2; i <= num; i++){ //i=2 porque multiplicar por 1 � sempre 1
			fatorial *= i;
		}
		return fatorial;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza um n�mero: ");
		int num = read.nextInt();

		if(num >= 0) {
			System.out.printf("Fatorial: %d! = %d", num, devolveFatorial(num));
		} else {
			System.out.println("N�o existe fatorial de n�meros negativos.");
		}
		
		read.close();

	}

}
