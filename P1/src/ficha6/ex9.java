package ficha6;

import java.util.Scanner;

public class ex9 {

	static void leArray(int [] a) {
		Scanner read = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.printf("Introduza um valor para a posicao [%d]:", i);
			a[i]=read.nextInt();
		}
	}

	static void imprimeArray (int [] a, int indice1, int indice2) {
		for (int i = indice1; i < indice2; i++) {
			System.out.printf("a[%d] = %d\n",i,a[i]);
		}
	}

	public static void main(String[] args) {

		int [] arrayNums = new int [10];

		leArray(arrayNums);

		imprimeArray(arrayNums, 4, 8);
	}

}
