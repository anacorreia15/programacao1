package ficha3;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Indique um ano: ");
		int ano = read.nextInt();

		if((ano%400 == 0) || ((ano%4 == 0) && (ano%100 != 0))) {
			System.out.println("O ano " + ano + " é bissexto.");
		} else {
			System.out.println("O ano " + ano + " é comum.");
		}

		read.close();
	}

}
