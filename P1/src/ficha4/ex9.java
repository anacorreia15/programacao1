package ficha4;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza um número: ");
		int num = read.nextInt();
		int fatorial = 1; //variavel que guarda o resultado do fatorial

		if(num >= 0) {
			for(int i = 2; i <= num; i++){ //i=2 porque multiplicar por 1 é sempre 1
				fatorial *= i;
			}
			System.out.println("Fatorial: " + fatorial);
		} else {
			System.out.println("Não existe fatorial de números negativos.");
		}
		read.close();
	}
}
