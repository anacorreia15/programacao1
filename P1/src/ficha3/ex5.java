package ficha3;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Indique um número inteiro: ");

		double num1 = read.nextDouble();
		double raizQuadrada;

		if (num1 > 0) {
			raizQuadrada = Math.sqrt(num1);
			System.out.printf("Raiz quadrada de %.1f: %.3f \n",num1, raizQuadrada);
		} else {
			raizQuadrada = Math.sqrt(-num1);
			System.out.printf("Raiz quadrada de %.1f: %.2fi \n",num1, raizQuadrada);
		}

		read.close();
	}

}
