package exerciciosTeste;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		char caracter1 = ' ', caracter2 =' ';
		int distancia = 0;

		do {
			System.out.println("Introduza dois caracteres:\nCaracter 1: ");
			caracter1 = read.next().charAt(0);
			System.out.println("Caracter 2: ");
			caracter2 = read.next().charAt(0);

			if(caracter1 > caracter2) {
				distancia = caracter1-caracter2;
			} else {
				distancia = caracter2-caracter1;
			}

			System.out.println("Distância: " + distancia);

		} while(caracter1 != caracter2);

		read.close();
	}

}
