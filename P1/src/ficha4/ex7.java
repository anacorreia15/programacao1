package ficha4;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduza um n�mero: ");
		int numLimite = read.nextInt(), soma = 0;

		if (numLimite >= 0) {
			int i = 1; //controlador 
			while(soma <= numLimite) {
				soma += i;
				i++; //o � incrementado uma vez a mais (logo o numero de numeros somados � i-1)
			}
			System.out.println("Total: " + soma);
			System.out.println("Foram somados " + (i-1) + " n�meros.");
		} else {
			System.out.println("N�mero inv�lido.");
		}

		read.close();
	}
}
