package ficha3;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Indique um caracter: ");

		char caracter = read.next().charAt(0);

		if(caracter >= 'A'  && caracter <= 'Z' ) {
			System.out.printf("O caracter '%c' � uma letra mai�scula. \n", caracter);
			System.out.println("Letra Min�scula: " + (caracter+= 32));
		} else if (caracter >= 'a' && caracter <= 'z') {
			System.out.printf("O caracter '%c' � uma letra min�scula. \n", caracter);
			System.out.println("Letra Mai�scula: " + (caracter-= 32));
		} else {
			System.out.printf("O caracter '%c' n�o � uma letra. \n", caracter);
		}

		read.close();
	}

}
