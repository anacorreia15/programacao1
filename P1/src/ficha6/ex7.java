package ficha6;

import java.util.Scanner;

public class ex7 {

	static boolean ePrimo (int num) {
		for(int i = 2; i < num; i++){ //1 não é primo
			if (num % i == 0) {
				return false;
			}	
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza um número: ");
		int num = read.nextInt();

		System.out.printf("%d %s", num, ePrimo(num) ? "é primo" : "não é primo");

		read.close();
	}

}
