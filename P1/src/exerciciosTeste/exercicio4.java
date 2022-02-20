package exerciciosTeste;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		char caracter = ' ';
		int algarismo = 0, letra = 0, outroChar = 0;

		do{
			System.out.println("Introduza um caracter: ");
			caracter = read.next().charAt(0);

			if(caracter >= 'A' && caracter <= 'z' ){
				letra++;
			} else if (caracter >= '0' && caracter <= '9') {
				algarismo++;

			} else {
				outroChar++;
			}		

		} while(caracter != '.');

		System.out.println("Nº Letras: " + letra);
		System.out.println("Nº Algarismos: " + algarismo);
		System.out.println("Nº Outros caracteres: " + outroChar);

		read.close();

	}

}
