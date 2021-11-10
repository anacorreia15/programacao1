package ficha4;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduza um número: ");
		int numLimite = read.nextInt(), soma = 0;

		if (numLimite >= 0) {
			int i = 1; //controlador 
			while(soma <= numLimite) {
				soma += i;
				i++; //o é incrementado uma vez a mais (logo o numero de numeros somados é i-1)
			}
			System.out.println("Total: " + soma);
			System.out.println("Foram somados " + (i-1) + " números.");
		} else {
			System.out.println("Número inválido.");
		}

		read.close();
	}
}
