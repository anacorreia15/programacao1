package exerciciosTeste;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int num1 = 0, num2 = 0, soma = 0;


		System.out.println("Introduza dois n�meros:\nN�mero 1: ");
		num1 = read.nextInt();
		System.out.println("N�mero 2: ");
		num2 = read.nextInt();

		if(num1 <= num2) {
			for(int i = num1; i <= num2; i++) {
				soma += i;

				if (i%5 == 0) {
					System.out.println(i + " � multiplo de 5");
				} 
			}
		} else {
			for(int i = num1; i >= num2; i--) {
				soma += i;

				if (i%5 == 0) {
					System.out.println(i + " � multiplo de 5");
				} 
			}
		}
		
		System.out.println("Total: " + soma);

		read.close();
	}

}
