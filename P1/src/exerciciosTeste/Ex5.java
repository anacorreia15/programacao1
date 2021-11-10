package exerciciosTeste;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int n = 0; //variavél que representa o lado do quadrado

		System.out.println("Introduza um valor: ");
		n = read.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (i % (n-1) == 0 || j % (n-1) == 0 ) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}	
			System.out.println();
		}

		read.close();
	}

}
