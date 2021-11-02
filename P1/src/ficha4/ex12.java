package ficha4;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		char char1, char2;

		do {
			System.out.println("Introduza dois caracteres:\nCaracter 1: ");
			char1 = read.next().charAt(0);
			System.out.println("Caracter 2: ");
			char2 = read.next().charAt(0);

			if(char1 >= 'a' && char2 <= 'z') {
				if(char1 < char2) {
					for(int i = char1; i <= char2; i++) {
						System.out.printf("%c",i); //imprimir inteiro como caracter %c
					}
				} else {
					for(int j = char1; j >= char2; j--) {
						System.out.printf("%c",j); //imprimir inteiro como caracter %c
					}
				}
			} else {
				System.out.println("Pelo menos um dos carateres introduzidos não é uma letra minúscula.");
			}
			System.out.println(); //fazer mudança de linha

		} while ((char1 != '.') && (char2 != '.'));

		read.close();
	}

}
