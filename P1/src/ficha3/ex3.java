package ficha3;
import java.util.Scanner;


public class ex3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Indique dois números inteiros: ");

		int num1, num2, num3;
		num1 = read.nextInt();
		num2 = read.nextInt();

		if (num1 < num2) {
			num3 = num2; //num3: variavel para guardar o valor de num2
			num2 = num1;
			num1 = num3;
			System.out.println("Número 1: " + num1);
			System.out.println("Número 2: " + num2);
		} else {
			System.out.println("Número 1: " + num1);
			System.out.println("Número 2: " + num2);
		}

		read.close();
	}

}
