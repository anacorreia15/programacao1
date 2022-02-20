package ficha5;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int numeros [] = new int [10];
		int soma = 0; 
		double media = 0;

		for(int i = 0; i < numeros.length; i++) { //escrever no array
			System.out.println("Introduza um número: ");
			numeros[i] = read.nextInt();
		}

		for (int j = 0; j < numeros.length; j++) { //ler o array
			System.out.printf("%d ", numeros[j]);
			soma += numeros[j];
		}

		media = ((double) soma)/numeros.length;

		System.out.println(); //mudar de linha

		System.out.println("Soma: " + soma);
		System.out.printf("Média: %.1f ", media);

		read.close();
	}

}
