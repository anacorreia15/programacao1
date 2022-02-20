package ficha5;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int numeros [] = new int [10];
		int soma = 0; 
		double media = 0;

		int i = 0;		
		for(i=0; i<numeros.length; i++) {
			System.out.println("Introduza um número (0 para terminar): ");
			numeros[i] = read.nextInt();

			if(numeros[i] == 0) { //se o numero for 0 sai do ciclo
				break;
			}		
		}

		System.out.printf("Números: ");
		for (int j = 0; j < i; j++) { //ler o array
			System.out.printf("%d ", numeros[j]);
			soma += numeros[j];
		}

		media = ((double) soma)/i;

		System.out.println(); //mudar de linha

		System.out.println("Soma: " + soma);
		System.out.printf("Média: %.1f ", media);

		read.close();	
	}

}
