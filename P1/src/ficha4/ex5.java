package ficha4;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza o n�mero de estrelas: ");
		int num = read.nextInt();

		if(num > 0) { //verifica se o n�mero � positivo
			for(int i = 0; i < num; i++) { // i � o iterador do ciclo
				System.out.printf("*");	//enquanto o i for menor que o n� introduzido pelo utilizador, 
			}							//� feito print da estrela
		} else {
			System.out.println("O n�mero inserido � inv�lido");
		}
			read.close();
		}

	}
