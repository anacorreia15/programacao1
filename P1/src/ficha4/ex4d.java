package ficha4;
import java.util.Scanner;

public class ex4d {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//RESOLVIDO COM DO-WHILE: forma mais adequada
		int num = 5;
		int soma = 0;
		
		do {
			System.out.printf("número? (zero termina)");
	 		num = input.nextInt();
	 		soma = soma+num;
	 		System.out.println("Soma: " + soma);
		} while(num != 0);
		
		/* RESOLVIDO COM FOR
		int soma = 0;
		for (int num = 5; num != 0; soma += num) {
			System.out.printf("número? (zero termina)");
			 num = input.nextInt();
			 System.out.println("Soma: " + soma);
		}
		*/
		
		/*	ORIGINAL - WHILE
		 * 	// converta este também para do .. while
			// será melhor?
			int num = 5;
			int soma = 0;
			while( num != 0 ) {
		 		System.out.printf("número? (zero termina)");
		 		num = input.nextInt();
		 		soma = soma+num;
		 		System.out.println("Soma: " + soma);
			}
		*/
		
		input.close();
	}

}
