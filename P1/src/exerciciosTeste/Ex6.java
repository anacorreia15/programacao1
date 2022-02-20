package exerciciosTeste;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza o número de estrelas: ");
		int num = read.nextInt();

		if(num > 0) { 
			for(int i = 0; i < num; i++) { 
				for(int j = num; j > i; j--) {
					System.out.print("*");	
				}
				System.out.println();
			}
		} else {
			System.out.println("O número inserido é inválido");
		}
		read.close();
	}

}
