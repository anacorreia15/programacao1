package ficha4;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduza um número: ");
		int num = read.nextInt(), soma = 0;

		if (num >= 0) {
			for(int i = 1; i <= num; i++) {
				soma += i;			
			}
			System.out.println("Total: " + soma);
			System.out.println("Foram somados " + num + " números.");
		} else {
			System.out.println("Número inválido.");
		}

		read.close();
	}
}
