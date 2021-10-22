package ficha3;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Introduza um número: ");

		int num1 = read.nextInt();
		int modulo = 0;

		if(num1 < 0) {
			modulo = -num1;	
		} else {
			modulo = num1;
		}

		System.out.println("|" + num1 + "|=" + modulo);

		read.close();
	}

}
