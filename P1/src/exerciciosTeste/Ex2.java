package exerciciosTeste;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza um n�mero: ");
		int numero = read.nextInt();

		if(numero > 0 && numero < 10) {
			System.out.println(numero + " est� dentro do intervalo [0,10]");
		} else if (numero == 0 || numero == 10) {
			System.out.println(numero + " � o limite/ fronteira do intervalo" );
		} else {
			System.out.println(numero + " est� fora do intervalo [0,10]");
		}

		read.close();
	}

}
