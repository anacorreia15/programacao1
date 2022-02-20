package ficha6;

import java.util.Scanner;

public class ex4 {

	static boolean eDigito (char caracter) {

		return caracter >= '0' && caracter <= '9';
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza um caracter: ");
		char ch = read.next().charAt(0);

		//digito algarismo entre 0 e 9
		System.out.printf("%c %s um digito", ch, eDigito(ch) ? "é" : "não é");

		read.close();
	}

}
