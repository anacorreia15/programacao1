package ficha3;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Indique o estado civil (utilizando a inicial da palavra): ");
		char estadoCivil = read.next().charAt(0);
		
		switch(estadoCivil) {
		case 'c':
		case 'C':
			System.out.println("Casado");
			break;
		case 'v': 
		case 'V':
			System.out.println("Víuvo");
			break;
		case 'u': 
		case 'U':
			System.out.println("União de Facto");
			break;
		case 's': 
		case 'S':
			System.out.println("Solteiro");
			break;
		case 'd': 
		case 'D':
			System.out.println("Divorciado");
			break;
		default : System.out.println("Caracter inválido!");
		}
		read.close();
	}
}
