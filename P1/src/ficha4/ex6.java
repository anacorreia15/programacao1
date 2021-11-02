package ficha4;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		char caracter= ' ';
		
		while(caracter != '.') {
			System.out.println("Introduza um caracter: ");
			caracter = read.next().charAt(0);
			
			if((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z')) {
				System.out.println(caracter);
			} else {
				System.out.println(caracter + " não é uma letra.");
			}
		}
		
		read.close();
	}
}
