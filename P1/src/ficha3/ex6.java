package ficha3;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Indique um caracter: ");

		char caracter = read.next().charAt(0);
		int dif ='a'-'A';

		if(caracter >= 'A'  && caracter <= 'Z' ) {
			System.out.printf("O caracter '%c' � uma letra mai�scula. \n", caracter);
			System.out.println("Letra Min�scula: " + (caracter+= dif));
		} else if (caracter >= 'a' && caracter <= 'z') {
			System.out.printf("O caracter '%c' � uma letra min�scula. \n", caracter);
			System.out.println("Letra Mai�scula: " + (caracter-= dif));
		} else {
			System.out.printf("O caracter '%c' n�o � uma letra. \n", caracter);
		}

		read.close();
	}

}
