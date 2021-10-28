package ficha3;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Indique um caracter: ");

		char caracter = read.next().charAt(0);
		int dif ='a'-'A';

		if(caracter >= 'A'  && caracter <= 'Z' ) {
			System.out.printf("O caracter '%c' é uma letra maiúscula. \n", caracter);
			System.out.println("Letra Minúscula: " + (caracter+= dif));
		} else if (caracter >= 'a' && caracter <= 'z') {
			System.out.printf("O caracter '%c' é uma letra minúscula. \n", caracter);
			System.out.println("Letra Maiúscula: " + (caracter-= dif));
		} else {
			System.out.printf("O caracter '%c' não é uma letra. \n", caracter);
		}

		read.close();
	}

}
