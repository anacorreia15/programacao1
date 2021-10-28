package ficha3;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float a, b, c, delta, sqrtDelta, raiz1, raiz2, parteReal, parteImaginaria;

		System.out.println("Indique os coeficientes de uma equa��o do tipo 'ax� + bx + c': ");
		System.out.printf("a: ");
		a = read.nextFloat();
		System.out.printf("b: ");
		b = read.nextFloat();
		System.out.printf("c: ");
		c = read.nextFloat();

		if (a == 0) { //verifica se � uma equa��o de 2� grau
			System.out.println("Coefiente 'a' inv�lido.");
		} else {
			System.out.printf("Equa��o: %.0fx� + %.0fx + %.0f\n", a, b, c);

			delta = (b*b) - (4*a*c);
			sqrtDelta = (float)Math.sqrt(delta); //cast float

			if (delta > 0) { //delta > 0: resulta 2 raizes reais
				raiz1 = (-b + sqrtDelta) / 2*a;
				raiz2 = (-b - sqrtDelta) / 2*a;

				System.out.printf("Ra�zes: %.2f e %.2f", raiz1, raiz2);
			} else if (delta == 0) { //se delta for 0 s� resulta numa raiz real
				raiz1 = -b / 2*a;

				System.out.printf("Ra�z: %.2f", raiz1);
			} else { //delta < 0: a equa��o resulta 2 raizes imaginarias
				delta = -delta;
				sqrtDelta = (float)Math.sqrt(delta);
				parteReal = (-b)/(2*a);
				parteImaginaria = (sqrtDelta)/(2*a);
				
				System.out.printf("Ra�z 1: %.2f + %.2fi\n", parteReal, parteImaginaria);
				System.out.printf("Ra�z 2: %.2f - %.2fi\n", parteReal, parteImaginaria);
			}
		}
		read.close();
	}
}
