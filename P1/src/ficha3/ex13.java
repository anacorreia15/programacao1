package ficha3;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Indique os coeficientes de uma equa��o: ");
		System.out.printf("a: ");
		int a = read.nextInt();
		System.out.printf("b: ");
		int b = read.nextInt();
		System.out.printf("c: ");
		int c = read.nextInt();
		
		System.out.printf("Equa��o: %dx^2 + %dx + %d\n", a, b, c);
		
		int delta = (b*b) - (4*a*c);
		
		if (delta >= 0) {
			System.out.println("Valor de Delta: " + delta);
			System.out.println("N� de raizes: 2");
		} else {
			System.out.println("O delta � um valor negativo.");
		}
		
		read.close();
	}

}
