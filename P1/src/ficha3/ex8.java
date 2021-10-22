package ficha3;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Introduza um número: ");

		int num1 = read.nextInt();
		int modulo = num1 < 0?  -num1 : num1;
		
		System.out.println("|" + num1 + "|=" + modulo);
		
		read.close();
	}

}
