package ficha3;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Indique um n�mero inteiro: ");

		int num1 = read.nextInt();

		if(num1 % 2 == 0) { // se o resto da divis�o for igual a 0 ent�o  numero � par
			System.out.println("O n�mero " + num1 + " � par!");
		} else {
			System.out.println("O n�mero " + num1 + " � �mpar!");
		}

		read.close();
	}

}
