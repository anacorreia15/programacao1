package ficha4;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int num;

		do {
			System.out.println("Introduza um número inteiro: ");
			num = read.nextInt();

			if(num >= 0) { //verifica se o número é positivo
				for(int i = 0; i < num; i++) { // i é o iterador do ciclo
					System.out.printf("*");	//enquanto o i for menor que o nº introduzido pelo utilizador, 
				}							//é feito print da estrela
			} else {
				System.out.println("O número inserido é inválido");
			}
			System.out.println(); //serve para mudar de linha
		} while(num != 0);

		read.close();

	}

}
