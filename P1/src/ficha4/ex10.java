package ficha4;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza um n�mero: ");
		int num = read.nextInt();
		boolean primo=true;

		if(num > 0) {
			for(int i = 2; i < num; i++){ //1 n�o � primo
				if (num % i == 0) {
					primo = false;
					break;
				}	
			}
			if(primo) {
				System.out.println(num + " � primo");
			} else {
				System.out.println(num + " n�o � primo");
			}

		} else {
			System.out.println("N�mero inv�lido");
		}

		read.close();
	}
}
