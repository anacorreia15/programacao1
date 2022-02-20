package ficha6;

import java.util.Scanner;

public class ex5 {

	static boolean eBissexto (int ano) {

		return (ano%400 == 0) || ((ano%4 == 0) && (ano%100 != 0));
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza um ano: ");
		int ano = read.nextInt();

		System.out.printf("%d é um ano %s", ano, eBissexto(ano) ? "bissexto" : "comum");

		read.close();
	}

}
