package ficha3;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float a, b, c, delta;

		System.out.println("Indique os coeficientes de uma equa��o do tipo 'ax� + bx + c': ");
		System.out.printf("a: ");
		a = read.nextFloat();
		System.out.printf("b: ");
		b = read.nextFloat();
		System.out.printf("c: ");
		c = read.nextFloat();

		if (a == 0) {
			System.out.println("Coefiente 'a' inv�lido.");
		} else {
			System.out.printf("Equa��o: %.0fx� + %.0fx + %.0f = 0\n", a, b, c);

			delta = (b*b) - (4*a*c);

			if (delta > 0) {
				System.out.println("Delta = " + delta);
				System.out.println("N� de raizes reais: 2");
			} else if (delta == 0) {
				System.out.println("Delta = " + delta);
				System.out.println("N� de raizes reais: 1 ");
			} else {
				System.out.println("Delta = " + delta);
				System.out.println("N� de raizes reais: 0 ");
			}
		}		
		read.close();
	}

}
