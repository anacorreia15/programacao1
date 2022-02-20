package ficha6;

import java.util.Scanner;

public class ex8 {

	static int calculaPotencia (int base, int potencia) {
		int resultado = 1;
		for(int i = 1; i <= potencia; i++) { 
			resultado *= base;
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza dois números: \nNúmero 1: ");
		int base = read.nextInt();
		System.out.println("Número 2: ");
		int potencia = read.nextInt();

		System.out.printf("%d^%d = %d", base, potencia, calculaPotencia(base, potencia));
		read.close();
	}

}
