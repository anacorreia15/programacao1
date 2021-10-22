package ficha3;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Indique um número inteiro: ");

		int num1 = read.nextInt();

		if(num1 % 2 == 0) { // se o resto da divisão for igual a 0 então  numero é par
			System.out.println("O número " + num1 + " é par!");
		} else {
			System.out.println("O número " + num1 + " é ímpar!");
		}

		read.close();
	}

}
