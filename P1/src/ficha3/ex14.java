package ficha3;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float a, b, c, delta, sqrtDelta, raiz1, raiz2, parteReal, parteImaginaria;

		System.out.println("Indique os coeficientes de uma equação do tipo 'ax² + bx + c': ");
		System.out.printf("a: ");
		a = read.nextFloat();
		System.out.printf("b: ");
		b = read.nextFloat();
		System.out.printf("c: ");
		c = read.nextFloat();

		if (a == 0) { //verifica se é uma equação de 2º grau
			System.out.println("Coefiente 'a' inválido.");
		} else {
			System.out.printf("Equação: %.0fx² + %.0fx + %.0f\n", a, b, c);

			delta = (b*b) - (4*a*c);
			sqrtDelta = (float)Math.sqrt(delta); //cast float

			if (delta > 0) { //delta > 0: resulta 2 raizes reais
				raiz1 = (-b + sqrtDelta) / 2*a;
				raiz2 = (-b - sqrtDelta) / 2*a;

				System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
			} else if (delta == 0) { //se delta for 0 só resulta numa raiz real
				raiz1 = -b / 2*a;

				System.out.printf("Raíz: %.2f", raiz1);
			} else { //delta < 0: a equação resulta 2 raizes imaginarias
				delta = -delta;
				sqrtDelta = (float)Math.sqrt(delta);
				parteReal = (-b)/(2*a);
				parteImaginaria = (sqrtDelta)/(2*a);
				
				System.out.printf("Raíz 1: %.2f + %.2fi\n", parteReal, parteImaginaria);
				System.out.printf("Raíz 2: %.2f - %.2fi\n", parteReal, parteImaginaria);
			}
		}
		read.close();
	}
}
