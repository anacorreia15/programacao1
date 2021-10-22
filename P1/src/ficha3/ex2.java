package ficha3;
import java.util.Scanner; 

public class ex2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Introduza um número: ");

		int num1 = read.nextInt();

		if(num1 > 100) {
			num1 = 100;
			System.out.println("O valor foi truncado.");
		} else {
			System.out.println("Valor: " + num1);
		}

		read.close();

	}

}
