package ficha4;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int num1, num2, res = 0;

		System.out.println("Introduza dois números inteiros: ");
		num1 = read.nextInt();
		num2 = read.nextInt();

		if (num1 > 0 && num2 > 0) {
			for (int i = 0; i < num2; i++) { //o num1 é somado a ele proprio num2 vezes
				res += num1;
			}
			System.out.println(num1 + "*" + num2 + "=5" + res);
		} else {
			System.out.println("Números inválidos.");
		}

		read.close();
	}

}
