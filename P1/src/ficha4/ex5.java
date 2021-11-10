package ficha4;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza o número de estrelas: ");
		int num = read.nextInt();

		if(num > 0) { //verifica se o número é positivo
			for(int i = 0; i < num; i++) { // i é o iterador do ciclo
				System.out.printf("*");	//enquanto o i for menor que o nº introduzido pelo utilizador, 
			}							//é feito print da estrela
		} else {
			System.out.println("O número inserido é inválido");
		}
			read.close();
		}

	}
